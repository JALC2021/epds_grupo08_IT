/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epd7;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author susana
 */
@WebService(serviceName = "exp1WebService")
public class exp1WebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
   @WebMethod(operationName = "resta")
    public int resta(@WebParam(name = "numero1") int num1,@WebParam(name = "numero2") int num2){
        int resultado;
        resultado=num2-num1;
        return resultado;
    }
}
