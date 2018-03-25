<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Modelo.CocheModelo"%>


<% List<CocheModelo> cochesPorMatricula = (List<CocheModelo>)session.getAttribute("buscarMatricula");%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css" />
        <title>Epd3_p4</title>
    </head>
    <body>
         <header><h1>Aparcamiento Zona Azul</h1></header>
        <div class="container">
         <%

                if (request.getParameter("buscar") != null) {

                    String matriculaRecibida = (String) request.getParameter("matriculaCoche");
                    if (matriculaRecibida != null && matriculaRecibida != "") {
                       
            %>

            <div class="row">
                <table border="2">
                    <tr>
                        <th>Matricula</th>
                        <th>Modelo</th>
                        <th>Hora de entrada</th>
                        <th>Hora de salida</th>
                        <th>Tiempo permitido</th>
                    </tr>
                    <%
                        for (CocheModelo cm : cochesPorMatricula) {
                    %>
                    <tr>
                        <td><%=cm.getMatricula()%></td>
                        <td><%=cm.getModelo()%></td>
                        <td><%=cm.getHoraEntradaConFormato()%></td>
                        <td><%=cm.getHoraSalidaConFormato()%></td>
                        <td><%=cm.getTiempoPermitido()%></td>
                    </tr>

                    <%}
                        }%>

                </table>

            </div>
            <% } %>
        </div>
            <%@include file="footer.jsp"%>
    </body>
</html>
