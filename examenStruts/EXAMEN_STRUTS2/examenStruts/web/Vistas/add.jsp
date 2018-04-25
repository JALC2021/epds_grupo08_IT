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
        <s:head/> <!--  Esto es para que los errores salgan en rojo y en negrita-->
    </head>
    <body>
        <s:i18n name="controlador.actions.Insertar">
            <h1>Reserva de las Guardas. Add a new animal</h1>
            <script type="text/javascript" src="/ItEv2STRUTS_2/struts/xhtml/validation.js"></script>
            <script type="text/javascript" src="/ItEv2STRUTS_2/struts/utils.js"></script>

            <s:form id="nuevoAnimal" name="nuevoAnimal" action="insertAnimal" method="post">
                <table class="wwFormTable">
                    <tr>

                        <td> <s:textfield name="identificador" id="nuevoAnimal_identificador" key="Identificador" ></s:textfield></td>

                        </tr>
                        <tr>

                            <td><s:select name="tipoAnimal" id="nuevoAnimal_tipoAnimal" list="animales" listKey="animal" listValue="animal" key="tipoanimal"></s:select></td>


                        <tr>

                            <td><s:textfield name="pais" id="nuevoAnimal_pais" key="pais"/></td>
                    </tr>


                    <tr>
                        
                        <td><s:textfield name="precio"  id="nuevoAnimal_precio" key="precio"/></td>
                    </tr>


                    <tr>
                        
                        <td><s:textfield name="email" id="nuevoAnimal_email" key="email"/></td>
                    </tr>


                    <tr>
                        <td colspan="2"><div align="right"><s:submit id="nuevoAnimal_0" value="Add"/></div></td>
                    </tr>


                </table>
            </s:form>
        </s:i18n>

    </body>
</html>

