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
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author susana
 */
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
        vehiculo.setModelo(resultado.getString("modelo"));

        vehiculo.setHoraEntrada(resultado.getTime("hora_entrada"));
        vehiculo.setHoraSalida(resultado.getTime("hora_salida"));

        vehiculo.setTiempoPermitido(Integer.parseInt(resultado.getString("tiempo_permitido")));
        return vehiculo;
    }

    public static List<CocheModelo> cochesZonaAzul() throws SQLException {
        List<CocheModelo> listaCoches = new ArrayList<CocheModelo>();

        CocheModelo v = new CocheModelo();
        Connection conexion = DriverManager.getConnection(url, usuario, pass);
        Statement solicitud = (Statement) conexion.createStatement();
        ResultSet resultados = solicitud.executeQuery("SELECT * FROM coche");
        while (resultados.next()) {
            v = Modelo.persistencia.DatosParking.ResultSetToCoche(resultados);//resultado actual
            listaCoches.add(v);
        }
        resultados.close();
        solicitud.close();
        conexion.close();

        return listaCoches;

    }

    public static void insertarCoche(String matricula, String modelo, Time hora_entrada, Time hora_salida, int tiempoPermitido) throws SQLException {

        Connection conexion = DriverManager.getConnection(url, usuario, pass);
        Statement solicitud = (Statement) conexion.createStatement();

        int resultado = solicitud.executeUpdate("INSERT INTO `coche`(`matricula`, `modelo`, `hora_entrada`, `hora_salida`, `tiempo_permitido`) VALUES ('" + matricula + "','" + modelo + "','" + hora_entrada + "','" + hora_salida + "'," + tiempoPermitido + ")");

        solicitud.close();
        conexion.close();
    }

    public static int eliminarCoche(String matricula) throws SQLException {

        Connection conexion = DriverManager.getConnection(url, usuario, pass);
        Statement solicitud = (Statement) conexion.createStatement();

        int resultado = solicitud.executeUpdate("DELETE FROM `coche` WHERE `matricula` ='" + matricula + "'");

        solicitud.close();
        conexion.close();

        return resultado;
    }

    public static int editarCoche(String matricula, String matriculaActual, String modelo, Time hora_entrada, Time hora_salida, int tiempoPermitido) throws SQLException {
        Connection conexion = DriverManager.getConnection(url, usuario, pass);
        Statement solicitud = (Statement) conexion.createStatement();

        int resultado = solicitud.executeUpdate("UPDATE `coche` SET `matricula`='"+matriculaActual+"',`modelo`='"+modelo+"',`hora_entrada`='"+hora_entrada+"',`hora_salida`='"+hora_salida+"',`tiempo_permitido`="+tiempoPermitido+" WHERE `matricula`='"+matricula+"'");

        solicitud.close();
        conexion.close();
        return resultado;
    }

}
