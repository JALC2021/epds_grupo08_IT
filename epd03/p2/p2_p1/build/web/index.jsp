<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Objects"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%!
    /*Modelo*/
    public class cocheModelo {

        private String matricula;
        private String modelo;
        private Calendar horaEntrada;
        private Calendar horaSalida;
        private int tiempoPermitido;

        public cocheModelo() {
        }

        public cocheModelo(String matricula, String modelo, Calendar horaEntrada, Calendar horaSalida, int tiempoPermitido) {
            this.matricula = matricula;
            this.modelo = modelo;
            this.horaEntrada = horaEntrada;
            this.horaSalida = horaSalida;
            this.tiempoPermitido = tiempoPermitido;
        }

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public Calendar getHoraEntrada() {
            return horaEntrada;
        }

        public void setHoraEntrada(Calendar horaEntrada) {
            this.horaEntrada = horaEntrada;
        }

        public Calendar getHoraSalida() {
            return horaSalida;
        }

        public void setHoraSalida(Calendar horaSalida) {

            this.horaSalida = horaSalida;
        }

        public int getTiempoPermitido() {
            return tiempoPermitido;
        }

        public void setTiempoPermitido(int tiempoPermitido) {
            this.tiempoPermitido = tiempoPermitido;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 29 * hash + Objects.hashCode(this.matricula);
            hash = 29 * hash + Objects.hashCode(this.modelo);
            hash = 29 * hash + Objects.hashCode(this.horaEntrada);
            hash = 29 * hash + Objects.hashCode(this.horaSalida);
            hash = 29 * hash + this.tiempoPermitido;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final cocheModelo other = (cocheModelo) obj;
            if (this.tiempoPermitido != other.tiempoPermitido) {
                return false;
            }
            if (!Objects.equals(this.matricula, other.matricula)) {
                return false;
            }
            if (!Objects.equals(this.modelo, other.modelo)) {
                return false;
            }
            if (!Objects.equals(this.horaEntrada, other.horaEntrada)) {
                return false;
            }
            if (!Objects.equals(this.horaSalida, other.horaSalida)) {
                return false;
            }
            return true;
        }
    }
%>
<%
    /*Controlador*/
    List<cocheModelo> listaCoches = new ArrayList<cocheModelo>();

    //Datos parking
    //Coche1
    cocheModelo coche1 = new cocheModelo();

    coche1.setMatricula("12784HIH");

    coche1.setModelo("BMW");

    Calendar horaEntradaCoche1 = new GregorianCalendar();
    Calendar horaSalidaCoche1 = new GregorianCalendar();

    horaEntradaCoche1.set(Calendar.HOUR_OF_DAY, 10);
    horaEntradaCoche1.set(Calendar.MINUTE, 05);

    coche1.setHoraEntrada(horaEntradaCoche1);
    
    horaSalidaCoche1.set(Calendar.HOUR_OF_DAY, 10);
    horaSalidaCoche1.set(Calendar.MINUTE, 35);
    coche1.setHoraSalida(horaSalidaCoche1);

    coche1.setTiempoPermitido(30);

    listaCoches.add(coche1);

    //Coche2
    cocheModelo coche2 = new cocheModelo();

    coche2.setMatricula("76234AAC");

    coche2.setModelo("Toyota");

    Calendar horaEntradaCoche2 = new GregorianCalendar();
    Calendar horaSalidaCoche2 = new GregorianCalendar();

    horaEntradaCoche2.set(Calendar.HOUR_OF_DAY, 10);
    horaEntradaCoche2.set(Calendar.MINUTE, 07);
    coche2.setHoraEntrada(horaEntradaCoche2);

    horaSalidaCoche2.set(Calendar.HOUR_OF_DAY, 10);
    horaSalidaCoche2.set(Calendar.MINUTE, 35);
    coche2.setHoraSalida(horaSalidaCoche2);

    coche2.setTiempoPermitido(15);

    listaCoches.add(coche2);

    //Coche3
    cocheModelo coche3 = new cocheModelo();

    coche3.setMatricula("32162BAQ");

    coche3.setModelo("Audi");

    Calendar horaEntradaCoche3 = new GregorianCalendar();
    Calendar horaSalidaCoche3 = new GregorianCalendar();

    horaEntradaCoche3.set(Calendar.HOUR_OF_DAY, 10);
    horaEntradaCoche3.set(Calendar.MINUTE, 45);

    coche3.setHoraEntrada(horaEntradaCoche3);
    
    horaSalidaCoche3.set(Calendar.HOUR_OF_DAY, 11);
    horaSalidaCoche3.set(Calendar.MINUTE, 35);
    coche3.setHoraSalida(horaSalidaCoche3);

    coche3.setTiempoPermitido(90);

    listaCoches.add(coche3);

    //Coche4
    cocheModelo coche4 = new cocheModelo();

    coche4.setMatricula("87823CDA");

    coche4.setModelo("Mercedes");

    Calendar horaEntradaCoche4 = new GregorianCalendar();
    Calendar horaSalidaCoche4 = new GregorianCalendar();

    horaEntradaCoche4.set(Calendar.HOUR_OF_DAY, 10);
    horaEntradaCoche4.set(Calendar.MINUTE, 46);
    coche4.setHoraEntrada(horaEntradaCoche4);

  

    coche4.setTiempoPermitido(15);

    listaCoches.add(coche4);

%>
<!DOCTYPE html>
<html>
    <head>
          <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="style.css" />
        <script type='text/javascript' src="//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
         <header><h1>Aparcamiento Zona Azul</h1></header>
        <div class="container">
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
                    for (cocheModelo cm : listaCoches) {
                        //Matricula
                        String matricula = cm.getMatricula();
                        //Modelo
                        String modelo = cm.getModelo();
                        //Hora entrada y salida
                        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
                        Date horaEntrada = cm.getHoraEntrada().getTime();
                        String HoraEntrada = formatoHora.format(horaEntrada.getTime());
                        
                        int diferencia = -1;
                        String HoraSalida = "";
                        Calendar horaSalida = cm.getHoraSalida();
                        
                        if(horaSalida != null){
                         Date horaSalida1 = cm.getHoraSalida().getTime();
                         HoraSalida = formatoHora.format(horaSalida.getTime());
                          long minutosHoraEntrada = horaEntrada.getTime();
                        long minutosHoraSalida = horaSalida1.getTime();
                         diferencia = (int) ((minutosHoraSalida - minutosHoraEntrada) / (1000*60));
                       
                        }else {
                         HoraSalida =  "--";
                         diferencia = -1;
                        }
                        //Tiempo permitido
                        int tiempoPermitido = cm.getTiempoPermitido();
                        String TiempoPermitido = String.valueOf(tiempoPermitido);
               
                       
                        
                    
                        
                    if(diferencia > tiempoPermitido){
                %>
                <tr>
                    <td><%=matricula%></td>
                    <td><%=modelo%></td>
                    <td><%=HoraEntrada%></td>
                    <td><%=HoraSalida%></td>
                    <td><%=TiempoPermitido%></td>
                </tr>
                <%}}%>

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
                    for (cocheModelo cm : listaCoches) {
                        //Matricula
                        String matricula = cm.getMatricula();
                        //Modelo
                        String modelo = cm.getModelo();
                        //Hora entrada y salida
                     SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
                        Date horaEntrada = cm.getHoraEntrada().getTime();
                        String HoraEntrada = formatoHora.format(horaEntrada.getTime());
                        
                        int diferencia = -1;
                        String HoraSalida = "";
                        Calendar horaSalida = cm.getHoraSalida();
                        
                        if(horaSalida != null){
                         Date horaSalida1 = cm.getHoraSalida().getTime();
                         HoraSalida = formatoHora.format(horaSalida.getTime());
                          long minutosHoraEntrada = horaEntrada.getTime();
                        long minutosHoraSalida = horaSalida1.getTime();
                         diferencia = (int) ((minutosHoraSalida - minutosHoraEntrada) / (1000*60));
                       
                        }else {
                         HoraSalida =  "--";
                         diferencia = -1;
                        }
                        //Tiempo permitido
                        int tiempoPermitido = cm.getTiempoPermitido();
                        String TiempoPermitido = String.valueOf(tiempoPermitido);
               
                        
                        
                    
                        
                    if(diferencia <= tiempoPermitido){
                %>
                <tr>
                    <td><%=matricula%></td>
                    <td><%=modelo%></td>
                    <td><%=HoraEntrada%></td>
                    <td><%=HoraSalida%></td>
                    <td><%=TiempoPermitido%></td>
                </tr>
                <%}}%>

            </table>
                </div>
        </div>
                 <footer class="footerVista">
            <p class="pFooter">Grupo&nbsp;08&nbsp;IT</p>
            <p class="pFooter">Juan Antonio L&oacute;pez Cano, Susana de la Calle Iglesias, Pablo Parejo Fern&aacute;ndez</p>
        </footer>
    </body>
</html>
