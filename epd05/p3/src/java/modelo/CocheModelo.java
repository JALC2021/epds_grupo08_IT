package modelo;

import java.sql.Time;

public class CocheModelo  implements java.io.Serializable {


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

    CocheModelo(String matricula, String modelo, String horaEntrada, String horaSalida, int tiempoPermitido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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


}


