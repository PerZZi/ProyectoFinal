
package proyectofinal.Tablas;

import java.time.LocalDateTime;


public class Mesa {
    
    private int idMesa;
    private String nombreCliente;
    private int dni;
    private LocalDateTime fechaYhora;
    private boolean estado;

    public Mesa() {
    }

    public Mesa(String nombreCliente, int dni, LocalDateTime fechaYhora, boolean estado) {
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.fechaYhora = fechaYhora;
        this.estado = estado;
    }

    public Mesa(int idMesa, String nombreCliente, int dni, LocalDateTime fechaYhora, boolean estado) {
        this.idMesa = idMesa;
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.fechaYhora = fechaYhora;
        this.estado = estado;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDateTime getFechaYhora() {
        return fechaYhora;
    }

    public void setFechaYhora(LocalDateTime fechaYhora) {
        this.fechaYhora = fechaYhora;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return idMesa + ", " + nombreCliente + ", " + dni + ", " + fechaYhora + ", " + estado;
    } 
    
}
