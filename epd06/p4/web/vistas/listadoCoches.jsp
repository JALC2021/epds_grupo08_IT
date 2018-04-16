

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
        <s:if test="%{coches.isEmpty()}">
            <p>No hay ninguna coincidencia</p>
        </s:if>
        <s:else>
            <table class="tabla" border=1 cellspacing=1 cellpadding=2>
                <tr>
                    <td>Veh&iacute;culo</td>
                    <td>Modelo</td>
                    <td>Hora de entrada</td>
                    <td>Hora de salida</td>
                    <td>Tiempo permitido</td>
                    <td>
                        <s:form action="insertar" namespace="/"> 
                            <s:url var="add" value="/img/add.png" />
                            <s:submit type="image" src="%{#add}"/>
                        </s:form>
                    </td>
                </tr>  
                <s:iterator value="coches">	
                    <tr>
                        <td><s:property value="matricula" /></td>
                        <td><s:property value="modelo" /></td>
                        <td><s:property value="horaEntrada"/></td>
                        <td><s:property value="horaSalida"/></td>
                        <td><s:property value="tiempoPermitido"/></td>
                        <td>
                            <s:form action="editar" namespace="/">
                                <s:hidden name="matricula" value="%{matricula}" />
                                <s:url var="edit" value="/img/edit.png" />
                                <s:submit type="image" src="%{#edit}"/>
                            </s:form>                        
                        </td>
                        <td>
                            <s:form action="eliminar" namespace="/">
                                <s:hidden name="matricula" value="%{matricula}" />
                                <s:url var="delete" value="/img/delete.png" />
                                <s:submit type="image" src="%{#delete}" />   
                            </s:form>
                        </td>
                    </tr>  
                </s:iterator>
            </table>
            <br />
            <h3>Puede consultar los siguientes datos:</h3>
            <s:form action="consultarTiempoExcedido" namespace="/">
                <s:submit value="consultarTiempoExcedido"></s:submit>
            </s:form>

            <hr />
            <s:form action="consultarTiempoNoExcedido" namespace="/">
                <s:submit value="consultarTiempoNoExcedido"></s:submit>
            </s:form>

            <hr />
            <s:form action="consultarCochesAparcados" namespace="/">
                <s:submit value="consultarCochesAparcados"></s:submit>
            </s:form>

            <hr />
            <s:form action="consultarCochesPorMatricula" namespace="/">
                <s:textfield name="matricula" label="Consultar coches por matricula" />
                <s:submit value="consultar"></s:submit>
            </s:form>
        </s:else>


    </body>
</html>
