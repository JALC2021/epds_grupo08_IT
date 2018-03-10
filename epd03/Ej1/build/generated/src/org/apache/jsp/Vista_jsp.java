package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import aparcamiento.cocheModelo;
import aparcamiento.parkingControlador;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public final class Vista_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 List<cocheModelo> cochesAparcados = parkingControlador.cochesZonaAzul();
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("        <title>Epd3_Ej1</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header><h1>Aparcamiento Zona Azul</h1></header>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Matricula</th>\n");
      out.write("                    <th>Modelo</th>\n");
      out.write("                    <th>Hora de entrada</th>\n");
      out.write("                    <th>Hora de salida</th>\n");
      out.write("                    <th>Tiempo permitido</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    for (cocheModelo cm : cochesAparcados) {
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
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(matricula);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(modelo);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(HoraEntrada);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(HoraSalida);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(TiempoPermitido);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
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
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
