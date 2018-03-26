<%-- 
    Document   : index
    Created on : 23-mar-2018, 19:34:35
    Author     : susana
--%>

<%@page import="java.util.List"%>
<%@page import="Modelo.CocheModelo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    List<CocheModelo> coches = (List<CocheModelo>) request.getAttribute("coches");
    

%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Epd4_p4</title>
    </head>
    <body>
        <header><h1>Aparcamiento Zona Azul</h1></header>
        <table border="2">
            <tr>
                <th>Matricula</th>
                <th>Modelo</th>
                <th>Hora de entrada</th>
                <th>Hora de salida</th>
                <th>Tiempo permitido</th>
                <th><a href="insertar.jsp"><img src="img/crear.png" width="30" alt="Insertar registro"/></a></th>
               

            </tr>
            <%    for (CocheModelo cm : coches) {
            %>
            <tr>
                <td><%=cm.getMatricula()%></td>
                <td><%=cm.getModelo()%></td>
                <td><%=cm.getHoraEntrada()%></td>
                <td><%if(cm.getHoraSalida()==null){cm.setHoraSalidaConFormato("--");%><%=cm.getHoraSalidaConFormato()%><%}else{%><%=cm.getHoraSalida()%><%}%></td>
                <td><%=cm.getTiempoPermitido()%></td>
                <td><a href="editar.jsp"><img src="img/editar.png" width="30" alt="Editar registro"/></a></td>
                <td><a href="eliminar.jsp"><img src="img/eliminar.png" width="30" alt="Eliminar registro"/></a></td>
                
            </tr>
            
               <% } %>
                
            
        </table>
        <%@include file="footer.jsp"%>
    </body>
</html>
