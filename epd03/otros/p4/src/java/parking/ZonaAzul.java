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

public class ZonaAzul {

    private static ZonaAzul uniqueInstance = null;
    private List<Parking> estacionamientos;

    private ZonaAzul() {
        this.inicializaDatos();
    }

    public static ZonaAzul getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ZonaAzul();
        }
        return uniqueInstance;
    }

    public List<Parking> getEstacionamientos() {
        return estacionamientos;
    }

    public void setEstacionamientos(List<Parking> estacionamientos) {
        this.estacionamientos = estacionamientos;
    }

    public void inicializaDatos() {
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

        this.setEstacionamientos(lista);
    }

    public List<Parking> consultaEstacionamientos() {
        return this.getEstacionamientos();
    }

    public List<Parking> consultaEstacionamientosExcedidos() {
        List<Parking> estacionamientosExcedidos = new ArrayList<Parking>();

        for (Parking p : this.getEstacionamientos()) {
            //Fechas entrada y salida
            Calendar fechaEntrada = p.getFechaEntrada();
            Calendar fechaSalida = p.getFechaSalida();

            //El vehículo no sigue estacionado
            if (fechaSalida != null) {
                //Fecha tope con tiempo permitido
                Calendar fechaEntradaMasMinutos = (Calendar) fechaEntrada.clone();
                fechaEntradaMasMinutos.add(Calendar.MINUTE, p.getTiempoPermitido());
                //Milisegundos de fechas
                long milisFechaEntradaMasMinutos = fechaEntradaMasMinutos.getTimeInMillis() / 1000 * 60;
                long milisFechaSalida = fechaSalida.getTimeInMillis() / 1000 * 60;

                //Ha rebasado el tiempo permitido
                if (milisFechaSalida < milisFechaEntradaMasMinutos) {
                    estacionamientosExcedidos.add(p);
                }              
            }
        }
        return estacionamientosExcedidos;
    }
    
    public Vehiculo consultaVehiculo(String matricula){
        Vehiculo vehiculo = null;
        boolean encontrado = false;
        int indice = 0;
        
        while(!encontrado && indice<this.getEstacionamientos().size()){
            Parking parkingAuxiliar = this.getEstacionamientos().get(indice);
            
            if(parkingAuxiliar.getVehiculo().getMatricula().equals(matricula)){
                vehiculo = parkingAuxiliar.getVehiculo();
                encontrado = true;
            }
            indice++;
        }
        
        return vehiculo;
    }
    
    public List<Vehiculo> consultaVehiculosExcedidos(){
        List<Vehiculo> vehiculosExcedidos = new ArrayList<Vehiculo>();
        
        for(Parking p:this.consultaEstacionamientosExcedidos()){
            vehiculosExcedidos.add(p.getVehiculo());
        }
        
        return vehiculosExcedidos;
    }
}
