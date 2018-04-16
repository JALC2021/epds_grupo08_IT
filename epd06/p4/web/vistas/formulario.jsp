

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>p3_Epd5</title>
    </head>
    <body>
        <h1>Aparcamiento Zona Azul</h1>
         <h3>Utilice este formulario para insertar un coche nuevo</h3>
        <br />        
        <s:form action="insertCoche" namespace="/">
            <s:textfield name="matricula" label="Matricula" />
            <s:textfield name="modelo" label="Modelo" />
            <s:textfield name="horaEntrada" label="Hora de entrada" />
            <s:textfield name="horaSalida" label="Hora de salida" />
            <s:textfield name="tiempoPermitido" label="Tiempo permitido" />
            <s:submit value="Añadir" />
        </s:form>
        <br/>
        <h3>Utilice este formulario para modificar un coche existente</h3>
        <s:form action="editCoche" namespace="/">
            <s:textfield name="matricula" value="%{matricula}" label="Matricula" />
            <s:textfield name="modelo" label="Modelo" />
            <s:textfield name="horaEntrada" label="Hora de entrada" />
            <s:textfield name="horaSalida" label="Hora de salida" />
            <s:textfield name="tiempoPermitido" label="Tiempo permitido" />
            <s:submit value="Editar" />
        </s:form>
        
    </body>
</html>
