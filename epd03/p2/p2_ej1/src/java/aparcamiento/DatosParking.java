/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class DatosParking {

    public static List<CocheModelo> cochesZonaAzul() {
        List<CocheModelo> listaCoches = new ArrayList<CocheModelo>();

        //Coche1
        CocheModelo coche1 = new CocheModelo();

        coche1.setMatricula("12784HIH");

        coche1.setModelo("BMW");

        Calendar horaEntradaCoche1 = new GregorianCalendar();
        Calendar horaSalidaCoche1 = new GregorianCalendar();

        horaEntradaCoche1.set(Calendar.HOUR_OF_DAY, 10);
        horaEntradaCoche1.set(Calendar.MINUTE, 05);
        coche1.setHoraEntrada(horaEntradaCoche1);
        
        

        

        coche1.setTiempoPermitido(15);

        listaCoches.add(coche1);

        //Coche2
        CocheModelo coche2 = new CocheModelo();

        coche2.setMatricula("76234AAC");

        coche2.setModelo("Toyota");

        Calendar horaEntradaCoche2 = new GregorianCalendar();
        Calendar horaSalidaCoche2 = new GregorianCalendar();

        horaEntradaCoche2.set(Calendar.HOUR_OF_DAY, 10);
        horaEntradaCoche2.set(Calendar.MINUTE, 07);
        coche2.setHoraEntrada(horaEntradaCoche2);

        horaSalidaCoche2.set(Calendar.HOUR_OF_DAY, 10);
        horaSalidaCoche2.set(Calendar.MINUTE, 35);
        coche2.setHoraSalida(horaSalidaCoche2);

        coche2.setTiempoPermitido(30);

        listaCoches.add(coche2);

        //Coche3
        CocheModelo coche3 = new CocheModelo();

        coche3.setMatricula("32162BAQ");

        coche3.setModelo("Audi");

        Calendar horaEntradaCoche3 = new GregorianCalendar();
        Calendar horaSalidaCoche3 = new GregorianCalendar();

        horaEntradaCoche3.set(Calendar.HOUR_OF_DAY, 10);
        horaEntradaCoche3.set(Calendar.MINUTE, 45);
        coche3.setHoraEntrada(horaEntradaCoche3);
        
         horaSalidaCoche3.set(Calendar.HOUR_OF_DAY, 11);
        horaSalidaCoche3.set(Calendar.MINUTE, 05);
        coche3.setHoraSalida(horaSalidaCoche3);

        

        coche3.setTiempoPermitido(90);

        listaCoches.add(coche3);

        //Coche4
        CocheModelo coche4 = new CocheModelo();

        coche4.setMatricula("87823CDA");

        coche4.setModelo("Mercedes");

        Calendar horaEntradaCoche4 = new GregorianCalendar();
        Calendar horaSalidaCoche4= new GregorianCalendar();

        horaEntradaCoche4.set(Calendar.HOUR_OF_DAY, 10);
        horaEntradaCoche4.set(Calendar.MINUTE, 46);
        coche4.setHoraEntrada(horaEntradaCoche4);

        horaSalidaCoche4.set(Calendar.HOUR_OF_DAY, 11);
        horaSalidaCoche4.set(Calendar.MINUTE, 05);
        coche4.setHoraSalida(horaSalidaCoche4);

        coche4.setTiempoPermitido(15);

        listaCoches.add(coche4);

        return listaCoches;

    }

}
