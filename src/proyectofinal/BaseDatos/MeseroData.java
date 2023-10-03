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

        String sql = "INSERT INTO mesero (nombre, id_pedido) VALUES (?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, mesero.getNombre());
            ps.setInt(2, mesero.getId_pedido());
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
}
