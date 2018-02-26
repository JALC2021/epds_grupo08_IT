<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    boolean visible1 = true;
    boolean visible2 = true;
    boolean visible3 = true;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if (request.getParameter("enviar") != null) {
                if (request.getParameter("mostrar1").equals("si")) {
                    visible1 = true;
                } else {
                    visible1 = false;
                }

                if (request.getParameter("mostrar2").equals("si")) {
                    visible2 = true;
                } else {
                    visible2 = false;
                }

                if (request.getParameter("mostrar3").equals("si")) {
                    visible3 = true;
                } else {
                    visible3 = false;
                }
            }

        %>
        <form>
            <h1>Noticias</h1>
            <h2>Noticia 1</h2>
            <p><input type="radio" name="mostrar1" value="si" checked>Mostrar</p>
            <p><input type="radio" name="mostrar1" value="no">Ocultar</p>
                <%                    
                    if (visible1) {
                %>
                <jsp:include page="noticia1.txt" />
                <%
                    } else {
                        out.write("<p>Información no mostrada</p>");
                    }
                %>

            <h2>Noticia 2</h2>
            <p><input type="radio" name="mostrar2" value="si" checked>Mostrar</p>
            <p><input type="radio" name="mostrar2" value="no">Ocultar</p>
                <%
                    if (visible2) {
                %>
                <jsp:include page="noticia2.txt" />
                <%
                    } else {
                        out.write("<p>Información no mostrada</p>");
                    }
                %>

            <h2>Noticia 3</h2>
            <p><input type="radio" name="mostrar3" value="si" checked>Mostrar</p>
            <p><input type="radio" name="mostrar3" value="no">Ocultar</p>
                <%
                    if (visible3) {
                %>
                <jsp:include page="noticia3.txt" />
                <%
                    } else {
                        out.write("<p>Información no mostrada</p>");
                    }
                %>

            <p><input type="submit" name="enviar" /></p>
        </form>
    </body>
</html>
