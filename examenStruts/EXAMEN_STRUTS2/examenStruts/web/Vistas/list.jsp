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
        <!--        Esto es select animal con botón de filtro-->


        <table border=1 cellspacing=1 cellpadding=2 width="100%" bgcolor="#FFFFFF">
            <tr>
                <td><b>Identificador</b></td>
                <td><b>Tipo Animal</b></td>
                <td><b>Pais</b></td>
                <td><b>Precio</b></td>
                <td><b>Email</b></td>
               
            </tr>
            <s:iterator value="reserva">
                <tr>
                    <s:hidden value="id"></s:hidden>
                    <td><s:property value="identificador"></s:property></td>
                    <td><s:property value="tipoAnimal"></s:property></td>
                    <td><s:property value="pais"></s:property></td>
                    <td><s:property value="precio"></s:property></td>
                    <td><s:property value="email"></s:property></td>
                   
                </tr>

            </s:iterator>
        </table>

    </body>
</html>

