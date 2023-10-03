/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Tablas;

/**
 *
 * @author Usuario
 */
public class Producto {
    
    private int idCodigo;
    private String nombre;
    private int stock;
    private double precio;
    private boolean estado;

    public Producto() {
    }

    public Producto(int idCodigo, String nombre, int stock, double precio, boolean estado) {
        this.idCodigo = idCodigo;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.estado = estado;
    }

    public int getIdCodigo() {
        return idCodigo;
    }

    public void setIdCodigo(int idCodigo) {
        this.idCodigo = idCodigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public boolean getEstado(){
        return estado;
    }
    
     public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  idCodigo + ", " + nombre + ", =" + stock + ", " + precio + ", " + estado;
    } 
    
}
