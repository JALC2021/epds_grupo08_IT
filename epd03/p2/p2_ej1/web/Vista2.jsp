<%@page import="aparcamiento.DatosParking"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="aparcamiento.CocheModelo"%>
<%! List<CocheModelo> cochesAparcados = DatosParking.cochesZonaAzul();%>
<%! List<CocheModelo> vehiculosExcedenTiempo = DatosParking.vehiculosExceden(true);%>
<%! List<CocheModelo> vehiculosNoExcedenTiempo = DatosParking.vehiculosExceden(false);%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" type="text/css" href="style.css" />
        <title>p2_ej1</title>
    </head>
    <body>
        <header><h1>Aparcamiento Zona Azul</h1></header>
        <div class="container">
            <script type='text/javascript' src="//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>

            <div class="row">
                <div class="col-25">
                    <label>¿Que vehiculos quieres ver?</label>
                </div>
                <div class="col-75">
                    <label class="labelRadio">Vehiculos que exceden el tiempo en zona azul</label><input class="radioEstudio" type="radio" name="estudiadoIt" value="si">
                    <input class="radioEstudio" type="radio" name="estudiadoIt" value="no"><label class="labelRadio">Vehiculos que no</label>
                </div>
            </div>
            <script type="text/javascript">

                $(document).ready(function () {
                    $(".radioEstudio").click(function (evento) {

                        var valor = $(this).val();

                        if (valor === 'si') {
                            $("#siEstudio").css("display", "block");
                            $("#noEstudio").css("display", "none");
                        } else {
                            $("#siEstudio").css("display", "none");
                            $("#noEstudio").css("display", "block");
                        }
                    });
                });

            </script>
            <div id="siEstudio" class="row" style="display: none;">
                <table border="2">
                    <tr>
                        <th>Matricula</th>
                        <th>Modelo</th>
                        <th>Hora de entrada</th>
                        <th>Hora de salida</th>
                        <th>Tiempo permitido</th>
                    </tr>

                    <%
                        for (CocheModelo cm : vehiculosExcedenTiempo) {
                    %>
                    <tr>
                        <td><%=cm.getMatricula()%></td>
                        <td><%=cm.getModelo()%></td>
                        <td><%=cm.getHoraEntradaConFormato()%></td>
                        <td><%=cm.getHoraSalidaConFormato()%></td>
                        <td><%=cm.getTiempoPermitido()%></td>
                    </tr>

                    <% } %>

                </table>
            </div>
            <div id="noEstudio" class="row" style="display: none;">
                <table border="2">
                    <tr>
                        <th>Matricula</th>
                        <th>Modelo</th>
                        <th>Hora de entrada</th>
                        <th>Hora de salida</th>
                        <th>Tiempo permitido</th>
                    </tr>

                    <%
                        for (CocheModelo cm : vehiculosNoExcedenTiempo) {
                    %>
                    <tr>
                        <td><%=cm.getMatricula()%></td>
                        <td><%=cm.getModelo()%></td>
                        <td><%=cm.getHoraEntradaConFormato()%></td>
                        <td><%=cm.getHoraSalidaConFormato()%></td>
                        <td><%=cm.getTiempoPermitido()%></td>
                    </tr>

                    <% }%>

                </table>
            </div>
        </div>
    </body>
</html>
