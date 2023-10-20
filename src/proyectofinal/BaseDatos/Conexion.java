/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Conexion {
    
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "restaurante";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;

    public Conexion() {
    }
    
    public static Connection getConnection(){
        
        if(connection==null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection=DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
                JOptionPane.showMessageDialog(null, "Conexion exitosa");
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers");
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error al connectarse a la base de datos");
            }
        }
        return connection;
    }

   
}
