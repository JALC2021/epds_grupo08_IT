<%@page import="modelo.GestionParking"%>
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
                aparcamiento = GestionParking.obtenerRegistro();
            } else {
                if (request.getParameter("excedido") != null) {
                    opcion = true;
                } else if (request.getParameter("cumplido") != null) {
                    opcion = false;
                }
                aparcamiento = GestionParking.listarCochesExcedidos(GestionParking.obtenerRegistro(), opcion);
            }
        %>
        <%!private static void imprimeTabla(ArrayList<Aparcamiento> aparcamiento) {
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
