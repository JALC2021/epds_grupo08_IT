package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.CocheModelo;
import Modelo.persistencia.DatosParking;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import Modelo.persistencia.DatosParking;
import java.util.List;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import Modelo.CocheModelo;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 List<CocheModelo> cochesAparcados = DatosParking.cochesZonaAzul();
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Vista2.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\r\n");
      out.write("        <title>p4</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header><h1>Aparcamiento Zona Azul</h1></header>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>Matricula</th>\r\n");
      out.write("                    <th>Modelo</th>\r\n");
      out.write("                    <th>Hora de entrada</th>\r\n");
      out.write("                    <th>Hora de salida</th>\r\n");
      out.write("                    <th>Tiempo permitido</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");

                    for (CocheModelo cm : cochesAparcados) {
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
                
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>");
      out.print(matricula);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(modelo);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(HoraEntrada);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(HoraSalida);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(TiempoPermitido);
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("                \r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <script type='text/javascript' src=\"//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("                    <div class=\"col-25\">\r\n");
      out.write("                        <label>¿Que vehiculos quieres ver?</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-75\">\r\n");
      out.write("                        <label class=\"labelRadio\">Vehiculos que exceden el tiempo en zona azul</label><input class=\"radioEstudio\" type=\"radio\" name=\"estudiadoIt\" value=\"si\">\r\n");
      out.write("                        <input class=\"radioEstudio\" type=\"radio\" name=\"estudiadoIt\" value=\"no\"><label class=\"labelRadio\">Vehiculos que no</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("                    $(document).ready(function () {\r\n");
      out.write("                        $(\".radioEstudio\").click(function (evento) {\r\n");
      out.write("\r\n");
      out.write("                            var valor = $(this).val();\r\n");
      out.write("\r\n");
      out.write("                            if (valor === 'si') {\r\n");
      out.write("                                $(\"#siEstudio\").css(\"display\", \"block\");\r\n");
      out.write("                                $(\"#noEstudio\").css(\"display\", \"none\");\r\n");
      out.write("                            } else {\r\n");
      out.write("                                $(\"#siEstudio\").css(\"display\", \"none\");\r\n");
      out.write("                                $(\"#noEstudio\").css(\"display\", \"block\");\r\n");
      out.write("                            }\r\n");
      out.write("                        });\r\n");
      out.write("                    });\r\n");
      out.write("\r\n");
      out.write("                </script>\r\n");
      out.write("                <div id=\"siEstudio\" class=\"row\" style=\"display: none;\">\r\n");
      out.write("                    <table border=\"2\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>Matricula</th>\r\n");
      out.write("                    <th>Modelo</th>\r\n");
      out.write("                    <th>Hora de entrada</th>\r\n");
      out.write("                    <th>Hora de salida</th>\r\n");
      out.write("                    <th>Tiempo permitido</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");

                    for (CocheModelo cm : cochesAparcados) {
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
                
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>");
      out.print(matricula);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(modelo);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(HoraEntrada);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(HoraSalida);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(TiempoPermitido);
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
}}
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"noEstudio\" class=\"row\" style=\"display: none;\">\r\n");
      out.write("                     <table border=\"2\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>Matricula</th>\r\n");
      out.write("                    <th>Modelo</th>\r\n");
      out.write("                    <th>Hora de entrada</th>\r\n");
      out.write("                    <th>Hora de salida</th>\r\n");
      out.write("                    <th>Tiempo permitido</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");

                    for (CocheModelo cm : cochesAparcados) {
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
                
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>");
      out.print(matricula);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(modelo);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(HoraEntrada);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(HoraSalida);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(TiempoPermitido);
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
}}
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                   ");
 //Busqueda de coches 
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                <form method=\"post\">\r\n");
      out.write("                 <div class=\"row\">\r\n");
      out.write("                 <div class=\"col-25\">\r\n");
      out.write("                        <label>Buscar coches por matricula</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-75\">\r\n");
      out.write("                        <input type=\"text\" name=\"matriculaCoche\">\r\n");
      out.write("                        <input type=\"submit\" name=\"buscar\" value=\"buscar\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </form>\r\n");
      out.write("                \r\n");
      out.write("                ");

                    
              if(request.getParameter("buscar") != null){
                  
                  
                  String matriculaRecibida = (String) request.getParameter("matriculaCoche");
                  if (matriculaRecibida != null && matriculaRecibida != ""){
                  
      out.write("\r\n");
      out.write("                  \r\n");
      out.write("                 <div class=\"row\">\r\n");
      out.write("                  <table>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <th>Matricula</th>\r\n");
      out.write("                    <th>Modelo</th>\r\n");
      out.write("                    <th>Hora de entrada</th>\r\n");
      out.write("                    <th>Hora de salida</th>\r\n");
      out.write("                    <th>Tiempo permitido</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                  ");

                  for (CocheModelo cm : cochesAparcados) {
                        //Matricula
                        String matricula = cm.getMatricula();
                        //Modelo
                        String modelo = cm.getModelo();
                        //Hora entrada y salida
                           SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
                        Date horaEntrada = cm.getHoraEntrada().getTime();
                        String HoraEntrada = formatoHora.format(horaEntrada.getTime());
                        
                        
                        String HoraSalida = "";
                        Calendar horaSalida = cm.getHoraSalida();
                        
                        if(horaSalida != null){
                         Date horaSalida1 = cm.getHoraSalida().getTime();
                         HoraSalida = formatoHora.format(horaSalida.getTime());
                          
                       
                        }else {
                         HoraSalida =  "--";
                      
                        }
                        //Tiempo permitido
                        int tiempoPermitido = cm.getTiempoPermitido();
                        String TiempoPermitido = String.valueOf(tiempoPermitido);
                       
                        if(matricula.startsWith(matriculaRecibida)){
                             
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>");
      out.print(matricula);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(modelo);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(HoraEntrada);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(HoraSalida);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(TiempoPermitido);
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                ");
}}
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                  </table>\r\n");
      out.write("                \r\n");
      out.write("                 </div>\r\n");
      out.write("                ");
 }} 
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <form method=\"post\">\r\n");
      out.write("                 <div class=\"row\">\r\n");
      out.write("                 <div class=\"col-25\">\r\n");
      out.write("                        <label>Coches que siguen en el aparcamiento</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-75\">\r\n");
      out.write("                     \r\n");
      out.write("                        <input type=\"submit\" name=\"buscar1\" value=\"buscar\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </form>\r\n");
      out.write("                \r\n");
      out.write("                ");

                    
              if(request.getParameter("buscar1") != null){
                  
                 
                  
      out.write("\r\n");
      out.write("                  \r\n");
      out.write("                 <div class=\"row\">\r\n");
      out.write("                  <table>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <th>Matricula</th>\r\n");
      out.write("                    <th>Modelo</th>\r\n");
      out.write("                    <th>Hora de entrada</th>\r\n");
      out.write("                    <th>Hora de salida</th>\r\n");
      out.write("                    <th>Tiempo permitido</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                  ");

                  for (CocheModelo cm : cochesAparcados) {
                        //Matricula
                        String matricula = cm.getMatricula();
                        //Modelo
                        String modelo = cm.getModelo();
                        //Hora entrada y salida
                     SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
                        Date horaEntrada = cm.getHoraEntrada().getTime();
                        String HoraEntrada = formatoHora.format(horaEntrada.getTime());
                        
                        
                        String HoraSalida = "";
                        Calendar horaSalida = cm.getHoraSalida();
                        
                        if(horaSalida != null){
                         Date horaSalida1 = cm.getHoraSalida().getTime();
                         HoraSalida = formatoHora.format(horaSalida.getTime());
                          
                       
                        }else {
                         HoraSalida =  "--";
                        
                        }
                        
                        
                        
                        //Tiempo permitido
                        int tiempoPermitido = cm.getTiempoPermitido();
                        String TiempoPermitido = String.valueOf(tiempoPermitido);
                       
                        if(HoraSalida == "--"){
                             
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>");
      out.print(matricula);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(modelo);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(HoraEntrada);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(HoraSalida);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(TiempoPermitido);
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                ");
}}
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                  </table>\r\n");
      out.write("                \r\n");
      out.write("                 </div>\r\n");
      out.write("                ");
 } 
      out.write(" \r\n");
      out.write("                \r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <footer class=\"footerVista\">\r\n");
      out.write("            <p class=\"pFooter\">Grupo&nbsp;08&nbsp;IT</p>\r\n");
      out.write("            <p class=\"pFooter\">Juan Antonio L&oacute;pez Cano, Susana de la Calle Iglesias, Pablo Parejo Fern&aacute;ndez</p>\r\n");
      out.write("        </footer>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
