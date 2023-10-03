/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.sql.Connection;
import proyectofinal.BaseDatos.Conexion;
import proyectofinal.BaseDatos.MeseroData;
import proyectofinal.BaseDatos.ProductoData;
import proyectofinal.Tablas.Mesero;
import proyectofinal.Tablas.Producto;

/**
 *
 * @author Usuario
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Connection con = Conexion.getConnection();
//        Producto pro1 = new Producto();
//        pro1.setNombre("tallarines");
//        pro1.setStock(20);
//        pro1.setPrecio(500.0);
//        ProductoData proData = new ProductoData();
//        proData.agregarProducto(pro1);
//        
        Producto pro2 = new Producto();
        pro2.setNombre("tallarines");
        pro2.setStock(20);
        pro2.setPrecio(500.0);
        ProductoData pro2Data = new ProductoData();
        //pro2Data.agregarProducto(pro2);
        
        //Producto productoEncontrado= pro2Data.buscarProductoPorNombre("tallarines");
        //System.out.println("Nombre " + productoEncontrado.getNombre());
        //System.out.println("Stock " + productoEncontrado.getStock());
        //System.out.println("Precio " + productoEncontrado.getPrecio());
        
        Mesero mese1=new Mesero("Joaquin",5);
        MeseroData meseData=new MeseroData();
        meseData.agregarMesero(mese1);
    }
}
