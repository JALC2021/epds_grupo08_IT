
<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estiloResultado.css">
        <title>ej1-epd2</title>
    </head>
    <body>
        <h1>Resultados</h1>

        <%
            Enumeration headerNames1 = request.getHeaderNames();
            Enumeration headerNames2 = request.getHeaderNames();
            Enumeration headerNames3 = request.getHeaderNames();
            String paramName;
            String paraName;
            
//            while (headerNames.hasMoreElements()) {
//                String paramName = (String) headerNames.nextElement();
//                out.print("<tr><td>" + paramName + "</td></tr>\n");
//      String paramValue = request.getHeader(paramName);
//      out.println("<td> " + paramValue + "</td></tr>\n");
            //          }
        %>
        <table border="1">
            <tr>
                <td>Email</td>  
                <td><%out.print(request.getParameter("email"));%></td>  
            </tr>
            <tr>
                <td>Nombre de usuario</td>  
                <td><%out.print(request.getParameter("nombreUsu"));%></td>  
            </tr>
            <tr>
                <td>Contrase&ntilde;a</td>  
                <td><%out.print(request.getParameter("contrasenia"));%></td>
            </tr>
            <tr>
                <td>getContextPath(): devuelve la parte del URI de solicitud que indica el contexto de la solicitud </td> 
                <td><%=request.getContextPath()%></td> 
            </tr>
            <tr>
                <td>getPathInfo(): devuelve información de ruta adicional asociada con la URL que el cliente envió cuando realizó esta solicitud</td> 
                <td><%=request.getPathInfo()%></td>  
            </tr>
            <tr>
                <td>getPathTranslated(): devuelve información de ruta adicional después del nombre del servlet pero antes de la cadena de consulta, y la traduce a una ruta real</td> 
                <td><%=request.getPathTranslated()%></td>  
            </tr>
            <tr>
                <td>getQueryString(): devuelve la cadena de consulta que está contenida en la URL de solicitud después de la ruta</td> 
                <td><%=request.getQueryString()%></td>   
            </tr>
            <tr>
                <td>getRequestURI(): devuelve la parte de la URL de esta solicitud desde el nombre del protocolo hasta la cadena de consulta en la primera línea de la solicitud HTTP</td> 
                <td><%=request.getRequestURI()%></td>  
            </tr>
            <tr>
                <td>getHeaderNames(): devuelve una enumeración de todos los nombres de encabezado que contiene esta solicitud</td>
                <td><%    while (headerNames1.hasMoreElements()) {
                        paramName = (String) headerNames1.nextElement();
                        out.print(paramName + ":&nbsp;&nbsp;&nbsp;&nbsp;");
                    }
                    %>
                </td> 
            </tr>
            <tr>
                <td>getHeader(String name): devuelve el valor del encabezado de solicitud especificado como String</td>
                <td><%       while (headerNames2.hasMoreElements()) {
                        paraName = (String) headerNames2.nextElement();
                       // out.print(paraName + ":&nbsp;&nbsp;&nbsp;&nbsp;");
                        String paramValue = request.getHeader(paraName);
                        out.println(paramValue + "<br />");
                    }
                    %></td> 
            </tr>
            <tr>
                <td>getHeaders(String name): devuelve todos los valores del encabezado de solicitud especificado como un Enumeration of String objects</td>
                <td><%
                    while (headerNames3.hasMoreElements()) {
                        String name = (String) headerNames3.nextElement();
                        Enumeration values = request.getHeaders(name);
                        if (values != null) {
                            while (values.hasMoreElements()) {
                                String value = (String) values.nextElement();
                                out.println(name + ": " + value);
                            }
                        }
                    }
                    %></td> 
            </tr>
            <tr>
                <td>getDateHeader(String name): devuelve el valor del encabezado de solicitud especificado como un valor largo que representa un objeto Date</td>
                <td><% out.print(request.getDateHeader("ej1")); %></td>
                   
                
                
            </tr>
            <tr>
                <td>getMethod(): devuelve el nombre del método HTTP con el que se realizó esta solicitud, por ejemplo, GET, POST o PUT</td>
                <td><%=request.getMethod()%></td> 
            </tr>
            <tr>
                <td>getCookies(): devuelve una matriz que contiene todos los objetos de Cookie que el cliente envió con esta solicitud</td>
                <td>
                    <%
                    Cookie cookie = null;
                    Cookie[] cookies = null;
                    cookies = request.getCookies();
                    if (cookies != null) {
                        for (int i = 0; i < cookies.length; i++) {
                            out.print(cookies[i].getValue());
                        }
                    }%>

                   </td>
            </tr>
            <tr>
                <td>getRequestedSessionId(): devuelve el ID de sesión especificado por el cliente</td>
                <td><%=request.getRequestedSessionId()%></td>
            </tr>
            <tr>
                <td>getSession(): devuelve la sesión actual asociada con esta solicitud, o si la solicitud no tiene una sesión, crea una</td>
                <td><%=request.getSession() //HttpSession sesion = request.getSession();
                        // out.print(sesion);
                    %></td>


            </tr>
            <tr>
                <td>isRequestedSessionIdValid(): comprueba si la ID de sesión solicitada sigue siendo válida</td>
                <td><%=request.isRequestedSessionIdValid()%></td>
            </tr>
            <tr>
                <td>getRemoteUser(): devuelve el inicio de sesión del usuario que hace esta solicitud, si el usuario ha sido autenticado, o nulo si el usuario no ha sido autenticado</td>
                <td><%=request.getRemoteUser()%></td>
            </tr>
        </table>
        <%@include file="footer.jsp" %>
    </body>
</html>
