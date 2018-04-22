<%-- 
    Document   : add
    Created on : 19-abr-2018, 18:47:14
    Author     : susana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reserva de las Guardas. System Manager</title>
        <link rel="stylesheet" href="/ItEv2STRUTS_2/struts/xhtml/styles.css" type="text/css"/>
        <script src="/ItEv2STRUTS_2/struts/utils.js" type="text/javascript"></script>
    </head>
    <body>
        <s:i18n name="reserva.actions.AddAnimal">
        <h1>Reserva de las Guardas. Add a new animal</h1>
        <script type="text/javascript" src="/ItEv2STRUTS_2/struts/xhtml/validation.js"></script>
        <script type="text/javascript" src="/ItEv2STRUTS_2/struts/utils.js"></script>
        
        <s:form id="nuevoAnimal" name="nuevoAnimal" action="insertarAnimal" method="post">
            <table class="wwFormTable">
                <tr>
                    <td class="tdLabel"><s:label for="nuevoAnimal_identificador" class="label" value="Identifier of the animal:"></s:label></td>
                    <td> <s:textfield name="identificador" id="nuevoAnimal_identificador" ></s:textfield></td>
                   
                </tr>
                 <tr>
                    <td class="tdLabel"><s:label for="nuevoAnimal_tipoAnimal" class="label" value="Animal:"></s:label></td>
                 <td><s:select name="tipoAnimal" id="nuevoAnimal_tipoAnimal" list="animales" listKey="animal" listValue="animal"></s:select></td>
                 </tr>


                <tr>
                    <td class="tdLabel"><s:label for="nuevoAnimal_pais" class="label" value="Country of origin:"></s:label></td>
                    <td><s:textfield name="pais" id="nuevoAnimal_pais"/></td>
                </tr>


                <tr>
                    <td class="tdLabel"><s:label for="nuevoAnimal_precio" class="label" value="Price:"></s:label></td>
                    <td><s:textfield name="precio"  id="nuevoAnimal_precio"/></td>
                </tr>


                <tr>
                    <td class="tdLabel"><s:label for="nuevoAnimal_email" class="label" value="Vendor's email:"></s:label></td>
                        <td><s:textfield name="email" id="nuevoAnimal_email"/></td>
                </tr>


                <tr>
                    <td colspan="2"><div align="right"><s:submit id="nuevoAnimal_0" value="Add"/></div></td>
                </tr>


            </table>
        </s:form>
        </s:i18n>

    </body>
</html>

