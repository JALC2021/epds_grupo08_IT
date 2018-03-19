<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.CocheModelo"%>
<% List<CocheModelo> cochesAparcadosAun = (List<CocheModelo>)session.getAttribute("buscarCochesAparcados");%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Epd3_p4</title>
    </head>
    <body>
         <header><h1>Aparcamiento Zona Azul</h1></header>
         <div class="container">
               <% if (request.getParameter("buscar1") != null) {%>

            <div class="row">
                <table border="2">
                    <tr>
                        <th>Matricula</th>
                        <th>Modelo</th>
                        <th>Hora de entrada</th>
                        <th>Hora de salida</th>
                        <th>Tiempo permitido</th>
                    </tr>

                    <% for (CocheModelo cm : cochesAparcadosAun) {
                    %>
                    <tr>
                        <td><%=cm.getMatricula()%></td>
                        <td><%=cm.getModelo()%></td>
                        <td><%=cm.getHoraEntradaConFormato()%></td>
                        <td><%=cm.getHoraSalidaConFormato()%></td>
                        <td><%=cm.getTiempoPermitido()%></td>
                    </tr>

                    <% }%>

                </table>

            </div>
            <% }%>
            </div>
          <%@include file="footer.jsp"%>
    </body>
</html>
