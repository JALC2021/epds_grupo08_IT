<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LIBROS COMPRADOS:</h1>
    <center>
        <table border=1 cellspacing=1 cellpadding=2 width="100%" bgcolor="#FFFFFF">
            <tr>
                <td><b>Titulo</b></td>
                <td><b>Autor</b></td>
                <td><b>Editorial</b></td>
                <td><b>Precio</b></td>
                <td><b>Cantidad</b></td>
                <td><b>Subtotal</b></td>
            </tr>
   
            <s:if test="%{listaLibrosComprados!=null}">
                <s:set var="subtotal" value="0"/>
                <s:iterator value="listaLibrosComprados">
                    <tr>
                        <td><b><s:property value="titulo"></s:property></b></td>
                        <td><b><s:property value="autor"></s:property></b></td>
                        <td><b><s:property value="nombreEditorial"></s:property></b></td>
                        <td><b><s:property value="precio"></s:property></b></td>
                        <td><b><s:property value="cantidad"></s:property></b></td>
                        <td><b><s:set var="subtotal" value="#subtotal+(precio*cantidad)"></s:set></b></td>
                        </tr>
                       
                    <br>
                </s:iterator>
                <tr>
                    <td><b>TOTAL</b></td>
                    <td><b></b></td>
                    <td><b></b></td>
                    <td><b></b></td>
                    <td><b></b></td>
                    <td><b><s:property value="#subtotal"/></b></td>
                </tr>
            
            </s:if>
            <s:else>
                <tr>
                    <td><b>TOTAL</b></td>
                    <td><b></b></td>
                    <td><b></b></td>
                    <td><b>0</b></td>
                    <td></td>
                </tr>
            </s:else>
            
        </table>
    </center>
</body>
</html>