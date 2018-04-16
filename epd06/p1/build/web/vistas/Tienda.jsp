<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@taglib  prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet" type="text/css" href="../style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tienda Electrónica de Libros</h1>
  
        <a href="AnyadirLibro.jsp">Añade Libros a la BBDD</a>
        </br>
        </br>
        </br>
        <s:form action="agregarLibrosAction">
            <s:select listKey="isbn" label="Libros" list="listaLibrosAlmacen" name="libroSeleccion" 
                      listValue="%{titulo + '; '+ autor+'; '+ precio}"/>
            <s:submit value="Agregar"></s:submit>
        </s:form>
        <hr>
        <s:set name="listaCarro" value="listaLibrosSolicitados" />
        <s:if test="%{#listaCarro!=null}">
            <s:include value="CarroCompra.jsp" />
        </s:if>
    </body>
</html>
