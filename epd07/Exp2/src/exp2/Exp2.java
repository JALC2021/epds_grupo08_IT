/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp2;
import java.io.BufferedReader;
import java.util.Scanner;
/**
 *
 * @author susana
 */
public class Exp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int entradaNum1=0,entradaNum2=0;
         
        System.out.println("Introduzca numero 1");
        Scanner numero1=new Scanner(System.in);
        entradaNum1=numero1.nextInt();
        
         System.out.println("Introduzca numero 2");
        Scanner numero2=new Scanner(System.in);
       
        
        entradaNum2=numero2.nextInt();
        int res=resta(entradaNum1, entradaNum2);
       System.out.println(res);
        
        
    }

    private static int resta(int numero1, int numero2) {
        epd7.Exp1WebService_Service service = new epd7.Exp1WebService_Service();
        epd7.Exp1WebService port = service.getExp1WebServicePort();
        return port.resta(numero1, numero2);
    }
    
}
