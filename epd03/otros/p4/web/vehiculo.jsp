<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="parking.Parking"%>
<%@page import="java.util.List"%>
<%@page import="parking.ZonaAzul"%>
<%@page import="parking.Vehiculo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String matricula = (String) session.getAttribute("textoMatricula");
    Vehiculo vehiculo = ZonaAzul.getInstance().consultaVehiculo(matricula);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de Zona Azul</h1>        
        <%if (vehiculo != null) {%>
        <h2>Veh&iacute;culo</h2>
        <table border="1">
            <tr>
                <th>Matr&iacute;cula</th>
            </tr>
            <tr>
                <td><%=vehiculo.getMatricula()%></td>
            </tr>
        </table>
        <%}else{%>
        <strong>No se encontr&oacute; ning&uacute;n veh&iacute;culo.</strong>
        <%}%>
    </body>
</html>
