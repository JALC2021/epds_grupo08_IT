<%@page import="java.util.Iterator"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Aparcamiento"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Problema 2</title>
    </head>
    <body>
        <form action="#" method="post">
            <input type="submit" name="todos" value="Todos">
            <input type="submit" name="excedido" value="Plazas con tiempo excedido">
            <input type="submit" name="cumplido" value="Plazas sin penalización">
        </form>
        <% boolean opcion = true;
            ArrayList<Aparcamiento> aparcamiento;
            if (!request.getParameterNames().hasMoreElements() || request.getParameter("todos") != null) {
                aparcamiento = obtenerRegistro();
            } else {
                if (request.getParameter("excedido") != null) {
                    opcion = true;
                } else if (request.getParameter("cumplido") != null) {
                    opcion = false;
                }
                aparcamiento = listarCochesExcedidos(obtenerRegistro(), opcion);
            }
        %>
        <%!private static ArrayList<Aparcamiento> obtenerRegistro() {
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

            private static ArrayList<Aparcamiento> listarCochesExcedidos(ArrayList<Aparcamiento> parking, boolean seExcedio) {
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
                        if (seExcedio) {
                            iter.remove();
                        }
                    }
                }
                return parking;
            }

            private static void imprimeTabla(ArrayList<Aparcamiento> aparcamiento) {
        %><table border="1">
            <tr>
                <th>Vehículo</th>
                <th>Hora de entrada</th>
                <th>Hora de salida</th>
                <th>Tiempo permitido</th>
            </tr>
            <%for (Aparcamiento plaza : aparcamiento) {%>
            <tr>
                <td><%=plaza.getVehiculo()%></td>
                <td><%=plaza.getHoraEntrada()%></td>
                <td><%if (plaza.getHoraSalida() != null) {
                        out.print(plaza.getHoraSalida());
                    } else {
                        out.print("--");
                    }%></td>
                <td><%=plaza.getTiempoPermitido()%></td>
            </tr>
            <%}%>
        </table>
        <%!
            }
        %>
        <%
            imprimeTabla(aparcamiento);
        %>
    </body>
</html>
