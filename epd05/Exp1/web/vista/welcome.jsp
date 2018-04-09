<%-- 
    Document   : welcome
    Created on : 07-abr-2018, 15:20:08
    Author     : susana
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>welcome Page</title>
    </head>
    <body>
        <h1>Bienvenid@ <s:property value="username" />!</h1>
    </body>
</html>
