/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author susana
 */
@WebService(serviceName = "servicioAutenticacion")
public class ServicioAutenticacion {

    List<Autenticacion> listaLogueados = new ArrayList<Autenticacion>();

    @WebMethod(operationName = "login")
    public long login(@WebParam(name = "usu") String usuario, @WebParam(name = "pass") String contrasenia) {

        long token = new java.util.GregorianCalendar().getTimeInMillis();
        Autenticacion a = new Autenticacion(usuario, contrasenia, token);

        listaLogueados.add(a);
        return token;
    }

    @WebMethod(operationName = "logout")
    public String logout(@WebParam(name = "token") long token) {
        
        Iterator it = this.listaLogueados.iterator();
        String informacion = "Usuario no encontrado";

        while (it.hasNext()) {
            Autenticacion a = (Autenticacion) it.next();

            if (a.getToken() == token) {
                this.listaLogueados.remove(a);
                informacion = "Usuario eliminado";
            }

        }
        return informacion;
    }

    @WebMethod(operationName = "isAlive")
    public Boolean isAlive(@WebParam(name = "token") long token) {
        
        Iterator it = this.listaLogueados.iterator();
        Boolean usuAutenticado=false;

        while (it.hasNext()) {
            Autenticacion a = (Autenticacion) it.next();

            if (a.getToken() == token) {
                
                usuAutenticado=true;
            }

        }
        return usuAutenticado;
    }
    
    @WebMethod(operationName = "usersRegistered")
    public List<Autenticacion> usersRegistered(){

    return listaLogueados;
    }
}
