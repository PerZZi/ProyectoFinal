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
    
    public void modificarMesero(Mesero mesero) {

        String sql = "UPDATE mesero SET nombre= ? ,id_pedido= ? ,estado= ?" + "WHERE id_mesero=?";

        try {
            PreparedStatement ps = ps = con.prepareStatement(sql);
            ps.setString(1, mesero.getNombre());
            ps.setInt(2, mesero.getId_pedido());
            ps.setBoolean(3, mesero.getEstado());
            

            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Mesero modificado");
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al tratar de acceder a la tabla mesero");

        }
    }
    
    
}
