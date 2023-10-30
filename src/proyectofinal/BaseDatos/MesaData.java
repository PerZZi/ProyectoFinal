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

        String sql = "INSERT INTO mesa (NroMesa, capacidad, estado) VALUES (?, ?, ?)";
            
            if (existeMesa(mesa.getNumeroMesa())) {
        JOptionPane.showMessageDialog(null, "El número de mesa ya existe. Introduce un número de mesa diferente.");
        return; // Sal del método sin agregar la mesa
            }
            
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mesa.getNumeroMesa());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3, mesa.isEstado());
            ps.setInt(4, mesa.getIdMesa());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                mesa.setIdMesa(1);
                JOptionPane.showMessageDialog(null, "Mesa agregada ");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intetar agregar Mesa ");

        }
    }
    private boolean existeMesa(int numeroMesa) {
    String sql = "SELECT COUNT(*) FROM mesa WHERE NroMesa = ?";
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, numeroMesa);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            int count = rs.getInt(1);
            return count > 0;
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al verificar la existencia de la mesa: " + ex.getMessage());
    }
    return false;
}

    public void eliminarMesa(int id) {

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
// Verifica si el número de mesa ya existe
        if (!existeMesaConNumero(mesa.getNumeroMesa())) {
            JOptionPane.showMessageDialog(null, "El número de mesa no existe. No se puede modificar.");
            return;
        }

        String sql = "UPDATE mesa SET capacidad= ?,estado= ? WHERE id_Mesa= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mesa.getCapacidad());
            ps.setBoolean(2, mesa.isEstado());
            ps.setInt(3, mesa.getNumeroMesa());
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Mesa modificada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha encontrado la mesa para modificar.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar modificar la mesa: " + ex.getMessage());
        }
    }
    private boolean existeMesaConNumero(int numeroMesa) {
    String sql = "SELECT COUNT(*) FROM mesa WHERE NroMesa = ?";
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, numeroMesa);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            int count = rs.getInt(1);
            return count > 0;
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al verificar la existencia de la mesa: " + ex.getMessage());
    }
    return false;
}
    
    public List<Mesa> listarMesa() {

        String sql = "SELECT id_Mesa, NroMesa, capacidad, estado FROM mesa WHERE estado = 1";

        ArrayList<Mesa> mesas = new ArrayList<>();
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("id_mesa"));
                mesa.setNumeroMesa(rs.getInt("NroMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(rs.getBoolean("estado"));
                
                mesas.add(mesa);
               }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al accder a la tabla meseros " + ex.getMessage());
        }

        return mesas;
    }
    

}









