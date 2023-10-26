/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Tablas;


public class Mesero {
    private int id_mesero;
    private String nombre;
    private int id_pedido;
    private boolean estado;

    public Mesero() {
    }

    public Mesero(String nombre,  boolean estado) {
        this.nombre = nombre;
        
        this.estado = estado;
    }

    public Mesero(int id_mesero, String nombre, int id_pedido, boolean estado) {
        this.id_mesero = id_mesero;
        this.nombre = nombre;
        
        this.estado = estado;
    }
    
    

    public int getId_mesero() {
        return id_mesero;
    }

    public void setId_mesero(int id_mesero) {
        this.id_mesero = id_mesero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }
    
    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    @Override
    public String toString() {
        return id_mesero + ", " + nombre + ", " + id_pedido + ", " + estado;
    }
     
}
