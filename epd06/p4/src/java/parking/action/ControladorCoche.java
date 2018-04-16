/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking.action;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import modelo.Coche;
import modelo.AlmacenDatos;

/**
 *
 * @author susana
 */
public class ControladorCoche extends ActionSupport {

    String matricula;
    String modelo;
    Time horaEntrada;
    Time horaSalida;
    int tiempoPermitido;
    int result;
    AlmacenDatos al = new AlmacenDatos();

    List<Coche> coches = new ArrayList<>();

    public ControladorCoche() {
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

    public List<Coche> getCoches() {
        return coches;
    }

    public void setCoches(List<Coche> coches) {
        this.coches = coches;
    }

    @Override
    public String execute() throws Exception {
       
        coches = al.consultaAparcamiento();
        return SUCCESS;
    }

    public String executeInsertar() throws Exception {
        return SUCCESS;

    }

    public String executeEditar() throws Exception {

        return SUCCESS;
    }

    public String executeEliminar() throws Exception {

         result=al.eliminarCoche(getMatricula());
         execute();
        if (result == 1) {

            return SUCCESS;

        } else {
            return ERROR;
        }
    }

    public String executeInsertCoche() throws Exception {

        al.insertarCoche(getMatricula(),getModelo(), getHoraEntrada(), getHoraSalida(), getTiempoPermitido());
        execute();
        return SUCCESS;

    }

    public String executeEditCoche() throws Exception {

        al.actualizarCoche(getMatricula(),getModelo(),getHoraEntrada(), getHoraSalida(),getTiempoPermitido());
        execute();
        return SUCCESS;
    }
    
    public String executeConsultarTiempoExcedido() throws Exception{
        coches= al.consultarTiempoExcedido();
        return SUCCESS;
    }
    
    public String executeConsultarTiempoNoExcedido() throws Exception{
        coches= al.consultarTiempoNoExcedido();
        return SUCCESS;
    }
    
    public String executeConsultarCochesAparcados() throws Exception{
        coches=al.buscarCochesAparcados();
        return SUCCESS;
    }
    
    public String executeConsultarCochesPorMatricula() throws Exception{
        coches=al.buscarPorMatricula(getMatricula());
        return SUCCESS;
    }
}
