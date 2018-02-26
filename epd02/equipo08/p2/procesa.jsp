

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ej2-epd2</title>
    </head>
    <body>


        <%  String opcion = request.getParameter("opcion"); %>

        <jsp:forward page="intermedia.jsp">
            <jsp:param name="opcion" value="<%=opcion%>"/>
        </jsp:forward>   
            
    </body>
</html>
