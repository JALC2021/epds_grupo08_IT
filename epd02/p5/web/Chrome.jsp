

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Esta usando Google Chrome</h1>
        
              <H2>Informacion de cabecera</H2>
        
        <BR>
        <% if(request.getHeader("accept-language").contains("EN")){
            %> Accept English<%
                    }
        
           
            java.util.Enumeration names = request.getHeaderNames();
        while(names.hasMoreElements()){
            String name = (String) names.nextElement();
          
            out.println(name + ":<BR>" + request.getHeader(name) + "<BR><BR>");
        }
        %>
    </body>
</html>
