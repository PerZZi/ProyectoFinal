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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofinal.Tablas.Producto;

/**
 *
 * @author Usuario
 */
public class ProductoData {
    
    private Connection con = null; 

    public ProductoData() {
        con = Conexion.getConnection();
    }
    
    public void agregarProducto(Producto producto){
        
        String sql= "INSERT INTO producto (nombre, stock, precio, estado) VALUES (?, ?, ?, ?)";
        try{
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getStock());
            ps.setDouble(3, producto.getPrecio());
            ps.setBoolean(4, true);
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                producto.setIdCodigo(1);
                JOptionPane.showMessageDialog(null, "Se agrego un producto");
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ");
        }
    }
    
}
