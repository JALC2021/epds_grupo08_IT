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
        
        <h1>Parking Zona Azul</h1>
        
        <table class="tabla" border=1 cellspacing=1 cellpadding=2>
            <tr>
                <td>Matr&iacute;cula</td>
                <td>Modelo</td>
                <td>Hora de entrada</td>
                <td>Hora de salida</td>
                <td>Tiempo permitido</td>
                <td>
                    <s:form action="insertar" namespace="/aparcamiento"> 
                      <s:url var="add" value="/img/crear.png" />
                      <s:submit type="image" src="%{#add}"/>
                    </s:form>
                </td>
            </tr>
            <s:iterator value="vehiculos">	
                <tr>
                    <td><s:property value="matricula" /></td>
                    <td><s:property value="modelo" /></td>
                    <td><s:property value="horaEntrada"/></td>
                    <td><s:property value="horaSalida"/></td>
                    <td><s:property value="tiempoPermitido"/></td>
                    <td>
                        <s:form action="editar" namespace="/aparcamiento">
                            <s:hidden name="matricula" value="%{matricula}" />
                            <s:url var="edit" value="/img/editar.png" />
                            <s:submit type="image" src="%{#edit}"/>
                        </s:form>                        
                    </td>
                    <td>
                        <s:form action="eliminar" namespace="/aparcamiento">
                            <s:hidden name="matricula" value="%{matricula}" />
                            <s:url var="delete" value="/img/eliminar.png" />
                            <s:submit type="image" src="%{#delete}" />   
                        </s:form>
                    </td>
                </tr>
            </s:iterator>	
        </table>
       </body>
</html>