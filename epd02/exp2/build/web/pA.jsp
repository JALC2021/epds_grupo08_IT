


<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IT - EPD02 - Experimento02 - Página A</title>
    </head>
    <body>
        <h1>IT - EPD02 - Experimento02 - Página A</h1>
       
        <% 
            Cookie[] arrayCook=request.getCookies();
       
        %>
    <h2>Bienvenido <%out.print(arrayCook[1].getValue()); %> </h2> 
    </body>
</html>
