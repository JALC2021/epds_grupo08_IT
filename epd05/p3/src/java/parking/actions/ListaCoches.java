
package parking.actions;

import modelo.Parking;
import modelo.CocheModelo;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;


public class ListaCoches extends ActionSupport {
    
    Parking al=new Parking();
    List<CocheModelo> coches = new ArrayList<>();
    String matricula;
    String modelo;
    String horaEntrada;
    String horaSalida;
    int tiempoPermitido;
    int result;
    
    public Parking getAl() {
        return al;
    }

    public void setAl(Parking al) {
        this.al = al;
    }

    public List<CocheModelo> getVehiculos() {
        return coches ;
    }

    public void setVehiculos(List<CocheModelo> coches) {
        this.coches  = coches ;
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

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getTiempoPermitido() {
        return tiempoPermitido;
    }

    public void setTiempoPermitido(int tiempoPermitido) {
        this.tiempoPermitido = tiempoPermitido;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
 
    
    @Override
    public String execute() throws Exception {
        coches=al.consultaAparcamiento();
        return SUCCESS;
    }
    
    public String executeInsertar() throws Exception{
        return SUCCESS;

    }
    
    public String executeEditar() throws Exception{
    
        return SUCCESS;
    }
        
    public String executeEliminar() throws Exception{
        
        result= al.deleteVehiculoBD(this.getMatricula());
        
        if(result==1){
            
            return SUCCESS;
        
        }
        else{
            return ERROR;
        }
    }
    
    public String executeInsertVehiculo() throws Exception{
    
        al.addVehiculoBD(this.getMatricula(),this.getModelo(), this.getHoraEntrada(), this.getHoraSalida(), this.getTiempoPermitido());
        return SUCCESS;
 
    }
        
    public String executeEditVehiculo() throws Exception{
    
        al.updateVehiculoBD(this.getMatricula(),this.getModelo(), this.getHoraEntrada(), this.getHoraSalida(), this.getTiempoPermitido());
        return SUCCESS;
    }

    
}
