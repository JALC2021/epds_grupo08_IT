package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("        <title>EPD1-p1</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("\n");
      out.write("        ");
 String nombre = request.getParameter("nombre");
            String apellidos = request.getParameter("apellidos");
            String estadoCivil = request.getParameter("estadoCivil");
            String trabaja = request.getParameter("trabaja");
            String ingresos = request.getParameter("ingresos");
            String gastos = request.getParameter("gastos");
           // Float ingresos= Float.parseFloat(request.getParameter("ingresos"));
           // Float gastos = Float.valueOf(request.getParameter("gastos"));
            
      out.write("\n");
      out.write("            ");

            out.write("Ingresos: " + ingresos);

//   Float gasto=Float.parseFloat(gastos);
//   Float ingreso=Float.parseFloat(ingresos);
//   
//   out.write("Ingresos: " + ingreso); 
            out.write("Gastos: " + gastos);
//   Float ingreso = new Float(ingresos);
//   Float gasto= new Float(gastos);
            // String alfa= new String(“3.5”);

//double ingreso= 0;
//double gasto=0;
//
//ingreso= Double.parseDouble(ingresos);
//gasto=Double.parseDouble(gastos);
//String alfa8=new String(“50”);
            Double ingreso = new Double(0);
            Double gasto = new Double(0);

            ingreso = ingreso.valueOf(ingresos);
            gasto = gasto.valueOf(gastos);
            if (ingreso > gasto) {

                out.write("Ingreso es mayor que el gasto");
            } else {

                out.write("Gasto es mayor que el ingreso");
            }

//   ingresos = Float.parseFloat(request.getParameter("ingresos"));
//   gastos=Float.parseFloat(request.getParameter("gastos"));

        
      out.write("\n");
      out.write("\n");
      out.write("           ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <footer>\r\n");
      out.write("            <p>Grupo&nbsp;08&nbsp;IT</p>\r\n");
      out.write("            <p>Juan Antonio L&oacute;pez Cano, Susana de la Calle Iglesias</p>\r\n");
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
