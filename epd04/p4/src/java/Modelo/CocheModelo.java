/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.sql.Time;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author susana
 */
public class CocheModelo {
    private String matricula;
    private String modelo;
    private Time horaEntrada;
    private Time horaSalida;
    private int tiempoPermitido;
    private String horaEntradaConFormato;
    private String horaSalidaConFormato;
    
    public CocheModelo() {
    }

    
    public CocheModelo(String matricula, String modelo, Time horaEntrada, Time horaSalida, int tiempoPermitido) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.tiempoPermitido = tiempoPermitido;
    }
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Time getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Time horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Time getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Time horaSalida) {

        this.horaSalida = horaSalida;
    }

    public int getTiempoPermitido() {
        return tiempoPermitido;
    }

    public void setTiempoPermitido(int tiempoPermitido) {
        this.tiempoPermitido = tiempoPermitido;
    }
    
    public String getHoraEntradaConFormato() {
        return horaEntradaConFormato;
    }

    public void setHoraEntradaConFormato(String horaEntradaConFormato) {
        this.horaEntradaConFormato = horaEntradaConFormato;
    }
    
         public String getHoraSalidaConFormato() {
        return horaSalidaConFormato;
    }

    public void setHoraSalidaConFormato(String horaEntradaConFormato) {
        this.horaSalidaConFormato = horaEntradaConFormato;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.matricula);
        hash = 29 * hash + Objects.hashCode(this.modelo);
        hash = 29 * hash + Objects.hashCode(this.horaEntrada);
        hash = 29 * hash + Objects.hashCode(this.horaSalida);
        hash = 29 * hash + this.tiempoPermitido;
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
        final CocheModelo other = (CocheModelo) obj;
        if (this.tiempoPermitido != other.tiempoPermitido) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.horaEntrada, other.horaEntrada)) {
            return false;
        }
        return Objects.equals(this.horaSalida, other.horaSalida);
    }
}
    
    