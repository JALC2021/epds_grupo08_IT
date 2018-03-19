/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.persistencia;

import Modelo.CocheModelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DatosParking {

    private static final String controlador = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost/parking";
    private static final String usuario = "root";
    private static final String pass = "";

    static {
        try {
            Class.forName(controlador);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error loading JDBC Driver" + e);
        }
    }

    public static CocheModelo ResultSetToCoche(ResultSet resultado) throws SQLException {
        CocheModelo vehiculo = new CocheModelo();
        vehiculo.setMatricula(resultado.getString("matricula"));
        vehiculo.setHoraEntrada((Calendar) resultado.getObject("horaEntrada"));
        vehiculo.setHoraSalida((Calendar) resultado.getObject("horaSalida"));
        vehiculo.setTiempoPermitido(Integer.parseInt(resultado.getString("tiempoPermitido")));
        return vehiculo;
    }

    public static List<CocheModelo> cochesZonaAzul() throws SQLException {
        List<CocheModelo> listaCoches = new ArrayList<CocheModelo>();

        CocheModelo v = new CocheModelo();
        Connection conexion = DriverManager.getConnection(url, usuario, pass);
        Statement solicitud = (Statement) conexion.createStatement();
        ResultSet resultados = solicitud.executeQuery("SELECT * FROM coche");
        while (resultados.next()) {
            v = Modelo.persistencia.DatosParking.ResultSetToCoche(resultados);
            listaCoches.add(v);
        }
        resultados.close();
        solicitud.close();
        conexion.close();

        return listaCoches;

    }

    public static List<CocheModelo> vehiculosExceden(boolean opcion) throws SQLException {

        List<CocheModelo> listaCochesExceden = new ArrayList<CocheModelo>();
        List<CocheModelo> listaCochesNoExceden = new ArrayList<CocheModelo>();

        Connection conexion = DriverManager.getConnection(url, usuario, pass);
        Statement solicitud = (Statement) conexion.createStatement();
        ResultSet resultados = solicitud.executeQuery("SELECT * FROM coche");

        while (resultados.next()) {

            CocheModelo cocheExcede = Modelo.persistencia.DatosParking.ResultSetToCoche(resultados);
            //Hora entrada y salida
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
            Date horaEntrada = cocheExcede.getHoraEntrada().getTime();
            String HoraEntrada = formatoHora.format(horaEntrada.getTime());

            int diferencia = -1;

            String HoraSalida = "--";
            Calendar horaSalida = cocheExcede.getHoraSalida();

            if (horaSalida != null) {
                Date horaSalida1 = cocheExcede.getHoraSalida().getTime();
                HoraSalida = formatoHora.format(horaSalida.getTime());
                long minutosHoraEntrada = horaEntrada.getTime();
                long minutosHoraSalida = horaSalida1.getTime();
                diferencia = (int) ((minutosHoraSalida - minutosHoraEntrada) / (1000 * 60));

            } else {
                HoraSalida = "--";
                diferencia = -1;
            }

            //Tiempo permitido
            int tiempoPermitido = cocheExcede.getTiempoPermitido();
            String TiempoPermitido = String.valueOf(tiempoPermitido);

            cocheExcede.setHoraEntradaConFormato(HoraEntrada);
            cocheExcede.setHoraSalidaConFormato(HoraSalida);

            if (diferencia > tiempoPermitido) {

                listaCochesExceden.add(cocheExcede);

            } else {
                listaCochesNoExceden.add(cocheExcede);
            }
        }
        resultados.close();
        solicitud.close();
        conexion.close();

        if (opcion == true) {
            return listaCochesExceden;
        } else {
            return listaCochesNoExceden;
        }

    }

    
    public static List<CocheModelo> busquedaCoches(String matriculaRecibida) throws SQLException {

        List<CocheModelo> listaCochesMatricula = new ArrayList<CocheModelo>();
        
        Connection conexion = DriverManager.getConnection(url, usuario, pass);
        Statement solicitud = (Statement) conexion.createStatement();
        ResultSet resultados = solicitud.executeQuery("SELECT * FROM coche");

        while (resultados.next()) {

            CocheModelo cocheEnc = Modelo.persistencia.DatosParking.ResultSetToCoche(resultados);
        
            //Hora entrada y salida
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
            Date horaEntrada = cocheEnc.getHoraEntrada().getTime();
            String HoraEntrada = formatoHora.format(horaEntrada.getTime());

            int diferencia = -1;
            String HoraSalida = "";
            Calendar horaSalida = cocheEnc.getHoraSalida();

            if (horaSalida != null) {
                Date horaSalida1 = cocheEnc.getHoraSalida().getTime();
                HoraSalida = formatoHora.format(horaSalida.getTime());
                long minutosHoraEntrada = horaEntrada.getTime();
                long minutosHoraSalida = horaSalida1.getTime();
                diferencia = (int) ((minutosHoraSalida - minutosHoraEntrada) / (1000 * 60));

            } else {
                HoraSalida = "--";
                diferencia = -1;
            }
            //Tiempo permitido
            int tiempoPermitido = cocheEnc.getTiempoPermitido();
            String TiempoPermitido = String.valueOf(tiempoPermitido);

            cocheEnc.setHoraEntradaConFormato(HoraEntrada);
            cocheEnc.setHoraSalidaConFormato(HoraSalida);

            if (cocheEnc.getMatricula().startsWith(matriculaRecibida)) {

                listaCochesMatricula.add(cocheEnc);

            }
        }
        resultados.close();
        solicitud.close();
        conexion.close();
        return listaCochesMatricula;
    }

    public static List<CocheModelo> busquedaCochesAparcados() throws SQLException {

        List<CocheModelo> listaCochesAparcados = new ArrayList<CocheModelo>();
        Connection conexion = DriverManager.getConnection(url, usuario, pass);
        Statement solicitud = (Statement) conexion.createStatement();
        ResultSet resultados = solicitud.executeQuery("SELECT * FROM coche");

        while (resultados.next()) {

            CocheModelo cocheAparc = Modelo.persistencia.DatosParking.ResultSetToCoche(resultados);
           
            //Hora entrada y salida
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
            Date horaEntrada = cocheAparc.getHoraEntrada().getTime();
            String HoraEntrada = formatoHora.format(horaEntrada.getTime());

            int diferencia = -1;
            String HoraSalida = "";
            Calendar horaSalida = cocheAparc.getHoraSalida();

            if (horaSalida != null) {
                Date horaSalida1 = cocheAparc.getHoraSalida().getTime();
                HoraSalida = formatoHora.format(horaSalida.getTime());
                long minutosHoraEntrada = horaEntrada.getTime();
                long minutosHoraSalida = horaSalida1.getTime();
                diferencia = (int) ((minutosHoraSalida - minutosHoraEntrada) / (1000 * 60));

            } else {
                HoraSalida = "--";
                diferencia = -1;
            }
            //Tiempo permitido
            int tiempoPermitido = cocheAparc.getTiempoPermitido();
            String TiempoPermitido = String.valueOf(tiempoPermitido);

            cocheAparc.setHoraEntradaConFormato(HoraEntrada);
            cocheAparc.setHoraSalidaConFormato(HoraSalida);

            if (HoraSalida == "--") {
                listaCochesAparcados.add(cocheAparc);
            }

        }
        resultados.close();
        solicitud.close();
        conexion.close();
        return listaCochesAparcados;
    }

}
