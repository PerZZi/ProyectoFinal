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

    public void agregarMesero(Mesero mesero) {

        String sql = "INSERT INTO mesero (nombre, id_pedido, estado) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, mesero.getNombre());
            ps.setInt(2, mesero.getId_pedido());
            ps.setBoolean(3, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                mesero.setId_mesero(1);
                JOptionPane.showMessageDialog(null, "Mesero registrado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ");
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
        
        String sql = "SELECT idMesero, nombre, idpedido,  FROM mesero WHERE estado= 1";
        
        ArrayList<Mesero> meseros =new ArrayList<>();
        try {
            PreparedStatement ps=con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {  
                
             Mesero mesero = new Mesero();                
                 mesero.setId_mesero(rs.getInt("idMesero"));
                 mesero.setNombre(rs.getString("Nombre"));
                 mesero.setId_pedido(rs.getInt("Idpedido"));      
                 mesero.setEstado(true);
                
               meseros.add(mesero);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al accder a la tabla meseros " + ex.getMessage());
            
        }
        
        return meseros;
    }




}
