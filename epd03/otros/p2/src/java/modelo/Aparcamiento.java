/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Práctica
 */
public class Aparcamiento {
    private String vehiculo;
    private Date horaEntrada;
    private Date horaSalida;
    private Integer tiempoPermitido;

    public Aparcamiento(String vehiculo, Date horaEntrada, Integer tiempoPermitido) {
        this.vehiculo = vehiculo;
        this.horaEntrada = horaEntrada;
        this.tiempoPermitido = tiempoPermitido;
    }

    public Aparcamiento(String vehiculo, Date horaEntrada, Date horaSalida, Integer tiempoPermitido) {
        this.vehiculo = vehiculo;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.tiempoPermitido = tiempoPermitido;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Integer getTiempoPermitido() {
        return tiempoPermitido;
    }

    public void setTiempoPermitido(Integer tiempoPermitido) {
        this.tiempoPermitido = tiempoPermitido;
    }
    
}
