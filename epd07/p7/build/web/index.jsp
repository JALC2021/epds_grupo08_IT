
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EPD 7_p7</title>
    </head>
    <body>


        <%-- start web service invocation --%>
        <%
            if (request.getParameter("login") != null) {
                String usu = request.getParameter("usuario");
                String pass = request.getParameter("contrasenia");
                
//                LOGIN
                try {
                    paquete.ServicioAutenticacion_Service service = new paquete.ServicioAutenticacion_Service();
                    paquete.ServicioAutenticacion port = service.getServicioAutenticacionPort();
                    
                    long result = port.login(usu, pass);
                    
                    String c=Long.toString(result);
                    Cookie cook = new Cookie("token",c);
                   
                    response.addCookie(cook);
                    response.sendRedirect("login.jsp");

                } catch (Exception ex) {
                    out.println("exception" + ex);
                }

        %>
        <%-- end web service invocation --%>

        <% } else if (request.getCookies() != null) {

                Cookie cookies[] = request.getCookies();
                boolean enc = false;

                int i = 0;
                while (i < cookies.length && !enc) {

                    if (cookies[i].getName().equals("token")) {
                        
                        String auxtoken = cookies[i].getValue();
                        long token = Long.parseLong(auxtoken);
                        
                    //IsALIVE
                        try {
                            paquete.ServicioAutenticacion_Service service = new paquete.ServicioAutenticacion_Service();
                            paquete.ServicioAutenticacion port = service.getServicioAutenticacionPort();
                            
                            java.lang.Boolean result = port.isAlive(token);
                            
                            if (result) {
                                enc = true;
                                response.sendRedirect("login.jsp");
                            }

                        } catch (Exception ex) {
                            out.println("exception" + ex);
                        }
                    }
                    i++;
                }
            }
        %>
        <%-- end web service invocation --%>


        <h1>Registro</h1>
        <form method="post" action="#">
            <p> <label>Usuario:</label> <input type="text" name="usuario"></p>
            <p><label>Contrase&ntilde;a:</label> <input type="password" name="contrasenia"></p>
            <input type="submit" name="login" value="Login">
        </form>
    </body>
</html>
