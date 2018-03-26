<%-- 
    Document   : editar
    Created on : 26-mar-2018, 12:59:13
    Author     : susana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Epd4_p4</title>
    </head>
    <body>
        <h1>Modificar registro coche</h1>
         <form action="ParkingServlet" method="post">
            <h3>Confirme la matr&iacute;cula del coche que desea actualizar por favor:</h3>
            <input type="hidden" name="accion" value="editar">
            <p><label>Matr&iacute;cula&nbsp;(*):&nbsp;</label><input type="text" name="matricula" required="required"></p>
            <hr>
            <p>Introduzca los nuevos datos</p>
            <p><label>Matr&iacute;cula&nbsp;(*):&nbsp;</label><input type="text" name="matriculaActual" required="required"></p>
            <p><label>Modelo&nbsp;(*):&nbsp;</label><input type="text" name="modelo" required="required"></p>
            <p>Introduzca las horas en formato de 6 d&iacute;gitos como se muestra en el ejemplo.&nbsp;Ej:&nbsp;12:45:00</p>
            <p><label>Hora de entrada&nbsp;(*):&nbsp;</label><input type="text" name="horaE" required="required"></p>
            <p><label>Hora de salida&nbsp;(*):&nbsp;</label><input type="text" name="horaS" required="required"></p>
            <p><label>Tiempo permitido&nbsp;(*):&nbsp;</label><input type="text" name="tiempoMax" required="required"></p>
            <p><input type="submit" name="enviar" value="Aceptar"></p>
          <p>(*) Todos los campos son obligatorios</p>
        </form>
        
   
         <%@include file="footer.jsp"%>
    </body>
</html>
