/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Parking {
    private Vehiculo vehiculo;
    private Calendar fechaEntrada;
    private Calendar fechaSalida;
    private int tiempoPermitido;
    
    public Parking(){
        this.setVehiculo(new Vehiculo());
        this.setFechaEntrada(new GregorianCalendar());
        this.setFechaSalida(null);
        this.setTiempoPermitido(0);
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Calendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Calendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Calendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Calendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getTiempoPermitido() {
        return tiempoPermitido;
    }

    public void setTiempoPermitido(int tiempoPermitido) {
        this.tiempoPermitido = tiempoPermitido;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Parking other = (Parking) obj;
        if ((this.vehiculo == null) ? (other.vehiculo != null) : !this.vehiculo.equals(other.vehiculo)) {
            return false;
        }
        return true;
    }   
}
