

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css">
        <title>ej3-epd2</title>
    </head>
    <body>
        
        
        <h1>DATOS DE LA SESI&Oacute;N:</h1>
        <table border="1">
            <tr>
                <td>ID de la sesi&oacute;n</td>
                <td><%=session.getId()%></td>
            </tr>
            <tr>
                <td>Fecha de creaci&oacute;n</td>
                <% Date fecha=new Date(session.getCreationTime());%>
                <td><%=fecha%></td>
               <% SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); %>
             
            </tr>
            <tr>
               <td>Fecha formateada</td>
               <td><%=df.format(fecha)%></td>
               
            </tr>
           <% 
           Date createTime = new Date(session.getCreationTime());
           Date lastAccessTime = new Date(session.getLastAccessedTime());
           Long duracion = lastAccessTime.getTime() - createTime.getTime();
           %>
               <tr>
                   <td>Duraci&oacute;n</td>
<!--                   Dividimos entre mil para que los saque en segundos-->
                   <td><%out.print(duracion / 1000+ " segundos");%></td> 
               </tr>
        </table>
         
       <form action="invalidaSesion.jsp" method="post">
           <label><br />Pulse para invalidar la sesi&oacute;n y ver los datos de la nueva sesi&oacute;n</label> <p> <input type="submit" name="invalidar" value="Invalidar"></p>
       </form>
        
       <%@include file="footer.jsp" %>
    </body>
</html>
