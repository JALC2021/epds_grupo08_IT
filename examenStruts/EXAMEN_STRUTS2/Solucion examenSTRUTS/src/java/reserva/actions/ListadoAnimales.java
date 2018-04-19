/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserva.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import reserva.ReservaDAO;
import reserva.Reservaanimales;
import reserva.Tipoanimal;

/**
 *
 * @author hp
 */
public class ListadoAnimales extends ActionSupport {
    
    ReservaDAO r = new ReservaDAO();
    List<Reservaanimales> listadoAnimales = new ArrayList<Reservaanimales>();
    List<Tipoanimal> listaTipoAnimal = new ArrayList<Tipoanimal>();
    String tipoAnimal;


    public List<Reservaanimales> getListadoAnimales() {
        return listadoAnimales;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public List<Tipoanimal> getListaTipoAnimal() {
        return listaTipoAnimal;
    }

    public void setListaTipoAnimal(List<Tipoanimal> listatipoAnimal) {
        this.listaTipoAnimal = listatipoAnimal;
    }

    
    
    public String filtrarAnimal (){
        listadoAnimales = r.listadoAnimalesFiltro(tipoAnimal);
        listaTipoAnimal = r.listadoTipoAnimal();
        return SUCCESS;
    }
    public String execute() throws Exception {
        listadoAnimales = r.listadoAnimales();
        listaTipoAnimal = r.listadoTipoAnimal();
        
        return SUCCESS;
    }
    
}
