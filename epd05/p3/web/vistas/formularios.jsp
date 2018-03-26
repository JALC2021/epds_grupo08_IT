<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css">
        <title>Epd5_p3</title>
    </head>
    <body>
       
        <h1>A&ntilde;a nuevo veh&iacute;culo</h1>
        <hr />        
        <s:form action="insertVehiculo" namespace="/aparcamiento">
            <s:textfield name="matricula" label="Matrícula" />
            <s:textfield name="modelo" label="Modelo" />
            <s:textfield name="horaEntrada" label="Hora de entrada" />
            <s:textfield name="horaSalida" label="Hora de salida" />
            <s:textfield name="tiempoPermitido" label="Tiempo permitido de estancia" />
            <s:submit value="Añadir" />
        </s:form>
        
         <h1>Modifique un veh&iacute;culo</h1>
        <br/>
        <s:form action="editVehiculo" namespace="/aparcamiento">
            <s:textfield name="matricula" value="%{matricula}" label="Matrícula" />
            <s:textfield name="modelo" value="%{modelo}" label="Modelo" />
            <s:textfield name="horaEntrada" label="Hora de entrada" />
            <s:textfield name="horaSalida" label="Hora de salida" />
            <s:textfield name="tiempoPermitido" label="Tiempo permitido de estancia" />
            <s:submit value="Editar" />
        </s:form>
    </body>
</html>
    </body>
</html>

