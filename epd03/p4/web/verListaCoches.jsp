<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="true"%>

<%@page import="Modelo.CocheModelo"%>
<%@page import="Modelo.persistencia.DatosParking"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%
    List<CocheModelo> cochesAparcados = (List<CocheModelo>) session.getAttribute("coches");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" type="text/css" href="style.css" />
        <title>Epd3_p4</title>
    </head>
    <body>
        <header><h1>Aparcamiento Zona Azul</h1></header>
        <div class="container">

            <table border="2">
                <tr>
                    <th>Matricula</th>
                    <th>Modelo</th>
                    <th>Hora de entrada</th>
                    <th>Hora de salida</th>
                    <th>Tiempo permitido</th>
                </tr>
                <%
                    try {
                        if (cochesAparcados.isEmpty()) {
                            out.write("La lista de los coche esta vacia");
                        } else {

                            for (CocheModelo cm : cochesAparcados) {

                                //Matricula
                                String matricula = cm.getMatricula();
//                        //Modelo
                                String modelo = cm.getModelo();
//                        //Hora entrada y salida
                                Calendar horaEntrada = cm.getHoraEntrada();
                                Calendar horaSalida = cm.getHoraSalida();
//                        //Formato fecha
                                SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
                                String HoraEntrada = formatoHora.format(horaEntrada.getTime());
                                String HoraSalida = horaSalida == null ? "--" : formatoHora.format(horaSalida.getTime());
//                        //Tiempo permitido
                                int tiempoPermitido = cm.getTiempoPermitido();
                                String TiempoPermitido = String.valueOf(tiempoPermitido);
                %>
                <tr>
                    <td><%=matricula%></td>
                    <td><%=modelo%></td>
                    <td><%=horaEntrada%></td>
                    <td><%=horaSalida%></td>
                    <td><%=tiempoPermitido%></td>
                </tr>
                <%}
                        }
                    } catch (Exception e) {
                        out.write(e.getMessage());
                    }%>

            </table>
            <%//@include file="Vista2.jsp"%> 

        </div>
        <%@include file="footer.jsp"%>
    </body>
</html>