/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class GestionParking {

    public static ArrayList<Aparcamiento> obtenerRegistro() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        ArrayList<Aparcamiento> parking = new ArrayList<Aparcamiento>();
        try {
            parking.add(new Aparcamiento("1234-BCC", formatoFecha.parse("2016-02-17 20:47:57"), formatoFecha.parse("2016-02-17 21:12:09"), 30));
            parking.add(new Aparcamiento("5919-HZK", formatoFecha.parse("2016-02-19 12:36:12"), formatoFecha.parse("2016-02-19 13:28:42"), 60));
            parking.add(new Aparcamiento("7034-FGH", formatoFecha.parse("2016-02-19 13:30:23"), 90));
            parking.add(new Aparcamiento("0123-CPM", formatoFecha.parse("2016-03-05 14:26:11"), formatoFecha.parse("2016-03-05 17:43:37"), 60));
        } catch (Exception e) {
        }
        return parking;
    }

    public static ArrayList<Aparcamiento> listarCochesExcedidos(ArrayList<Aparcamiento> parking, boolean seExcedio) {
        Iterator<Aparcamiento> iter = parking.iterator();
        Aparcamiento plaza;
        while (iter.hasNext()) {
            plaza = iter.next();
            if (plaza.getHoraSalida() != null) { //Si no está estacionado
                if (seExcedio) {
                    if (plaza.getHoraSalida().getTime() / 60000 - plaza.getHoraEntrada().getTime() / 60000 <= plaza.getTiempoPermitido()) {
                        iter.remove();
                    }
                } else {
                    if (plaza.getHoraSalida().getTime() / 60000 - plaza.getHoraEntrada().getTime() / 60000 > plaza.getTiempoPermitido()) {
                        iter.remove();
                    }
                }
            } else {
                if(seExcedio)
                    iter.remove();
            }
        }
        return parking;
    }
}
