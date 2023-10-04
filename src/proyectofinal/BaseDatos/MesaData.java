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
import proyectofinal.Tablas.Mesa;

/**
 *
 * @author Usuario
 */
public class MesaData {
    private Connection con = null;

    public MesaData() {
        con = Conexion.getConnection();
    }
    
    
    public void cancelarMesa(int id) {
        
        try {
            String sql = "UPDATE mesa SET estado= 0 where id_Mesa = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            int elimino = ps.executeUpdate();
            
            if (elimino == 1) {
                
                JOptionPane.showMessageDialog(null, "Mesa cancelada");
                
            }
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa");
            
        }
    }
    
    
    public void modificarMesa(Mesa mesa) {
        String sql = "UPDATE mesa SET idMesa=?, nombreCliente=?, dni=?, fechaYhora=? WHERE estado=?";
        try{
            LocalDateTime localDateTime = LocalDateTime.now();
            java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(localDateTime);    
        
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mesa.getIdMesa());
            ps.setString(2, mesa.getNombreCliente());
            ps.setInt(3, mesa.getDni());
            ps.setTimestamp(4, java.sql.Timestamp.valueOf(mesa.getFechaHora()));
            ps.setBoolean(5, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                mesa.setIdMesa(1);
                JOptionPane.showMessageDialog(null, "Pedido Modificado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ");
        }
    }
    
    
}
