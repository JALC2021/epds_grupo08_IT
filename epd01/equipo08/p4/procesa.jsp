<%-- 
    Document   : index
    Created on : 10-feb-2018, 12:21:56
    Author     : 
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <a href="procesa.jsp"></a>
    <head>
         <title>P4_epd1</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css">
        <title>EPD1-p1</title>
    </head>
    <body>
        <h1>Respuesta a su Solicitud de cr&eacute;dito</h1>
        <!--                    Procesamiento del formulario-->

        <!--Los campos se validan con expresiones regulares -->
        <!--No se permiten campos vacíos. Se tratan espacios en blanco y caracteres permitidos-->
        <%
            final int DOBLE = 2;
            String errores = "";
            /*Esta expresión regular permite introducir letras mayúsculas y minúsculas y espacios en blanco. La longitud mínima para la cadena es 3 carácteres y la máxima es 30 carácteres*/
            String patron1 = "^[a-zA-Z+[ x0Bf ]]{3,30}";
            /*Esta expresión regular permite introducir números entre el 0 y 9 ambos incluídos, teniendo como longitud tanto la parte entera como la parte decimal de 0 a 3 dígitos*/
            String patron2 = "[0-9]{0,6}.[0-9]{0,3}";
//            [0-9]{0,6}.{0,1}[0-9]{0,3}
            String nombre = request.getParameter("nombre");
            String apellidos = request.getParameter("apellidos");
            String estadoCivil = request.getParameter("estadoCivil");
            String trabaja = request.getParameter("trabaja");
            String ingresos = request.getParameter("ingresos");
            String gastos = request.getParameter("gastos");

            /*Validación  formulario*/
            if (nombre.isEmpty()) {
                errores = "<span class='contenido'>-El campo Nombres está vacío. Complételo por favor.</span><br />";
            }
            if (!nombre.matches(patron1)) {
                errores += "<span class='contenido'>-El campo Nombres no se corresponde con el formato aceptado. Ejemplo de formato aceptado: Lorenzo Pascual</span><br />";
            }
            if (apellidos.isEmpty()) {
                errores += "<span class='contenido'>-El campo Apellidos está vacío. Complételo por favor.</span><br />";
            }
            if (!apellidos.matches(patron1)) {
                errores += "<span class='contenido'>-El campo Apellidos no se corresponde con el formato aceptado. Ejemplo de formato aceptado: Medina Soria</span><br />";
            }
            if (estadoCivil.equalsIgnoreCase("-")) {
                errores += "<span class='contenido'>-El campo Estado Civil no se corresponde con ninguna de las opciones disponibles. Seleccione una opción por favor.</span><br />";
            }
            if (trabaja==null) {
                errores += "<span class='contenido'>-El campo Trabaja no se corresponde con ninguna de las opciones disponibles. Seleccione una opción por favor.</span><br />";
            }
            if (ingresos.isEmpty()) {
                errores += "<span class='contenido'>-El campo Ingresos está vacío. Complételo por favor.</span><br />";
            }
            if (!ingresos.matches(patron2)) {
                errores += "<span class='contenido'>-El campo Ingresos no se corresponde con el formato aceptado. Ejemplo de fomato aceptado: 1543.987</span><br />";
            }
            if (gastos.isEmpty()) {
                errores += "<span class='contenido'>-El campo Gastos está vacío. Complételo por favor.</span><br />";
            }
            if (!gastos.matches(patron2)) {
                errores += "<span class='contenido'>-El campo Gastos no se corresponde con el formato aceptado. Ejemplo de formato aceptado: 860.56</span><br />";
            }

            try {
                if (errores == "") {
                    Float gasto = Float.parseFloat(gastos);
                    Float ingreso = Float.parseFloat(ingresos);


        %>
        <span class="contenido">Nombre: <%=nombre%> </span><br />
        <span class="contenido">Apellidos: <%=apellidos%> </span><br />
        <span class="contenido">Estado Civil: <%=estadoCivil%> </span><br />
        <span class="contenido">Trabaja: <%=trabaja%> </span><br />
        <span class="contenido">Ingresos anuales: <%=ingreso%> €</span><br />
        <span class="contenido">Gastos anuales: <%=gasto%> €</span><br /><br />
        <%

                    if (((!estadoCivil.equalsIgnoreCase("casado")) && trabaja.equals("si") && ingreso > gasto) || (estadoCivil.equals("casado") && trabaja.equals("si") && ingreso >= (DOBLE * gasto))) {
                        out.write("<span class='concedido'>Crédito concedido</span>");
                    } else {
                        out.write("<span class='noConcedido'>No es posible concederle el crédito</span>");
                    }
                } else {
                    out.write(errores);
                }

            } catch (Exception e) {
                out.print(e.getMessage());
            }
        %>

        <%@include file="footer.jsp" %>
    </body>
</html>
