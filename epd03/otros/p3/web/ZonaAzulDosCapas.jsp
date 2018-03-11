<%@page import="parking.Vehiculo"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="parking.Parking"%>
<%@page import="java.util.List"%>
<%@page import="parking.Almacen"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    List<Parking> listaParking = Almacen.consultaVehiculosParking();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de Zona Azul</h1>
        <form method="post" action="#">
            <input type="submit" name="tablaCompleta" value="Mostrar todo">
            <input type="submit" name="tablaExcedidos" value="Mostrar datos de excedidos">
            <input type="submit" name="vehiculosExcedidos" value="Mostrar vehiculos excedidos">
            <input type="text" name="textoMatriculaBuscar">
            <input type="submit" name="botonMatriculaBuscar" value="Buscar matr&iacute;cula">
        </form>
        <%
            String botonTablaCompleta = request.getParameter("tablaCompleta");
            String botonTablaExcedidos = request.getParameter("tablaExcedidos");
            String botonMatriculaBuscar = request.getParameter("botonMatriculaBuscar");
            String textoMatriculaBuscar = request.getParameter("textoMatriculaBuscar");
            String botonMostrarVehiculosExcedidos = request.getParameter("vehiculosExcedidos");

            //Mostrar tabla completa
            if (botonTablaCompleta != null) {%>
        <table border="1">
            <tr>
                <th>Veh&iacute;culo</th>
                <th>Hora de entrada</th>
                <th>Hora de salida</th>
                <th>Tiempo permitido</th>
            </tr>
            <%
                for (Parking p : listaParking) {
                    //Matricula
                    String vehiculo = p.getVehiculo().getMatricula();
                    //Fechas entrada y salida
                    Calendar fechaEntrada = p.getFechaEntrada();
                    Calendar fechaSalida = p.getFechaSalida();
                    //Formato fecha
                    SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
                    String cadenaFechaEntrada = formato.format(fechaEntrada.getTime());
                    String cadenaFechaSalida = fechaSalida == null ? "--" : formato.format(fechaSalida.getTime());
                    //Tiempo permitido
                    int tiempoPermitido = p.getTiempoPermitido();
                    String cadTiempoPermitido = String.valueOf(tiempoPermitido);
            %>
            <tr>
                <td><%=vehiculo%></td>
                <td><%=cadenaFechaEntrada%></td>
                <td><%=cadenaFechaSalida%></td>
                <td><%=cadTiempoPermitido%></td>
            </tr>
            <%}
            %>
        </table>
        <%} //Mostrar tabla excedidos
        else if (botonTablaExcedidos != null) {%>
        <table border="1">
            <tr>
                <th>Veh&iacute;culo</th>
                <th>Hora de entrada</th>
                <th>Hora de salida</th>
                <th>Tiempo permitido</th>
            </tr>
            <%
                for (Parking p : listaParking) {
                    //Fechas entrada y salida
                    Calendar fechaEntrada = p.getFechaEntrada();
                    Calendar fechaSalida = p.getFechaSalida();

                    //El vehículo no sigue estacionado
                    if (fechaSalida != null) {
                        //Fecha tope con tiempo permitido
                        Calendar fechaEntradaMasMinutos = (Calendar) fechaEntrada.clone();
                        fechaEntradaMasMinutos.add(Calendar.MINUTE, p.getTiempoPermitido());
                        //Milisegundos de fechas
                        long milisFechaEntradaMasMinutos = fechaEntradaMasMinutos.getTimeInMillis() / 1000 * 60;
                        long milisFechaSalida = fechaSalida.getTimeInMillis() / 1000 * 60;

                        //Ha rebasado el tiempo permitido
                        if (milisFechaSalida < milisFechaEntradaMasMinutos) {
                            //Matricula del vehiculo
                            String vehiculo = p.getVehiculo().getMatricula();
                            //Formato fecha
                            SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
                            String cadenaFechaEntrada = formato.format(fechaEntrada.getTime());
                            String cadenaFechaSalida = fechaSalida == null ? "--" : formato.format(fechaSalida.getTime());
                            //Tiempo permitido
                            int tiempoPermitido = p.getTiempoPermitido();
                            String cadTiempoPermitido = String.valueOf(tiempoPermitido);
            %>
            <tr>
                <td><%=vehiculo%></td>
                <td><%=cadenaFechaEntrada%></td>
                <td><%=cadenaFechaSalida%></td>
                <td><%=cadTiempoPermitido%></td>
            </tr>
            <%}
                    }
                }
            %>
        </table>
        <%} else if (botonMatriculaBuscar != null && textoMatriculaBuscar != null) {
        %>
        <table border="1">
            <tr>
                <th>Veh&iacute;culo</th>
            </tr>    
            <%
                boolean encontrado = false;
                int indice = 0;
                Parking parkingAuxiliar = new Parking();

                while (indice < listaParking.size() && !encontrado) {
                    parkingAuxiliar = listaParking.get(indice);
                    //Matricula
                    String vehiculo = parkingAuxiliar.getVehiculo().getMatricula();

                    if (vehiculo.equals(textoMatriculaBuscar)) {
                        encontrado = true;%>
            <tr>
                <td><%=vehiculo%></td>
            </tr>
            <%
                    }
                    indice++;
                }
            %>
        </table>
        <%} else if (botonMostrarVehiculosExcedidos
                != null) {
        %>
        <table border="1">
            <tr>
                <th>Veh&iacute;culo</th>
            </tr>    
            <%
                for (Parking p : listaParking) {
                    //Fechas entrada y salida
                    Calendar fechaEntrada = p.getFechaEntrada();
                    Calendar fechaSalida = p.getFechaSalida();

                    //El vehículo no sigue estacionado
                    if (fechaSalida != null) {
                        //Fecha tope con tiempo permitido
                        Calendar fechaEntradaMasMinutos = (Calendar) fechaEntrada.clone();
                        fechaEntradaMasMinutos.add(Calendar.MINUTE, p.getTiempoPermitido());
                        //Milisegundos de fechas
                        long milisFechaEntradaMasMinutos = fechaEntradaMasMinutos.getTimeInMillis() / 1000 * 60;
                        long milisFechaSalida = fechaSalida.getTimeInMillis() / 1000 * 60;

                        //Ha rebasado el tiempo permitido
                        if (milisFechaSalida < milisFechaEntradaMasMinutos) {
                            //Matricula del vehiculo
                            String vehiculo = p.getVehiculo().getMatricula();%>
            <tr>
                <td><%=vehiculo%></td>
            </tr>
            <%
                        }
                    }
                }
            %>
        </table>
        <%}
        %>
    </body>
</html>