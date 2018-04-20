/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import reserva.Reservaanimales;
import reserva.Tipoanimal;
import reserva.ReservaDAO;

/**
 *
 * @author susana
 */
public class ControladorAnimal extends ActionSupport {
    
    List<Tipoanimal> animales= new ArrayList<Tipoanimal>();
    List<Reservaanimales> reserva= new ArrayList<Reservaanimales>();
    ReservaDAO reser= new ReservaDAO();
    
    public ControladorAnimal() {
    }

    public List<Tipoanimal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Tipoanimal> animales) {
        this.animales = animales;
    }

    public List<Reservaanimales> getReserva() {
        return reserva;
    }

    public void setReserva(List<Reservaanimales> reserva) {
        this.reserva = reserva;
    }
    
    
    
    @Override
    public String execute() throws Exception {
       reserva=reser.listadoAnimales();
       animales=reser.listadoTipoAnimal();
        return SUCCESS;
    }
    
   
    
   
    
}
