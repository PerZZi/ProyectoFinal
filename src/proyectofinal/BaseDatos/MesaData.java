/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.BaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
}
