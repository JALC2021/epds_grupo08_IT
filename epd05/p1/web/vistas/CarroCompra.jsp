<%@page session="true"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!--<%--
    Almacen almacen = new Almacen();
    List<String> listaIsbns = (List<String>) session.getAttribute("tienda.carro");
    List<Libro> listaCompra = almacen.consultaListaLibrosSolicitados(listaIsbns);
    if (listaCompra != null && (listaCompra.size() > 0)) {
--%>-->
<center>
    <table border=1 cellspacing=1 cellpadding=2 width="100%" bgcolor="#FFFFFF">
        <tr>
            <td><b>Titulo</b></td>
            <td><b>Autor</b></td>
            <td><b>Editorial</b></td>
            <td><b>Precio</b></td>
            <td><b>Cantidad</b></td>
            <td></td>
        </tr>
        <!-- <%--
             for (int idx = 0; idx < listaCompra.size(); idx++) {
                 Libro libro = listaCompra.get(idx);
        --%>-->
        <s:iterator value="listaLibrosSolicitados">
            <tr>
                <td><s:property value="titulo"/></td>
                <td><s:property value="autor"/></td>
                <td><s:property value="nombreEditorial"/></td>
                <td><s:property value="precio"/></td>
                <td><s:property value="cantidad"/></td>
            </tr>
        </s:iterator>

        <!--<%--
            }--%>-->
    </table>
</center>
<s:form action="comprarLibrosAction">
    <s:submit value="Comprar"></s:submit>
</s:form>
<!--<%--
    }
--%>-->