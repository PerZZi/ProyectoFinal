/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.sql.Connection;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import proyectofinal.BaseDatos.Conexion;
import proyectofinal.BaseDatos.MesaData;
import proyectofinal.BaseDatos.MeseroData;
import proyectofinal.BaseDatos.PedidoData;
import proyectofinal.BaseDatos.ProductoData;
import proyectofinal.Tablas.Mesa;
import proyectofinal.Tablas.Mesero;
import proyectofinal.Tablas.Pedido;
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

        Producto pro2 = new Producto("Café",10,200,true);
        ProductoData pro2Data = new ProductoData();
        pro2Data.agregarProducto(pro2);
//        pro2Data.modificarProducto(pro2);
        
        //Producto productoEncontrado= pro2Data.buscarProductoPorNombre("tallarines");
        //System.out.println("Nombre " + productoEncontrado.getNombre());
        //System.out.println("Stock " + productoEncontrado.getStock());
        //System.out.println("Precio " + productoEncontrado.getPrecio());
        
        //Mesero mese1=new Mesero("Joaquin",5, true);
        //MeseroData meseData=new MeseroData();
        //meseData.agregarMesero(mese1);
  
            Timestamp fechaActual = Timestamp.from(Instant.now());
            
//            Pedido pedi = new Pedido(1,500, fechaActual, true);
            PedidoData pediData=new PedidoData();
//            pediData.agregarPedido(pedi);
        //pediData.elimPedido pedi = new Pedido(1,500, fechaActual, true);
//            PediinarPedido(3);
        //pediData.modificarPedido(pedi);
        
        
            
            List<Pedido> pedidos = pediData.listarPedidos();
            
            
                
//        Mesa mesa1=new Mesa(1,6,true);
//        MesaData mesaData=new MesaData();
        //mesaData.agregarMesa(mesa1);
        //mesaData.modificarMesa(mesa1);
        
//        Mesero mese=new Mesero("jose",true);
//        MeseroData mesedata=new MeseroData();
        //mesedata.agregarMesero(mese);
    }
}
