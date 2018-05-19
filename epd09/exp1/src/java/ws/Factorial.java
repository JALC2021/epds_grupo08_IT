/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebMethod;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author susana
 */
@Path("generic")
public class Factorial {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Factorial
     */
    public Factorial() {
    }

    /**
     * Retrieves representation of an instance of ws.Factorial
     *
     * @param base
     * @return an instance of java.lang.String
     */
//    @WebMethod(operationName = "factorial")
//    public String getFactorial(@QueryParam("base") long base) {
//        return Long.toString(factorial(base));
//    }
    
     @GET
    @Produces(MediaType.TEXT_HTML)
    public String factorialHtml(@QueryParam("base") long base) {
        return "<html><body><h1>" + Long.toString(factorial(base)) + "</h1></body></html>";
    }

    /**
     * PUT method for updating or creating an instance of factorial
     *
     * @param base
     * @return 
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String factorialTextPlain(@QueryParam("base") long base) {
        return Long.toString(factorial(base));

    }

    private long factorial(long base) {
        long resultado;
        if (base >= 1) {
            resultado = factorial(base - 1) * base;
        } else {
            resultado = 1;
        }
        return resultado;
    }
}
