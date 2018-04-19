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

        <s:form id="filtro" name="filtro" action="listadoFiltro" method="post">
            <table>
                <tr>
                    <td class="tdLabel"><label for="filtro_tipoAnimal" class="label">Animal:</label></td>
                    <td><s:select name="tipoAnimal" list="listaTipoAnimal" listKey="animal" listValue="animal" /></td>                  
                </tr>
                <tr>
                    <td colspan="2"><div align="right"><s:submit id="filtro_0" value="Filter by animal"/>
                        </div></td>
                </tr>
            </table>
        </s:form>
        
        <s:form id="listado" name="listado" action="listadoReserva" method="post">
            <table>
                <tr>
                    <td colspan="2"><div align="right"><s:submit id="listado_0" value="Remove filter"/>
                        </div></td>
                </tr>                             
            </table>
        </s:form>   

        <table border=1 cellspacing=1 cellpadding=2 width="100%" bgcolor="#FFFFFF">
            <tr>
                <td><b>Identificador</b></td>
                <td><b>Tipo Animal</b></td>
                <td><b>Pais</b></td>
                <td><b>Precio</b></td>
                <td><b>Email</b></td>
                <td>
                    <s:form id="formulario" name="formulario" action="addAnimal" method="post">
                        <div align="right"><s:submit id="formulario_0" value="Add" /></div>
                    </s:form>
                </td>
            </tr>

            <s:iterator value="listadoAnimales">
                <tr>
                    <s:hidden value="id" />
                    <td><s:property value="identificador" /></td>
                    <td><s:property value="tipoAnimal" /></td>
                    <td><s:property value="pais" /></td>
                    <td><s:property value="precio" /></td>
                    <td><s:property value="email" /></td>
                    <td>
                        <s:form id="borrarAnimal" name="borrarAnimal" action="borrarAnimal" method="post">
                            <div align="right"><s:submit id="borrarAnimal_0" value="Delete"/>
                                <s:hidden name="id" />
                            </div>
                        </s:form>
                    </td>
                </tr>
            </s:iterator>
        </table>
    </body>
</html>