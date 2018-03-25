<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Modelo.CocheModelo"%>
<%@page import="Modelo.persistencia.DatosParking"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%
    List<CocheModelo> cochesAparcados = (List<CocheModelo>) request.getAttribute("coches");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css" />
        <title>Epd3_p4</title>
    </head>
    <body>
        <header><h1>Aparcamiento Zona Azul</h1></header>
        <div class="container">
           
            

            <script type='text/javascript' src="//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>


            <table border="2">
                <tr>
                    <th>Matricula</th>
                    <th>Modelo</th>
                    <th>Hora de entrada</th>
                    <th>Hora de salida</th>
                    <th>Tiempo permitido</th>
                </tr>
                <%                    try {
                        if (cochesAparcados.isEmpty()) {
                            out.write("La lista de los coche esta vacia");
                        } else {

                            for (CocheModelo cm : cochesAparcados) {

                                //Matricula
                                String matricula = cm.getMatricula();
//                        //Modelo
                                String modelo = cm.getModelo();
//                        //Hora entrada y salida
                                Date horaEntrada = cm.getHoraEntrada();
                                 Date horaSalida = cm.getHoraSalida();
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

            <div class="row">

                <div class="col-25">
                    <label>¿Que vehiculos quieres ver?</label>
                </div>
                <div class="col-75">
                    <form name="TiempoPermitido" action="ParkingServlet" method="post">
                        <input type="hidden" name="accion" value="excedenTiempo">
                        <label>Vehiculos que exceden el tiempo en zona azul</label><input type="submit" name="exceden" value="si">
                    </form>
                    <form action="ParkingServlet" method="post">
                        <input type="hidden" name="accion" value="noExcedenTiempo">
                        <p><label>Vehiculos que no exceden el tiempo en zona azul</label><input type="submit" name="noExceden" value="no"></p>
                    </form>
                </div>
            </div>
           
            <form name="buscarPorMatricula" action="ParkingServlet" method="post">
                <div class="row">
                    <div class="col-25">
                        <label>Buscar coches por matricula</label>
                    </div>
                    <div class="col-75">
                        <input type="text" name="matriculaCoche">
                        <input type="hidden" name="accion" value="buscarMatricula">
                        <input type="submit" name="buscar" value="buscar">

                    </div>
                </div>
            </form>


            <form name="cohesAunAparcados" action="ParkingServlet" method="post">
                <div class="row">
                    <div class="col-25">
                        <label>Coches que siguen en el aparcamiento</label>
                    </div>
                    <div class="col-75">
                        <input type="hidden" name="accion" value="buscarAparcados">
                        <input type="submit" name="buscar1" value="buscar">

                    </div>
                </div>
            </form>

        </div>
        <%@include file="footer.jsp"%>
    </body>
</html>
