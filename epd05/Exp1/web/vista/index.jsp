<%-- 
    Document   : index
    Created on : 07-abr-2018, 14:29:18
    Author     : susana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exp 1_epd5</title>
    </head>
    <body>
      
        <s:form action="loginCheck" namespace="/login">
           <s:textfield name="username" label="User name"></s:textfield> 
           <s:password name="password" label="Password"></s:password>
           <s:submit value="login"></s:submit>
       </s:form>
       
<!--        <h2><</h2>-->
    </body>
</html>
