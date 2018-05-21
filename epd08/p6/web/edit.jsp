<%-- 
    Document   : edit
    Created on : 14-may-2018, 22:05:50
    Author     : jalc
--%>

<%@page import="javax.ws.rs.core.GenericType"%>
<%@page import="almacenentities.Libro"%>
<%@page import="libroClient.GetLibroJerseyClient"%>
<%@page import="javax.ws.rs.client.ClientResponseContext"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Libros</title>
    </head>
    <body>
        <h1>Editar Libro</h1>
        <form method="post">
            <input type="hidden" value="<%=request.getParameter("idEdit")%>" name="idEdit">
            <%
                String idHiden = request.getParameter("idEdit");
                GetLibroJerseyClient p1 = new GetLibroJerseyClient();
                GenericType<Libro> pBbDd = new GenericType<Libro>() {
                };
                Libro pbbdd = p1.find_XML(pBbDd, idHiden);

            %>

            Titulo: <input type="text" name="titulo" value="<%=pbbdd.getTitulo()%>"/><br> 
            Autor: <input type="text" name="autor" value="<%=pbbdd.getAutor()%>"/><br>
            Precio: <input type="number" name="precio" value="<%=pbbdd.getPrecio()%>"/><br>
            ISBN: <input type="number" name="isbn" value="<%=pbbdd.getIsbn()%>"/><br>
            Editorial: <input type="number" name="editorial" value="<%=pbbdd.getEditorial()%>"/><br>

            <input type="submit" name="editLibro" value="Editar Libro">
        </form>

        <%
            if (request.getParameter("editLibro") != null) {

                String idString = request.getParameter("idEdit");

                Integer id = Integer.valueOf(idString);

                String titulo = request.getParameter("titulo");

                String autor = request.getParameter("autor");
                Float precio = Float.parseFloat(request.getParameter("precio"));
                Integer isbn = Integer.parseInt(request.getParameter("isbn"));
                Integer editorial = Integer.parseInt(request.getParameter("editorial"));
                
               

                Libro l = new Libro(id, autor, titulo, precio, isbn, editorial);
                GetLibroJerseyClient jpEdit = new GetLibroJerseyClient();
                jpEdit.edit_XML(l, idString);
                response.sendRedirect("index.jsp");

            }
        %>

    </body>
</html>
