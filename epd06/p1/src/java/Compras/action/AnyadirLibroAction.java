
package Compras.action;

import Libreria.Almacen;
import Libreria.Libro;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;


public class AnyadirLibroAction extends ActionSupport {

    private int id;
    private String autor;
    private String titulo;
    private float precio;
    private int isbn;
    private Libro libro;
    private int editorial;
    private List<Libro> listaLibrosAlmacen;
    

    public AnyadirLibroAction() {
    }

    @Override
    public String execute() throws Exception {

        Almacen almacen = new Almacen();
        
        this.libro = new Libro();
        this.libro.setId(id);
        this.libro.setTitulo(titulo);
        this.libro.setAutor(autor);
        this.libro.setPrecio(precio);
        this.libro.setIsbn(isbn);
        this.libro.setEditorial(editorial);
        
        
        almacen.anyadirLibro(libro);
        listaLibrosAlmacen = almacen.consultaLibrosDisponibles();
        
        
        return SUCCESS;

    }
    
    @Override
    public void validate(){
        
 if ( this.getTitulo().length() == 0  ){
 addFieldError( "titulo", "Titulo name is required." );
 }
 if ( this.getAutor().length() == 0 ){
 addFieldError( "autor", "Autor name is required." );
 }
 if ( this.getPrecio() <= 0 ){
 addFieldError( "precio", "Precio is required and must be bigger than 0" );
 }
  if ( this.getIsbn() <= 0 ){
 addFieldError( "isbn", "Isbn is required" );
 }
   if ( this.getId() <= 0 ){
 addFieldError( "id", "Id is required and must be autoIncrement from BBDD" );
 }
    if ( this.getEditorial() <= 0 || this.getEditorial() > 2){
 addFieldError( "editorial", "Editorial is required and must be 1(Vivens-Vives) or 2(CIRCULO)" );
 }
}

    

    public void setId(int id) {
        this.id = id;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

     public void setEditorial(int editorial) {
        this.editorial = editorial;
    }
    
         public List<Libro> getListaLibrosAlmacen() {
        return listaLibrosAlmacen;
    }

    public void setListaLibrosAlmacen(List<Libro> listaLibrosAlmacen) {
        this.listaLibrosAlmacen = listaLibrosAlmacen;
    }
    
        public int getId() {
        return this.id;
    }

  

    public String getAutor() {
        return this.autor;
    }

   

    public String getTitulo() {
        return this.titulo;
    }


    public float getPrecio() {
        return this.precio;
    }

    public int getIsbn() {
        return this.isbn;
    }


    public int getEditorial() {
        return this.editorial;
    }


     
}
