

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    String navegador;
    %>
<!DOCTYPE html>
<HTML>
    <HEAD>
        <TITLE>Reading Header Information</TITLE>
    </HEAD>

    <BODY>
  <%
        if (request.getHeader("user-agent").contains("Chrome")){ %>
         <jsp:forward page="Chrome.jsp" />
            
        <%}else if(request.getHeader("user-agent").contains("Firefox")){%>
        <jsp:forward page="Firefox.jsp" />
            
        <%}else%>
        <jsp:forward page="Error.jsp" />
    </BODY>
</HTML>
