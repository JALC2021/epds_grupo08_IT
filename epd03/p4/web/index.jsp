
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css" />
        <title>Epd3_p4</title>
    </head>
    <body>
        <header><h1>Aparcamiento Zona Azul</h1></header>
        <div class="container">
            <label>Si desea consultar la ocupaci&oacute;n de la zona az&uacute;l, pulse "Consultar"</label>

            <script type='text/javascript' src="//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
            
            <form action="ParkingServlet" method="post">
                <input type="hidden" name="accion" value="consultarAparcamiento">
                <input type="submit" name="consultarCoches" value="Consultar">
            </form>


            <label>Si desea consultar los veh&iacute;culos que exceden el tiempo o no de la zona az&uacute;l, pulse "Consultar"</label>


            <div class="row">

                <div class="col-25">
                    <label>¿Que vehiculos quieres ver?</label>
                </div>
                <div class="col-75">
                    <form action="ParkingServlet" method="post">
                        <input type="hidden" name="accion" value="excedenTiempo">
                        <label class="labelRadio">Vehiculos que exceden el tiempo en zona azul</label><input class="radioEstudio" type="radio" name="excesotiempo" value="si">
                        <input class="radioEstudio" type="radio" name="excesotiempo" value="no"><label class="labelRadio">Vehiculos que no</label>
                    </form>
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

            <form action="ParkingServlet" method="post">
                <div class="row">
                    <div class="col-25">
                        <label>Buscar coches por matricula</label>
                    </div>
                    <div class="col-75">
                        <input type="text" name="matriculaCoche">
                        <input type="hidden" name="accion" value="buscarMatricula">
                        <input type="submit" name="buscar" value="buscar">

                    </div>
                </div>
            </form>


            <form action="ParkingServlet" method="post">
                <div class="row">
                    <div class="col-25">
                        <label>Coches que siguen en el aparcamiento</label>
                    </div>
                    <div class="col-75">
                        <input type="hidden" name="accion" value="buscarAparcados">
                        <input type="submit" name="buscar1" value="buscar">

                    </div>
                </div>
            </form>

        </div>
        <%@include file="footer.jsp"%>
    </body>
</html>
