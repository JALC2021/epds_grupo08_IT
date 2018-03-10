package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


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
      out.write('\n');

    /*Controlador*/
    List<cocheModelo> listaCoches = new ArrayList<cocheModelo>();

    //Coche1
    cocheModelo coche1 = new cocheModelo();

    coche1.setMatricula("12784HIH");

    coche1.setModelo("BMW");

    Calendar horaEntradaCoche1 = new GregorianCalendar();
    Calendar horaSalidaCoche1 = new GregorianCalendar();

    horaEntradaCoche1.set(Calendar.HOUR_OF_DAY, 10);
    horaEntradaCoche1.set(Calendar.MINUTE, 05);

    coche1.setHoraEntrada(horaEntradaCoche1);

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

    coche2.setTiempoPermitido(30);

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

    horaSalidaCoche4.set(Calendar.HOUR_OF_DAY, 11);
    horaSalidaCoche4.set(Calendar.MINUTE, 05);
    coche4.setHoraSalida(horaSalidaCoche4);

    coche4.setTiempoPermitido(15);

    listaCoches.add(coche4);


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("        <title>Epd3_P1</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                    ");
      out.write("\n");
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
      out.write("\n");
      out.write("                ");

                    for (cocheModelo cm : listaCoches) {
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
