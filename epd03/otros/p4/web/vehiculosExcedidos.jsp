<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="parking.Parking"%>
<%@page import="java.util.List"%>
<%@page import="parking.ZonaAzul"%>
<%@page import="parking.Vehiculo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    List<Vehiculo> listaVehiculos = ZonaAzul.getInstance().consultaVehiculosExcedidos();
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
                <th>Matr&iacute;cula</th>
            </tr>
            <%
                for (Vehiculo v : listaVehiculos) {
            %>
            <tr>
                <td><%=v.getMatricula() %></td>
            </tr>
            <%}
            %>
        </table>
    </body>
</html>
