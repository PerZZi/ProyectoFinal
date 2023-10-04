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

        String sql = "INSERT INTO pedido (id_mesa, id_producto, id_mesero, fechaYhora, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            LocalDateTime localDateTime = LocalDateTime.now();
            java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(localDateTime);
     
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedido.getIdMesa());
            ps.setInt(2, pedido.getIdProducto());
            ps.setInt(3, pedido.getIdMesero());
            ps.setTimestamp(1, java.sql.Timestamp.valueOf(pedido.getFechaHora()));
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
}
