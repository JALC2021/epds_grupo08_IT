
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        if(request.getParameter("invalidar")!=null){
            out.print("has pulsado invalidar");
            session.invalidate();
        }
        response.sendRedirect("index.jsp");
         %>
          <%@include file="footer.jsp" %>
    </body>
</html>
