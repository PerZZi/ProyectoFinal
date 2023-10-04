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
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    
  public void agregarMesa(Mesa mesa) {
  
    String sql = "INSERT INTO producto (id_mesa,nombreCliente,dni,fechaYhora,estado) VALUES (?, ?, ?, ?,?)";

        try {
            
            LocalDateTime localDateTime = LocalDateTime.now();
            java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(localDateTime);
            
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mesa.getIdMesa());
            ps.setString(2, mesa.getNombreCliente());
            ps.setInt(3,mesa.getDni());
            ps.setTimestamp(1, java.sql.Timestamp.valueOf(mesa.getFechaYhora()));
            ps.setBoolean(5, mesa.isEstado());
            ps.executeUpdate();
           ResultSet rs = ps.getGeneratedKeys();
           
           if(rs.next()){
               
           JOptionPane.showMessageDialog(null," Mesa agregada ");
           
           }
           ps.close();
           
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al intetar agregar Mesa ");
            
        }

  
  
  
  
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
}
