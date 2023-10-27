/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Tablas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Pedido {
    
    private int idPedido;
    private int idMesa;
    private int NroMesa;
    private double importe;
    private java.util.Date fechaHora;
    private boolean estado;

    public Pedido() {
    }

    public Pedido(int idPedido, int idMesa, int NroMesa, double importe, Date fechaHora, boolean estado) {
        this.idPedido = idPedido;
        this.idMesa = idMesa;
        this.NroMesa = NroMesa;
        this.importe = importe;
        this.fechaHora = fechaHora;
        this.estado = estado;
    }

    public Pedido(int idMesa, int NroMesa, double importe, Date fechaHora, boolean estado) {
        this.idMesa = idMesa;
        this.NroMesa = NroMesa;
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

    public int getNroMesa() {
        return NroMesa;
    }

    public void setNroMesa(int NroMesa) {
        this.NroMesa = NroMesa;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
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
        return "Pedido{" + "idPedido=" + idPedido + ", idMesa=" + idMesa + ", NroMesa=" + NroMesa + ", importe=" + importe + ", fechaHora=" + fechaHora + ", estado=" + estado + '}';
    }

    

}
