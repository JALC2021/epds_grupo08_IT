<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="parking.Parking"%>
<%@page import="java.util.List"%>
<%@page import="parking.ZonaAzul"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    List<Parking> listaParking = ZonaAzul.getInstance().consultaEstacionamientosExcedidos();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de Zona Azul</h1>
        <table border="1">
            <tr>
                <th>Veh&iacute;culo</th>
                <th>Hora de entrada</th>
                <th>Hora de salida</th>
                <th>Tiempo permitido</th>
            </tr>
            <%
                for (Parking p : listaParking) {
                    //Matricula
                    String vehiculo = p.getVehiculo().getMatricula();
                    //Fechas entrada y salida
                    Calendar fechaEntrada = p.getFechaEntrada();
                    Calendar fechaSalida = p.getFechaSalida();
                    //Formato fecha
                    SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
                    String cadenaFechaEntrada = formato.format(fechaEntrada.getTime());
                    String cadenaFechaSalida = fechaSalida == null ? "--" : formato.format(fechaSalida.getTime());
                    //Tiempo permitido
                    int tiempoPermitido = p.getTiempoPermitido();
                    String cadTiempoPermitido = String.valueOf(tiempoPermitido);
            %>
            <tr>
                <td><%=vehiculo%></td>
                <td><%=cadenaFechaEntrada%></td>
                <td><%=cadenaFechaSalida%></td>
                <td><%=cadTiempoPermitido%></td>
            </tr>
            <%}
            %>
        </table>
    </body>
</html>