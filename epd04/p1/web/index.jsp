
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Objects"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%!
    /*Modelo*/
    public class CocheModelo {
        private String matricula;
        private String modelo;
        private Calendar horaEntrada;
        private Calendar horaSalida;
        private int tiempoPermitido;

    private static final String controlador = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost/parking";
    private static final String usuario = "root";
    private static final String pass = "";
    

      

        public CocheModelo() {
        }
        public CocheModelo(String matricula, String modelo, Calendar horaEntrada, Calendar horaSalida, int tiempoPermitido) {
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
            final CocheModelo other = (CocheModelo) obj;
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

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" type="text/css" href="style.css" />
        <title>Epd3_p1</title>
        
        <%
        List<CocheModelo> listaCoches = new ArrayList<CocheModelo>();
            
        try
{
   // Conexion con bd
  Class.forName(CocheModelo.controlador);
          Connection conexion = DriverManager.getConnection(CocheModelo.url, CocheModelo.usuario, CocheModelo.pass);
   if (!conexion.isClosed())
   {
      // La consulta
      Statement solicitud = (Statement) conexion.createStatement();
        ResultSet resultados = solicitud.executeQuery("SELECT * FROM coche");

      
  
      while (resultados.next())
      {
        CocheModelo vehiculo = new CocheModelo();
                    vehiculo.setMatricula(resultados.getString("matricula"));
                    vehiculo.setModelo(resultados.getString("modelo"));
                    vehiculo.setHoraEntrada((Calendar)resultados.getObject("hora_entrada"));
                    vehiculo.setHoraSalida((Calendar)resultados.getObject("hora_salida"));
                    vehiculo.setTiempoPermitido(resultados.getInt("tiempo_permitido"));
            listaCoches.add(vehiculo);
      }

      conexion.close();
     
   }
   else
      // Error en la conexion
      out.println("fallo");
}
catch (Exception e)
{
   // Error en algun momento.
   out.println("Excepcion "+e);
   e.printStackTrace();
}    
            
 
        %>
        
    </head>
    <body>
                    <%--Vista --%>
        <header><h1>Aparcamiento Zona Azul</h1></header>
        <div class="container">

            <table border="2">
                <tr>
                    <th>Matricula</th>
                    <th>Modelo</th>
                    <th>Hora de entrada</th>
                    <th>Hora de salida</th>
                    <th>Tiempo permitido</th>
                </tr>

                <%
                    for (CocheModelo cm : listaCoches) {
                        //Matricula
                        String matricula = cm.getMatricula();
                        //Modelo
                        String modelo = cm.getModelo();
                        //Hora entrada y salida
                        Calendar horaEntrada = cm.getHoraEntrada();
                        Calendar horaSalida = cm.getHoraSalida();
                        //Formato fecha
                        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
                        String HoraEntrada = formatoHora.format(horaEntrada.getTime());
                        String HoraSalida = horaSalida == null ? "--" : formatoHora.format(horaSalida.getTime());
                        //Tiempo permitido
                        int tiempoPermitido = cm.getTiempoPermitido();
                        String TiempoPermitido = String.valueOf(tiempoPermitido);
                %>
                <tr>
                    <td><%=matricula%></td>
                    <td><%=modelo%></td>
                    <td><%=HoraEntrada%></td>
                    <td><%=HoraSalida%></td>
                    <td><%=TiempoPermitido%></td>
                </tr>
                <%}%>

            </table>
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
