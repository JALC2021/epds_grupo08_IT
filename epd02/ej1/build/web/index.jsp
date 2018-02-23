

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="estiloIndex.css">
        <title>ej1-epd2</title>
    </head>
    <body>
        <form action="resultado.jsp" method="post">
        <h1>Introduzca la sigiente informaci&oacute;n</h1>
        <p><label>Email: </label><input type="email" name="email" placeholder="ejemplo@gmail.com" required></p>
        <p><label>Nombre de usuario: </label><input type="text" name="nombreUsu" required>
        <p><label>Contrase&ntilde;a: </label><input type="password" name="contrasenia" required></p>
        <p><input type="submit" name="enviar" value="Enviar"></p>
        <span class="obligatorio">(*) Todos los campos son obligatorios</span>
        </form>
        <%@include file="footer.jsp" %>
    </body>
</html>
