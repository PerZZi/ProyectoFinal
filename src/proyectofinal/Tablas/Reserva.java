
package proyectofinal.Tablas;

import java.time.LocalDate;


public class Reserva {
    
    
   private int idReserva;
   private String nombre;
   private int dni;
   private LocalDate fechaYhora;
   private int idmesa;
   private boolean estado;

    public Reserva() {
    }

    public Reserva(int idReserva, String nombre, int dni, LocalDate fechaYhora, int idmesa, boolean estado) {
        this.idReserva = idReserva;
        this.nombre = nombre;
        this.dni = dni;
        this.fechaYhora = fechaYhora;
        this.idmesa = idmesa;
        this.estado = estado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaYhora() {
        return fechaYhora;
    }

    public void setFechaYhora(LocalDate fechaYhora) {
        this.fechaYhora = fechaYhora;
    }

    public int getIdmesa() {
        return idmesa;
    }

    public void setIdmesa(int idmesa) {
        this.idmesa = idmesa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return   idReserva + ", " + nombre + ", " + dni + ", " + fechaYhora + ", " + idmesa + ", " + estado ;
    }
    
}
