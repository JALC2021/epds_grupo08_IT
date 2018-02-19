<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>P1_epd1</title>
    </head>
    <body>
        <h1><strong>Datos recibidos</strong></h1>
        <%
            String nombre = (String) request.getParameter("nombre");
            String apellidos = (String) request.getParameter("apellidos");
            String email = (String) request.getParameter("email");
            String bloque[] = request.getParameterValues("bloque");
            String nota = (String) request.getParameter("nota");
            String estudiadoIt = (String) request.getParameter("estudiadoIt");
            Double bloque1 =  Double.valueOf(request.getParameter("bloque1"))*0.3111;
            Double bloque2 =  Double.valueOf(request.getParameter("bloque2"))*0.1556;
            Double bloque3 =  Double.valueOf(request.getParameter("bloque3"))*0.2333;
            Double proyecto =  Double.valueOf(request.getParameter("proyecto"))*0.2;
            Double ejercicios =  Double.valueOf(request.getParameter("ejercicios"))*0.1;
        %>
        <p>Nombre: <%= nombre%></p>
        <p>Apellidos: <%= apellidos%></p>
        <p>Email: <%= email%></p>
        <%
            if (estudiadoIt.equals("si")) {
        %><p>Bloque o bloques que encontr&oacute; m&aacute;s dif&iacute;ciles:</p><%
            for (int i = 0; i < bloque.length; i++) {
                %><ul><li><%=bloque[i]%></li></ul><%
        }
        } else if (estudiadoIt.equals("no")) {
        %>
        Nota que espera obtener: <%= nota%>
        <%
            }
        %>
        <% if(bloque1+bloque2+bloque3>=3.5){ %>
        <table border="1">
            <tr>
                <td>Pesos de cada apartado</td>
                <th>Rendimiento individual</th>
                <th colspan="2">Rendimiento grupal</th>
                <th rowspan="5">Nota Final</th>
            </tr>
            <tr>
                <th>Bloques</th>
                <th>Pruebas EPD</th>
                <th>Proyecto</th>
                <th>Ejercicios EPD</th>
            </tr>
            <tr>
                <th>B1</th>
                <td><%= bloque1%></td>
                <td rowspan="3"><%= proyecto%></td>
                <td rowspan="3"><%= ejercicios%></td>
            </tr>
            <tr>
            <th>B2</th>
            <td><%= bloque2%></td>
            </tr>
            <tr>
            <th>B3</th>
            <td><%= bloque3%></td>
            </tr>
            <tr>
            <th>Total</th>
            <td><%= bloque1+bloque2+bloque3%></td>
            <td><%= proyecto%></td>
             <td><%= ejercicios%></td>
             
             <td><%= bloque1+bloque2+bloque3+proyecto+ejercicios%></td>
              </tr>
        </table>
             <%} else {%>
            <table border="1">
            <tr>
                <td>Pesos de cada apartado</td>
                <th>Rendimiento individual</th>
                <th colspan="2">Rendimiento grupal</th>
                <th rowspan="5">Nota Final</th>
            </tr>
            <tr>
                <th>Bloques</th>
                <th>Pruebas EPD (Sobre 10)</th>
                <th>Proyecto (Sobre 10)</th>
                <th>Ejercicios EPD (Sobre 10)</th>
            </tr>
            <tr>
                <th>B1</th>
                <td><%= bloque1/0.3111%></td>
                <td rowspan="3"><%= proyecto/0.2%></td>
                <td rowspan="3"><%= ejercicios/0.1%></td>
            </tr>
            <tr>
            <th>B2</th>
            <td><%= bloque2/0.1556%></td>
            </tr>
            <tr>
            <th>B3</th>
            <td><%= bloque3/0.2333%></td>
            </tr>
            <tr>
            <th>Total (En porcentaje)</th>
            <td><%= bloque1+bloque2+bloque3%></td>
            <td><%= proyecto%></td>
             <td><%= ejercicios%></td>
             
             <td><%= bloque1+bloque2+bloque3%></td>
              </tr>
        </table>
        <p><strong>No se agrega rendimiento grupal por no llegar a 5 en individual</strong></p>
        <%}%>
        
        <%@include file="footer.jsp" %>
    </body>
</html>