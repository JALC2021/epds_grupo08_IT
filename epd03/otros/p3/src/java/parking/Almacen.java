/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
public class Almacen {

    public static List<Parking> consultaVehiculosParking() {
        List<Parking> lista = new ArrayList<Parking>(10);        

//parking 1
        Parking parking1 = new Parking();
        parking1.getVehiculo().setMatricula("0000BBB");
        Calendar fechaEntrada1 = new GregorianCalendar();
        Calendar fechaSalida1 = new GregorianCalendar();
        fechaEntrada1.set(Calendar.HOUR_OF_DAY, 10);
        fechaEntrada1.set(Calendar.MINUTE, 15);
        fechaSalida1.set(Calendar.HOUR_OF_DAY, 11);
        fechaSalida1.set(Calendar.MINUTE, 02);
        parking1.setFechaEntrada(fechaEntrada1);
        parking1.setFechaSalida(fechaSalida1);
        parking1.setTiempoPermitido(30);
        lista.add(parking1);
//parking 2
        Parking parking2 = new Parking();
        parking2.getVehiculo().setMatricula("1111CCC");
        Calendar fechaEntrada2 = new GregorianCalendar();
        Calendar fechaSalida2 = new GregorianCalendar();
        fechaEntrada2.set(Calendar.HOUR_OF_DAY, 10);
        fechaEntrada2.set(Calendar.MINUTE, 30);
        fechaSalida2.set(Calendar.HOUR_OF_DAY, 10);
        fechaSalida2.set(Calendar.MINUTE, 58);
        parking2.setFechaEntrada(fechaEntrada2);
        parking2.setFechaSalida(fechaSalida2);
        parking2.setTiempoPermitido(30);
        lista.add(parking2);
//parking 3
        Parking parking3 = new Parking();
        parking3.getVehiculo().setMatricula("2222DDD");
        Calendar fechaEntrada3 = new GregorianCalendar();
        Calendar fechaSalida3 = new GregorianCalendar();
        fechaEntrada3.set(Calendar.HOUR_OF_DAY, 11);
        fechaEntrada3.set(Calendar.MINUTE, 15);
        parking3.setFechaEntrada(fechaEntrada3);
        parking3.setTiempoPermitido(30);
        lista.add(parking3);
//parking 4
        Parking parking4 = new Parking();
        parking4.getVehiculo().setMatricula("3333FFF");
        Calendar fechaEntrada4 = new GregorianCalendar();
        Calendar fechaSalida4 = new GregorianCalendar();
        fechaEntrada4.set(Calendar.HOUR_OF_DAY, 11);
        fechaEntrada4.set(Calendar.MINUTE, 22);
        parking4.setFechaEntrada(fechaEntrada4);
        parking4.setTiempoPermitido(60);
        lista.add(parking4);

        return lista;
    }
}
