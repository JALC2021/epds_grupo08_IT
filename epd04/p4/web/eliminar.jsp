<%-- 
    Document   : eliminar
    Created on : 25-mar-2018, 21:25:39
    Author     : susana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Eliminar registro coche</h1>
        <form action="ParkingServlet" method="post">
            <input type="hidden" name="accion" value="eliminar">
            <p>Confirme la matr&iacute;cula del coche que desea eliminar por favor:</p>
            <p><label>Matr&iacute;cula&nbsp;(*):&nbsp;</label><input type="text" name="matricula" required="required"></p>
            <hr>
            <p></p>
            <p><input type="submit" name="enviar" value="Aceptar"></p>

        </form>
        <%@include file="footer.jsp"%>
    </body>
</html>
