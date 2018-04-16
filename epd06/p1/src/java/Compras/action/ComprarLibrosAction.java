
package Compras.action;

import Libreria.Almacen;
import Libreria.Libro;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.Map;


public class ComprarLibrosAction extends ActionSupport {

    private List<Libro> listaLibrosComprados;

    public ComprarLibrosAction() {
    }

    public String execute() throws Exception {
        Map<String, Object> session = ActionContext.getContext().getSession();
        Almacen almacen = new Almacen();
        List<String> listaIsbn = (List<String>) session.get("listaCarro");
        listaLibrosComprados = almacen.consultaListaLibrosSolicitados(listaIsbn);
        return SUCCESS;
    }

    public List<Libro> getListaLibrosComprados() {
        return listaLibrosComprados;
    }

    public void setListaLibrosComprados(List<Libro> listaLibrosComprados) {
        this.listaLibrosComprados = listaLibrosComprados;
    }

}
