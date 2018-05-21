<%-- 
    Document   : update
    Created on : 14-may-2018, 22:05:50
    Author     : jalc
--%>

<%@page import="libroClient.GetLibroJerseyClient"%>
<%@page import="almacenentities.Libro"%>
<%@page import="javax.ws.rs.client.ClientResponseContext"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Insertar Libro</h1>
        <form method="post" action="#">
            Titulo: <input type="text" name="titulo"/><br> 
            Autor: <input type="text" name="autor"/><br>
            Precio: <input type="number" name="precio"/><br>
            ISBN: <input type="number" name="isbn"/><br>
            Editorial: <input type="number" name="editorial"/><br>
            <input type="submit" name="insertLibro" value="Insertar Libro">
        </form>

        <%
            if (request.getParameter("insertLibro") != null) {

                Integer id = 0;

                String titulo = request.getParameter("titulo");

                String autor = request.getParameter("autor");
                Float precio = Float.parseFloat(request.getParameter("precio"));
                Integer isbn = Integer.parseInt(request.getParameter("isbn"));
                Integer editorial = Integer.parseInt(request.getParameter("editorial"));
          
                Libro l = new Libro(id, autor, titulo, precio, isbn, editorial);
                GetLibroJerseyClient jpInsert = new GetLibroJerseyClient();
                jpInsert.create_XML(l);
                response.sendRedirect("index.jsp");

            }

        %>

    </body>
</html>
