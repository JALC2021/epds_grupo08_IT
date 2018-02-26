

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Venta de productos</h1>
       
        <div>
        <ul><li><img height="200" src="img1.png"></li></ul>
        <jsp:include page="informacion1.html" />
        </div>
        
        <div>
        <ul><li><img height="200" src="img2.png"></li></ul>
        <jsp:include page="informacion2.html" />
        </div>
        
        <div>
        <ul><li><img height="200" src="img3.png"></li></ul>
        <jsp:include page="informacion3.html" />
        </div>
                               
    </body>
</html>
