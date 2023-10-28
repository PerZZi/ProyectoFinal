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
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
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

        String sql = "INSERT INTO pedido (NroMesa, importe, fechaYhora, estado) VALUES (?, ?, ?, ? )";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, pedido.getNroMesa());
            ps.setDouble(2, pedido.getImporte());
            ps.setTimestamp(3,  pedido.getFechaHora());
            ps.setBoolean(4, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int idGenerada = rs.getInt(1);
                pedido.setIdPedido(idGenerada);
                JOptionPane.showMessageDialog(null, "Pedido registrado con el número: "+ idGenerada);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla "+ ex);
        }
    }

    public void modificarPedido(Pedido pedido) {

        String sql = "UPDATE pedido SET NroMesa= ? ,importe= ? ,fechaYhora= ? ,estado= ? WHERE id_Pedido= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            ps.setInt(1, pedido.getNroMesa());
            ps.setDouble(2, pedido.getImporte());
            ps.setTimestamp(3, pedido.getFechaHora());
            ps.setBoolean(4, pedido.isEstado());
            

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Se modifico el Pedido ");

            }
            ps.close();
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
    
    public List<Pedido> listarPedidos() {

        String sql = "SELECT id_Pedido, NroMesa, importe, fechaYhora, estado FROM pedido;";

        ArrayList<Pedido> pedidos = new ArrayList<>();
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("id_Pedido"));
                pedido.setNroMesa(rs.getInt("NroMesa"));
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setFechaHora(rs.getTimestamp("fechaYhora"));
                pedido.setEstado(rs.getBoolean("estado"));

                pedidos.add(pedido);
            }

            ps.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return pedidos;
    }

}
    