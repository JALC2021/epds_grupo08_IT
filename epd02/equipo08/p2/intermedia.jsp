

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>p2-epd2</title>
    </head>
    <body>
       
        <%  
            String opcion = request.getParameter("opcion");
            switch (opcion) {
                case "request":
                    response.sendRedirect("http://java.sun.com/javaee/5/docs/api/javax/servlet/http/HttpServletRequest.html");
                    break;
                case "out":
                    response.sendRedirect("http://java.sun.com/javaee/5/docs/api/javax/servlet/jsp/JspWriter.html");
                    break;
                case "response":
                    response.sendRedirect("http://java.sun.com/javaee/5/docs/api/javax/servlet/http/HttpServletResponse.html");
                    break;
                case "config":
                    response.sendRedirect("http://java.sun.com/javaee/5/docs/api/javax/servlet/ServletConfig.html");
                    break;
                case "application":
                    response.sendRedirect("http://java.sun.com/javaee/5/docs/api/javax/servlet/ServletContext.html");
                    break;
                case "session":
                    response.sendRedirect("http://java.sun.com/javaee/5/docs/api/javax/servlet/http/HttpSession.html");
                    break;
            }


        %>
    </body>
</html>
