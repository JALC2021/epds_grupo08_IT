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
public class BorrarAnimal extends ActionSupport {

    ReservaDAO r = new ReservaDAO();
    //Reservaanimales animal = new Reservaanimales();
    List<Tipoanimal> listaTipoAnimal = new ArrayList<Tipoanimal>();
    int id;

    List<Reservaanimales> listadoAnimales = new ArrayList<Reservaanimales>();

    public BorrarAnimal() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Reservaanimales> getListadoAnimales() {
        return listadoAnimales;
    }

    public void setListadoAnimales(List<Reservaanimales> listadoAnimales) {
        this.listadoAnimales = listadoAnimales;
    }

    public List<Tipoanimal> getListaTipoAnimal() {
        return listaTipoAnimal;
    }

    public void setListaTipoAnimal(List<Tipoanimal> listaTipoAnimal) {
        this.listaTipoAnimal = listaTipoAnimal;
    }

    public String execute() throws Exception {

        r.deleteAnimal(id);
        listadoAnimales = r.listadoAnimales();
        listaTipoAnimal = r.listadoTipoAnimal();
        
        return SUCCESS;
    }

}
