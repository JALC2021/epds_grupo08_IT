
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EPD 7_p7</title>
    </head>
    <body>
        <%
            boolean result = false;
            long token2 = 0L;

            if (request.getParameter("logout") != null) {
                String tokenstring = request.getParameter("idtoken");
                token2 = Long.parseLong(tokenstring);

//              LOGOUT
                try {
                    paquete.ServicioAutenticacion_Service service = new paquete.ServicioAutenticacion_Service();
                    paquete.ServicioAutenticacion port = service.getServicioAutenticacionPort();
                    
                    java.lang.String result2 = port.logout(token2);
                    response.sendRedirect("index.jsp");
                } catch (Exception ex) {
                    out.println("exception" + ex);
                }
            }

            Cookie cookies[] = request.getCookies();
            if (cookies != null) {
                for (int i = 0; i < cookies.length; i++) {
                    if (cookies[i].getName().equals("token")) {
                        String token = cookies[i].getValue();
                       

//                     IsALIVE
                        try {
                            paquete.ServicioAutenticacion_Service service = new paquete.ServicioAutenticacion_Service();
                            paquete.ServicioAutenticacion port = service.getServicioAutenticacionPort();
                            
                            token2 = Long.parseLong(token);
                            result = port.isAlive(token2);
                            
                        } catch (Exception ex) {
                            out.println("exception" + ex);
                        }
                    }
                }
            }

            if (result) {
        %>
        <h1>Bienvenido!</h1>
        <h2>Contenido token: <%=token2%></h2>
        <% 
            } else {
             response.sendRedirect("index.jsp");
            }
        %>

        <form method="post" action="#">
            <input type="hidden" name="idtoken" value="<%= token2%>"><br>
            <input type="submit" name="logout" value="Logout">
        </form>
    
    </body>
</html>
