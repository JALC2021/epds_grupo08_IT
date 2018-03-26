
package Compras.action;

import Libreria.Almacen;
import Libreria.Libro;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class AgregarLibrosAction extends ActionSupport {

   
    private List<String> listaIsbn;

    private List<Libro> listaCarro;
    
    private String libroSeleccion;
    
    private List<Libro> listaLibrosAlmacen;
   
    private List<Libro> listaLibrosSolicitados;

    public AgregarLibrosAction() {
    }

    @Override
    public String execute() throws Exception {
        Map<String, Object> session = ActionContext.getContext().getSession();
        
        listaIsbn = (List<String>) session.get("listaCarro");
        if (listaIsbn == null) {
            listaIsbn = new ArrayList<String>();
        }
        
        listaIsbn.add(this.libroSeleccion);
      
        Almacen a = new Almacen();
        
        listaLibrosAlmacen = a.consultaLibrosDisponibles();
        listaLibrosSolicitados = a.consultaListaLibrosSolicitados(listaIsbn);
       
        session.put("listaCarro", listaIsbn);

        return SUCCESS;
    }

    public List<String> getListaIsbn() {
        return listaIsbn;
    }

    public void setListaIsbn(List<String> listaIsbn) {
        this.listaIsbn = listaIsbn;
    }

    public List<Libro> getListaCarro() {
        return listaCarro;
    }

    public void setListaCarro(List<Libro> listaCarro) {
        this.listaCarro = listaCarro;
    }

    public String getLibroSeleccion() {
        return libroSeleccion;
    }

    public void setLibroSeleccion(String libroSeleccion) {
        this.libroSeleccion = libroSeleccion;
    }

    public List<Libro> getListaLibrosAlmacen() {
        return listaLibrosAlmacen;
    }

    public void setListaLibrosAlmacen(List<Libro> listaLibrosAlmacen) {
        this.listaLibrosAlmacen = listaLibrosAlmacen;
    }

    public List<Libro> getListaLibrosSolicitados() {
        return listaLibrosSolicitados;
    }

    public void setListaLibrosSolicitados(List<Libro> listaLibrosSolicitados) {
        this.listaLibrosSolicitados = listaLibrosSolicitados;
    }

}
