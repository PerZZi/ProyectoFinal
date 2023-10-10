/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Tablas;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Pedido {
    
    private int idPedido;
    private int idMesa;
    private int cantidad;
    private double importe;
    private LocalDateTime fechaHora;
    private boolean estado;

    public Pedido() {
    }

    public Pedido(int idMesa,  int cantidad, LocalDateTime fechaHora, boolean estado) {
        this.idMesa = idMesa;
        
        this.cantidad = cantidad;
        this.fechaHora = fechaHora;
        this.estado = estado;
    }

    public Pedido(int idPedido, int idMesa,  int cantidad, double importe, LocalDateTime fechaHora, boolean estado) {
        this.idPedido = idPedido;
        this.idMesa = idMesa;
        
        this.cantidad = cantidad;
        this.importe = importe;
        this.fechaHora = fechaHora;
        this.estado = estado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return idPedido + ", " + idMesa + ", " + cantidad + ", " + importe + ", " + fechaHora + ", " + estado;
    }

}
