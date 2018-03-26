
package Compras.action;

import Libreria.Almacen;
import Libreria.Libro;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;


public class SeleccionarLibrosAction extends ActionSupport {

    private List<Libro> listaLibrosAlmacen;

    public SeleccionarLibrosAction() {
    }

    @Override
    public String execute() throws Exception {

        Almacen almacen = new Almacen();
        listaLibrosAlmacen = almacen.consultaLibrosDisponibles();

        return SUCCESS;

    }

    public List<Libro> getListaLibrosAlmacen() {
        return listaLibrosAlmacen;
    }

    public void setListaLibrosAlmacen(List<Libro> listaLibrosAlmacen) {
        this.listaLibrosAlmacen = listaLibrosAlmacen;
    }

}
