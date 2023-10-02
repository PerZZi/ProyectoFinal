
package proyectofinal.Tablas;

import java.time.LocalDate;


public class Mesa {
    
    private int idMesa;
    private String nombreCliente;
    private int dni;
    private LocalDate fecha;
    private LocalDate hora;
    private int estado;

    public Mesa() {
    }

    public Mesa(int idMesa, String nombreCliente, int dni, LocalDate fecha, LocalDate hora, int estado) {
        this.idMesa = idMesa;
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getHora() {
        return hora;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  idMesa + "," + nombreCliente + "," + dni + "," + fecha + "," + hora + ", " + estado ;
    }

    
    
    
    
}
