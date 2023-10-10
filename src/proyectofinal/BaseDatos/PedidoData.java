/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.BaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import proyectofinal.Tablas.Pedido;
import proyectofinal.Tablas.Producto;

/**
 *
 * @author Usuario
 */
public class PedidoData {

    private Connection con = null;

    public PedidoData() {
        con = Conexion.getConnection();
    }

    public void agregarPedido(Pedido pedido) {
        
        String sql = "INSERT INTO pedido (id_mesa, cantidad, importe, fechaYhora, estado) VALUES (?, ?, ?, ?, ? )";
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedido.getIdMesa());

            ps.setInt(2, pedido.getCantidad());
            ps.setDouble(3, pedido.getImporte());
            ps.setTimestamp(4, java.sql.Timestamp.valueOf(pedido.getFechaHora()));
            ps.setBoolean(5, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pedido.setIdPedido(1);
                JOptionPane.showMessageDialog(null, "Pedido registrado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ");
        }
    }

    public void modificarPedido(Pedido pedido) {

        String sql = "UPDATE pedido SET id_mesa= ? ,cantidad= ? ,importe= ? ,fechaYhora= ? ,estado= ? WHERE id_Pedido= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedido.getIdMesa());
            ps.setInt(3, pedido.getCantidad());
            ps.setDouble(4, pedido.getImporte());
            ps.setTimestamp(5, java.sql.Timestamp.valueOf(pedido.getFechaHora()));
            ps.setBoolean(6, pedido.isEstado());
            ps.setInt(7, pedido.getIdPedido());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Se modifico el Pedido ");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido ");

        }
    }

    public void eliminarPedido(int id) {
        try {
            String sql = "UPDATE pedido SET estado=0 WHERE id_Pedido=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            int elimino = ps.executeUpdate();

            if (elimino == 1) {

                JOptionPane.showMessageDialog(null, "Pedido Eliminado");

            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto");

        }
    }

    public double calcularSubtotalPedido(int idPedido) {

        double subtotal = 0.0;
        String sql = "SELECT p.cantidad, p.importe "
                + "FROM pedido p "
                + "WHERE p.id_Pedido = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int cantidad = rs.getInt("cantidad");
                double precioProducto = rs.getDouble("importe");
                subtotal += cantidad * precioProducto;
            }

            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al calcular el subtotal del pedido");
        }

        System.out.println("Subtotal del pedido " + idPedido + ": $" + subtotal);
        return subtotal;
    }
    
    public void agregarProducto() {

        
        }

    
    
    
    
    
    } 
    