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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofinal.Tablas.Mesero;

/**
 *
 * @author Usuario
 */
public class MeseroData {

    private Connection con = null;

    public MeseroData() {
        con = Conexion.getConnection();
    }
    
    public boolean existeMesero(String nombre) {
    String sql = "SELECT COUNT(*) FROM mesero WHERE nombre = ?";
    
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            int count = rs.getInt(1);
            return count > 0;
        }
    } catch (SQLException ex) {
        // Maneja la excepción
    }
    
    return false;
}

    public void agregarMesero(Mesero mesero) {

    String sql = "INSERT INTO mesero (nombre, estado) VALUES (?, ?)";
    
        try {
        
        if (existeMesero(mesero.getNombre())) {
            JOptionPane.showMessageDialog(null, "El nombre del mesero ya existe. Introduce un nombre diferente.");
            return; 
        }

        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, mesero.getNombre());
        ps.setBoolean(2, true);
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            mesero.setId_mesero(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Mesero registrado con el ID: " + mesero.getId_mesero());
        }
        ps.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla: " + ex.getMessage());
    }
}
    

   
    public void eliminarMesero(int id) {
    String sql = "UPDATE mesero SET estado = 0 WHERE id_mesero = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);

        int filasAfectadas = ps.executeUpdate();
        ps.close();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Mesero eliminado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún mesero con el ID proporcionado.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla Mesero: " + ex.getMessage());
    }
}
    public List<Mesero> listarMesero() {

        String sql = "SELECT id_mesero, nombre, estado FROM mesero WHERE estado= 1";

        ArrayList<Mesero> meseros = new ArrayList<>();
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Mesero mesero = new Mesero();
                mesero.setId_mesero(rs.getInt("id_mesero"));
                mesero.setNombre(rs.getString("nombre"));
                mesero.setEstado(rs.getBoolean("estado"));
                meseros.add(mesero);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al accder a la tabla meseros " + ex.getMessage());
        }

        return meseros;
    }


    public void guardarMesero(Mesero mesero){
    
            String sql= "INSERT INTO mesero (nombre)VALUES (?)";
           
                try {
                    PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                    ps.setString(1, mesero.getNombre());
                    ResultSet rs = ps.getGeneratedKeys();
                    
                    if(rs.next()){
                        
                        mesero.setNombre(rs.getString(1));
                        JOptionPane.showMessageDialog(null,"Mesero Añadido con Exito");
                    }
                    ps.close();
                
                } catch (SQLException ex) {
                    
                    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero"+ ex.getMessage() );
                    
                }
            
            
    
    }
    
    
    public Mesero buscarMesero(int id) {
        String sql = "SELECT nombre FROM mesero WHERE id_mesero=?";
        Mesero mesero = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                mesero = new Mesero();
                mesero.setId_mesero(id);
                mesero.setNombre(rs.getString("nombre"));

            } else {
                JOptionPane.showMessageDialog(null, "No Existe Ese Mesero");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla: " + ex.getMessage());
        }

        return mesero;
    }
    
    
    
     public void actualizarMesero(Mesero mesero) {
    String sql = "UPDATE mesero SET nombre = ? WHERE id_mesero = ?";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, mesero.getNombre());
        ps.setInt(2, mesero.getId_mesero());

        int filasAfectadas = ps.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Mesero actualizado con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el mesero con el ID proporcionado.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al actualizar el mesero: " + ex.getMessage());
    }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // NO SE SI ESTA BIEN, ES PARA ELIMINAR EL NOMBRE DE LOS MESEROS
//    private void eliminarMesero2(Mesero mesero){
//      try {
//        String sql = "UPDATE mesero SET nombre = ? WHERE id = ?"; // Reemplaza 'id' con el nombre de la columna que identifica de manera única al mesero.
//        PreparedStatement ps = con.prepareStatement(sql);
//        ps.setString(1, mesero.getNombre());
//        ps.setInt(2, mesero.getId_mesero()); // Suponiendo que tengas un método getId() para obtener el ID del mesero.
//        int filasAfectadas = ps.executeUpdate();
//
//        if (filasAfectadas > 0) {
//            // La actualización fue exitosa.
//            JOptionPane.showMessageDialog(null, "Mesero actualizado exitosamente.");
//        } else {
//            // No se encontró ningún mesero con el ID proporcionado.
//            JOptionPane.showMessageDialog(null, "No se encontró ningún mesero con el ID proporcionado.");
//        }
//    } catch (SQLException ex) {
//        ex.printStackTrace();
//        JOptionPane.showMessageDialog(null, "Error al actualizar el mesero: " + ex.getMessage());
//    }
//}
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
// fin
}
