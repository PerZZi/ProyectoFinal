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

 public boolean eliminarMesa(int numeroMesa) {
    String sql = "UPDATE mesa SET estado = 0 WHERE NroMesa = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, numeroMesa);

        int rowsUpdated = ps.executeUpdate();
        ps.close();

        return rowsUpdated > 0;
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al intentar eliminar la mesa: " + ex.getMessage());
        return false;
    }
}

 
 public void modificarNumeroMesa(int numeroMesa, int nuevoNumeroMesa) {
    // Verifica si el número de mesa que deseas modificar existe
    if (!existeMesaConNumero(numeroMesa)) {
        JOptionPane.showMessageDialog(null, "El número de mesa no existe. No se puede modificar.");
        return;
    }

    String sql = "UPDATE mesa SET NroMesa = ? WHERE NroMesa = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, nuevoNumeroMesa);
        ps.setInt(2, numeroMesa);

        int rowsUpdated = ps.executeUpdate();
        ps.close();

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Número de mesa modificado con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "No se ha encontrado la mesa para modificar.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al intentar modificar el número de mesa: " + ex.getMessage());
    }
}
 
 
 
    public boolean existeMesaConNumero(int numeroMesa) {
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
    
    
    
    public Mesa buscarMesa(int numeroMesa) {
    String sql = "SELECT id_Mesa, NroMesa, capacidad, estado FROM mesa WHERE NroMesa = ? ";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, numeroMesa);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            Mesa mesa = new Mesa();
            mesa.setIdMesa(rs.getInt("id_Mesa"));
            mesa.setNumeroMesa(rs.getInt("NroMesa"));
            mesa.setCapacidad(rs.getInt("capacidad"));
            mesa.setEstado(rs.getBoolean("estado"));
            ps.close();
            return mesa;
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al intentar buscar la mesa: " + ex.getMessage());
    }
    return null;  // Devuelve null si no se encuentra la mesa o si hay un error
}
    
    
public void guardarMesa(Mesa mesa) {
    if (mesa.getIdMesa() == 0) {
        // La mesa es nueva, así que la insertamos en la base de datos
        String sql = "INSERT INTO mesa (NroMesa, capacidad) VALUES (?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mesa.getNumeroMesa());
            ps.setInt(2, mesa.getCapacidad());

            int rowsInserted = ps.executeUpdate();

            if (rowsInserted > 0) {
                ResultSet generatedKeys = ps.getGeneratedKeys();
                if (generatedKeys.next()) {
                    mesa.setIdMesa(generatedKeys.getInt(1));
                }
                JOptionPane.showMessageDialog(null, "Mesa agregada con éxito.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar agregar la mesa: " + ex.getMessage());
        }
    }
}    
    
//    
//    public void guardarMesa(Mesa mesa) {
//    if (mesa.getIdMesa() == 0) {
//        // La mesa es nueva, así que la insertamos en la base de datos
//        String sql = "INSERT INTO mesa (NroMesa, capacidad, estado) VALUES (?, ?, ?)";
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setInt(1, mesa.getNumeroMesa());
//            ps.setInt(2, mesa.getCapacidad());
//            ps.setBoolean(3, mesa.isEstado());
//
//            int rowsInserted = ps.executeUpdate();
//
//            if (rowsInserted > 0) {
//                ResultSet generatedKeys = ps.getGeneratedKeys();
//                if (generatedKeys.next()) {
//                    mesa.setIdMesa(generatedKeys.getInt(1));
//                }
//                JOptionPane.showMessageDialog(null, "Mesa agregada con éxito.");
//            }
//
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al intentar agregar la mesa: " + ex.getMessage());
//        }
//    } else {
//        // La mesa ya existe, así que la actualizamos en la base de datos
//        String sql = "UPDATE mesa SET NroMesa = ?, capacidad = ?, estado = ? WHERE id_Mesa = ?";
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, mesa.getNumeroMesa());
//            ps.setInt(2, mesa.getCapacidad());
//            ps.setBoolean(3, mesa.isEstado());
//            ps.setInt(4, mesa.getIdMesa());
//
//            int rowsUpdated = ps.executeUpdate();
//
//            if (rowsUpdated > 0) {
//                JOptionPane.showMessageDialog(null, "Mesa modificada con éxito.");
//            } else {
//                JOptionPane.showMessageDialog(null, "No se ha encontrado la mesa para modificar.");
//            }
//
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al intentar modificar la mesa: " + ex.getMessage());
//        }
//    }
//}
    
    
    public void activarMesa(int numeroMesa) {
    // Verifica si la mesa con el número dado existe
    if (!existeMesaConNumero(numeroMesa)) {
        JOptionPane.showMessageDialog(null, "La mesa no existe. No se puede activar.");
        return;
    }

    String sql = "UPDATE mesa SET estado = 1 WHERE NroMesa = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, numeroMesa);

        int rowsUpdated = ps.executeUpdate();
        ps.close();

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Mesa activada con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "No se ha encontrado la mesa para activar.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al intentar activar la mesa: " + ex.getMessage());
    }
}
    
    
    
    

}









