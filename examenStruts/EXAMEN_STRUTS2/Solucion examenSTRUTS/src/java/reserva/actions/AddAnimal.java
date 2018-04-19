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
public class AddAnimal extends ActionSupport {

    ReservaDAO r = new ReservaDAO();
    List<Reservaanimales> listadoAnimales = new ArrayList<Reservaanimales>();
    List<Tipoanimal> listaTipoAnimal = new ArrayList<Tipoanimal>();

    private String identificador;
    private String tipoAnimal;
    private String pais;
    private int precio;
    private String email;

    public AddAnimal() {
        listaTipoAnimal = r.listadoTipoAnimal();

    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        Reservaanimales animal = new Reservaanimales();

        animal.setIdentificador(identificador);
        animal.setTipoAnimal(tipoAnimal);
        animal.setPrecio(precio);
        animal.setPais(pais);
        animal.setEmail(email);
        r.addAnimal(animal);

        listadoAnimales = r.listadoAnimales();
        //listaTipoAnimal = r.listadoTipoAnimal();
        return SUCCESS;
    }

}
