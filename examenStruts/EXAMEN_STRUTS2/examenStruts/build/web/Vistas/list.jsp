<%-- 
    Document   : list
    Created on : 19-abr-2018, 18:47:25
    Author     : susana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reserva de las Guardas. System Manager</title>
    </head>
    <body>
        <h1>Reserva de las Guardas. System Manager</h1> 

        <!-- Desplegable con animales con botones filtrar por animal y borrar filtro-->

   
        <s:form id="filtro" name="filtro" action="filtrar" namespace="/" method="post">
            <table>
                <tr>
                    <td class="tdLabel"><s:label for="filtro_tipoAnimal" class="label" value="Animal:"></s:label></td>
                    <td><s:select name="tipoAnimal" id="filtro_tipoAnimal" list="animales" listKey="animal" listValue="animal"></s:select></td>
                </tr>
                
                <tr>
                  <td colspan="2"><div align="right"><s:submit id="filtro_0" value="Filter by animal"/></div></td>   
                </tr>
                  
            </table>
        </s:form>

        <s:form id="listado" name="listado" action="controladorAnimal" method="post">
              <table>
                <tr>
                   <td colspan="2"><div align="right"><s:submit id="listado_0" value="Remove filter"/></div></td>
                </tr>                             
            </table>
            
        </s:form>
            

        <!-- Tabla con listado de animales y botones de añadir animales (en la cabecera) y borrar animal (por cada fila)-->

        <table border=1 cellspacing=1 cellpadding=2 width="100%" bgcolor="#FFFFFF">
            <tr>
                <td><b>Identificador</b></td>
                <td><b>Tipo Animal</b></td>
                <td><b>Pais</b></td>
                <td><b>Precio</b></td>
                <td><b>Email</b></td>
                <td><s:form id="formulario" name="formulario" action="insertar" method="post">
                        <div align="right"><s:submit id="formulario_0" value="Add"></s:submit></div></s:form></td>
                    </tr>

            <s:iterator value="reserva">
                <tr>
                    <s:hidden value="id"></s:hidden>
                    <td><s:property value="identificador"></s:property></td>
                    <td><s:property value="tipoAnimal"></s:property></td>
                    <td><s:property value="pais"></s:property></td>
                    <td><s:property value="precio"></s:property></td>
                    <td><s:property value="email"></s:property></td>
                    <td><s:form id="borrarAnimal" name="borrarAnimal" action="eliminar" method="post">
                            <s:hidden name="id"/>
                            <div align="right"><s:submit id="borrarAnimal_0" value="Delete"/></div></s:form></td>
                </tr>

            </s:iterator>

        </table>


    </body>
</html>

