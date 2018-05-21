<%-- 
    Document   : index
    Created on : 20-may-2018, 15:00:11
    Author     : pablo
--%>

<%@page import="org.apache.jasper.tagplugins.jstl.ForEach"%>
<%@page import="almacenentities.Libro"%>
<%@page import="javax.ws.rs.core.GenericType"%>
<%@page import="java.util.List"%>
<%@page import="libroClient.GetLibroJerseyClient"%>
<%@page import="javax.ws.rs.client.ClientResponseContext"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Libros</title>
    </head>
    <body>
        <h1>Lista de Libros</h1>
        <%
            
            GetLibroJerseyClient p1 = new GetLibroJerseyClient();
            GenericType<List<Libro>> lista = new GenericType<List<Libro>>() {
            };
            List<Libro> listaLibros = p1.findAll_XML(lista);

        %>
        <table border="2">

            <tr>
                <th>Id</th>
                <th>Titulo</th>
                <th>Autor</th>
                <th>Precio</th>
                <th>Editorial</th>
                <th>ISBN</th>
                <th>
                    <form action="insert.jsp" method="post">

                        <input type="submit" name="insert" value="Insertar Libro">

                    </form>
                </th>
            </tr>


            <%  for (Libro p : listaLibros) {
            %>

            <tr>
                <td><%= p.getId()%></td>
                <td><%= p.getTitulo()%></td>
                <td><%= p.getAutor()%></td>
                <td><%= p.getPrecio()%></td>
                <td><%= p.getEditorial()%></td>
                <td><%= p.getIsbn()%></td>
                <td>
                    <form method="post" action="#">
                        <input type="submit" name="delete" value="Eliminar Libro">
                        <input type="hidden" value="<%= p.getId()%>" name="idDelete">
                    </form>
                </td>
                <td>
                    <form method="post" action="edit.jsp">
                        <input type="submit" name="edit" value="Editar Libro">
                        <input type="hidden" value="<%= p.getId()%>" name="idEdit">
                    </form>
                </td>
            <tr>
                <%
                    }
                %>
        </table>

        <%
            if (request.getParameter("delete") != null) {
                String id = request.getParameter("idDelete");
                p1.remove(id);
                response.sendRedirect("index.jsp");
               
            }
        %>
    </body>
</html>
