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

        String sql = "UPDATE mesero SET estado =0  where id_mesero =?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

            int elimino = ps.executeUpdate();

            if (elimino == 1) {

                JOptionPane.showMessageDialog(null, " Mesero eliminado ");

            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al intentar acceder a la tabla Mesero ");

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




}
