
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IT - EPD02 - Experimento02</title>
    </head>
    <body>
        <h1>IT - EPD02 - Experimento02</h1>        
        <h2>Identif�quese y seleccione d�nde quiere ir:</h2>
        <form action="#" method="post">
            <table border="1" cellspacing="2" cellpadding="2">
                <tr> 
                    <td>Usuario</td> 
                    <td><input type="text" name="usuario"></td> 
                </tr>
                <tr> 
                    <td>A qu� p�gina quieres ir?</td>
                    <td>
                        <select name="pagina">
                            <option value="-">-</option>
                            <option value="pA">P�gina A</option>
                            <option value="pB">P�gina B</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" name="btnEnviar" value="Enviar" size="2"></td>
                </tr>
            </table>
        </form>
        <%
            try{
            String usuario = request.getParameter("usuario");
            Cookie c1 = new Cookie("user", usuario);
            response.addCookie(c1);
            
            String pagina=request.getParameter("pagina");
            if (pagina.equalsIgnoreCase("pA")) {
                response.sendRedirect("pA.jsp");
            } else {
                response.sendRedirect("pB.jsp");
            }
            }catch(Exception e){
                
            }
        %>

    </body>
</html>
