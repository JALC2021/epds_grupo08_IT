/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import reserva.ReservaDAO;
import reserva.Reservaanimales;
import reserva.Tipoanimal;

/**
 *
 * @author jalc
 */
public class Insertar extends ActionSupport {

    List<Tipoanimal> animales = new ArrayList<Tipoanimal>();
    List<Reservaanimales> reserva = new ArrayList<Reservaanimales>();
    ReservaDAO reser = new ReservaDAO();

    int id;
    String identificador;
    String tipoAnimal;
    String pais;
    int precio;
    String email;

    public Insertar() {
        animales = reser.listadoTipoAnimal();
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

    public ReservaDAO getReser() {
        return reser;
    }

    public void setReser(ReservaDAO reser) {
        this.reser = reser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

 

    @Override
    public String execute() throws Exception {
        Reservaanimales animal = new Reservaanimales(this.identificador, this.tipoAnimal, this.pais, this.precio, this.email);
        reser.addAnimal(animal);
        reserva = reser.listadoAnimales();
        //animales = reser.listadoTipoAnimal();
        return SUCCESS;
    }

}
