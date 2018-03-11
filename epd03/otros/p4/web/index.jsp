<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Zona Azul</h1>
        <form name="formularioZonaAzul" action="ZonaAzulServlet" method="post">
            <input type="submit" name="mostrarEstacionamientos" value="Mostrar estacionamientos">
            <input type="submit" name="mostrarEstacionamientosExcedidos" value="Mostrar estacionamientos excedidos">
            <input type="submit" name="mostrarVehiculosExcedidos" value="Mostrar veh&iacute;culos excedidos">
            <hr>
            <label>Matr&iacute;cula: </label><input type="text" name="textoMatricula">
            <input type="submit" name="buscarVehiculo" value="Buscar Veh&iacute;culo">
        </form>
    </body>
</html>
