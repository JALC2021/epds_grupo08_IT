<%-- 
    Document   : index
    Created on : 06-feb-2018, 19:28:53
    Author     : jalc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <title>Ej2</title>
    </head>
    <body>

        <%--La progresion de  1 no la mostramos porque la tabla es muy larga y lo que se muestra es una linea recta, solo tendriamos que incluir en el vector el 1--%>
        <%!
            int[] vRazon = {2, 3, 5};
            int i, j, razon, valor, diferencia, valorAnt;
            String chartsGoogle, coordenada1, coordenada2, coordenada3, coordenada4;
            boolean encontrado;

        %>
        <%@include file="enunciado.jsp" %>

        <div class="row">

            <section>

                <article>
                    <%for (i = 0; i < vRazon.length; i++) {
                            valor = 0;
                            valorAnt = 0;
                            diferencia = 0;
                            coordenada1 = "";
                            coordenada2 = "";
                            coordenada3 = "";
                            coordenada4 = "";
                            chartsGoogle = "http://chart.googleapis.com/chart?cht=lxy&chs=500x500&chxt=x,y&chco=0000FF,ff0000&chtt=Grupo_08&chts=FF0000,20,r&chdl=Valores|Diferencia&chds=a&chg=0,10,0,0,0,0&chdlp=t&chd=t:";
                            encontrado = false;
                    %>
                    <div class="column">
                        <table style="border-style: solid">
                            <caption>Progresi&oacute;n Aritm&eacute;tica Raz&oacute;n&nbsp;&nbsp;<%=vRazon[i]%></caption>
                            <tr>
                                <th style="border-style: initial;color: blue">Valores</th>
                                <th style="border-style: initial;color: blue">Diferencia</th>
                            </tr>

                            <%
                                razon = vRazon[i];
                                for (j = 1; j <= 100 && !encontrado; j++) {

                                    if (j == 1) {
                                        valor = 1;
                                        valorAnt = 1;
                                        diferencia = valor - valorAnt;

                                    } else {

                                        valor = valorAnt * razon;
                                        diferencia = valor - valorAnt;
                                        valorAnt = valor;
                                    }

                                    if (valor <= 100) {
                            %> 
                            <tr>
                                <td style="text-align: center"><%=valor%></td>
                                <td style="text-align: center"><%=diferencia%></td>
                            </tr>
                            <%-- quitamos las filas con ceros y pintamos la grafica rellenando los valores con google image charts--%>
                            <%

                                        if (valor * razon <= 100 && j != 100) {
                                            coordenada1 += j + ",";
                                            coordenada2 += j + ",";
                                            coordenada3 += valor + ",";
                                            coordenada4 += diferencia + ",";
                                        } else {
                                            coordenada1 += j + "|";
                                            coordenada2 += j + "|";
                                            coordenada3 += valor + "|";
                                            coordenada4 += diferencia;
                                            encontrado = true;
                                        }
                                    }
                                }
                                chartsGoogle += coordenada1 + coordenada3 + coordenada2 + coordenada4;
                            %>
                        </table>
                        <img src=<%=chartsGoogle%> alt="https://developers.google.com/chart/image/docs/gallery/line_charts"/>
                    </div>
                    <%}%>

                </article>

            </section>

        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
