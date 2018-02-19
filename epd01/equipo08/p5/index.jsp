

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css">
        <title>p5-epd1</title>
    </head>
    <body>
        
        <!--        Vista de formulario-->
        <%
            String nombre = request.getParameter("nombre");
            String sede = request.getParameter("sede");
            String capital = request.getParameter("capital");
            String telefono = request.getParameter("tlf");

            String pais = request.getParameter("pais");
            String aportacion = request.getParameter("aportacion");
            String banco = request.getParameter("banco");
            String socio = request.getParameter("socio");
            String aportacionSocio = request.getParameter("aportacionSocio");
            String avalista = request.getParameter("avalista");

            String tabla = "no";
            if (request.getParameter("tabla") != null) {
                tabla = request.getParameter("tabla");
            }
        %>

        <p>Para dar de alta su empresa, rellene el siguiente el formulario:</p>
        <form action="index.jsp" method="post">

            <p> <label>Nombre (*): </label><input type="text" name="nombre" value="<% if (nombre != null) {%><%=nombre%><%}%>" required> </p>

            <p><label>Sede Social (*): </label><input type="text" name="sede" value="<% if (sede != null) {%><%=sede%><%}%>" required> </p>

            <p><label>Tel&eacute;fono (*): </label><input type=tel name="tlf" patterm="\([0-9]{3}\) [0-9]{3}[ -][0-9]{4}" value="<% if (telefono != null) {%><%=telefono%><%}%>" required> </p>

            <p><label>Capital Extranjero (*): </label><label>S&iacute;</label><input type="radio" name="capital" value="si" <%try {
                    if (capital.equals("si")) {
                        out.print("checked");
                    }
                } catch (Exception e) {
                }%> required>
                <label>No</label><input type="radio" name="capital" value="no" <%try {
                        if (capital.equals("no")) {
                            out.print("checked");
                        }
                    } catch (Exception e) {
                    }%> required></p>

            <%   try {
                    if (capital.equals("si") && tabla.equals("no")) {
            %>
            <p> <label>Pa&iacute;s (*): </label><input type="text" name="pais" required> </p>

            <p><label>Aportaci&oacute;n en % (*): </label><input type="text" name="aportacion" required> </p>

            <p><label>Banco en el extranjero (*): </label><input type="text" name="banco" required> </p>
            <input type="hidden" name="tabla" value="si">

            <%  } else if (capital.equals("no") && tabla.equals("no")) {
            %>

            <p> <label>Socio principal (*): </label><input type="text" name="socio" required> </p>

            <p><label>Aportaci&oacute;n socio principal (*): </label><input type="text" name="aportacionSocio" required> </p>

            <p><label>Avalista (*): </label><input type="text" name="avalista" required> </p>
            <input type="hidden" name="tabla" value="si">

            <%       }

                } catch (Exception e) {
                    e.getMessage();
                }


            %>
            <input type="submit" value="Enviar"><br /><br />
            <span class="obligatorio">(*) Todos los campos son obligatorios</span>
        </form>

        <%            if (tabla.equals("si") && capital.equals("si")) {
                out.print("hola");
        %>
        <table border="1">

            <tr>
                <td>Nombre</td> 
                <td><%=nombre%></td> 
            </tr>
            <tr>
                <td>Sede social</td> 
                <td><%=sede%></td> 
            </tr>
            <tr>
                <td>Tel&eacute;fono</td> 
                <td><%=telefono%></td>  
            </tr>
            <tr>
                <td>Capital Extranjero</td> 
                <td><%=capital%></td> 
            </tr>
            <tr>
                <td>Pa&iacute;s</td> 
                <td><%=pais%></td> 
            </tr>
            <tr>
                <td>Aportaci&oacute;n en %</td> 
                <td><%=aportacion%></td> 
            </tr>
            <tr>
                <td>Banco en el extranjero</td> 
                <td><%=banco%></td> 
            </tr>

        </table>

        <% } else if (tabla.equals("si") && capital.equals("no")) {


        %>  


        <table border="1">

            <tr>
                <td>Nombre</td> 
                <td><%=nombre%></td> 
            </tr>
            <tr>
                <td>Sede social</td> 
                <td><%=sede%></td> 
            </tr>
            <tr>
                <td>Tel&eacute;fono</td> 
                <td><%=telefono%></td>  
            </tr>
            <tr>
                <td>Capital Extranjero</td> 
                <td><%=capital%></td> 
            </tr>
            <tr>
                <td>Socio principal</td> 
                <td><%=socio%></td> 
            </tr>
            <tr>
                <td>Aportaci&oacute;n socio principal</td> 
                <td><%=aportacionSocio%></td> 
            </tr>
            <tr>
                <td>Avalista</td> 
                <td><%=avalista%></td> 
            </tr>

        </table>
        <%}%>

        <%@include file="footer.jsp" %>
    </body>
</html>
