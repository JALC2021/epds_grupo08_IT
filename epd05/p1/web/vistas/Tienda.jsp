<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@taglib  prefix="s" uri="/struts-tags" %>

<%--
    List<Libro> listaLibros = null;
    try {
        Almacen almacen= new Almacen();
        listaLibros = almacen.consultaLibrosDisponibles();
    } catch (Exception ex) {
        out.print(ex.getMessage());
    }
--%>
<html>
    <head>
        
        <title>Epd5_p1</title>
    </head>
    <body>
        <h1>Tienda Electrónica de Libros</h1>
        <!--<form name="formularioTienda" action="LibreriaServlet" method="post">
            <b>Libros</b>
            <select name="seleccionLibros">
        <%-- for (int i = 0; i < listaLibros.size(); i++) {
                Libro libro = listaLibros.get(i);
                String txtLibro = libro.getTitulo() + "; "
                        + libro.getAutor() + "; " + libro.getPrecio();
        %>
        <option value="<%=String.valueOf(libro.getIsbn())%>"><%=txtLibro%></option>
        <% }--%> 
    </select>
    <input type="hidden" name="Accion" value="agregar">
    <input type="submit" name="Agregar" value="Agregar Libro">
</form>-->
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
