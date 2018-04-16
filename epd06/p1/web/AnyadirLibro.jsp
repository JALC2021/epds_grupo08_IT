<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@taglib  prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
    <s:form action="anyadirLibroAction">
        <s:textfield name="id" label="Id" />
        <s:textfield name="autor" label="Autor" />
        <s:textfield name="titulo" label="Titulo" />
        <s:textfield name="precio" label="Precio" />
        <s:textfield name="isbn" label="ISBN" />
         <s:textfield name="editorial" label="Editorial" />
        <s:submit value="Agregar"></s:submit>
    </s:form>
        </div>
        <%@include file="footer.jsp" %>
</body>
</html>
