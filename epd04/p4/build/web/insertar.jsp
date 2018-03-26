<%-- 
    Document   : insertar
    Created on : 24-mar-2018, 13:45:34
    Author     : susana
--%>
<%@page import="java.util.List"%>
<%@page import="Modelo.CocheModelo"%>

<% List<CocheModelo> coches=(List<CocheModelo>)request.getAttribute("insertarRegistro");%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Epd4_p4</title>
    </head>
    <body>
        <h1>A&ntilde;adir registro coche</h1>
        <form action="ParkingServlet" method="post">
            <h3>Introduzca los siguientes datos por favor:</h3>
            <input type="hidden" name="accion" value="insertar">
            <p><label>Matr&iacute;cula&nbsp;(*):&nbsp;</label><input type="text" name="matricula" required="required"></p>
            <p><label>Modelo&nbsp;(*):&nbsp;</label><input type="text" name="modelo" required="required"></p>
            <p>Introduzca las horas en formato de 6 d&iacute;gitos como se muestra en el ejemplo.&nbsp;Ej:&nbsp;12:45:00</p>
            <p><label>Hora de entrada&nbsp;(*):&nbsp;</label><input type="text" name="horaE" required="required"></p>
            <p><label>Hora de salida&nbsp;(*):&nbsp;</label><input type="text" name="horaS" required="required"></p>
            <p><label>Tiempo permitido&nbsp;(*):&nbsp;</label><input type="text" name="tiempoMax" required="required"></p>
            <p><input type="submit" name="enviar" value="Aceptar"></p>
            <hr /><p>(*) Todos los campos son obligatorios</p>
        </form>
        
   
         <%@include file="footer.jsp"%>
        
    </body>
</html>
