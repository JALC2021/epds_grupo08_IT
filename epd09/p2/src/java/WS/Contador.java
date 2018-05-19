/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;



@WebService(serviceName = "Contador")
public class Contador {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "contador")
    public String contador(@WebParam(name="palabra")String palabra) {
        
        return "Palabra: "+palabra+", Número de carácteres que contiene "+palabra+": "+palabra.length();
    }
}
