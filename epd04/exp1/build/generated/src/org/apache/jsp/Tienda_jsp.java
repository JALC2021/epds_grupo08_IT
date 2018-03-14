package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import libreria.Almacen;
import libreria.Libro;

public final class Tienda_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=ISO-8859-1");
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

    List<Libro> listaLibros = null;
    try {
        listaLibros = Almacen.consultaLibrosDisponibles();
    } catch (Exception ex) {
        out.print(ex.getMessage());
    }

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Tienda Electrónica de Libros</h1>\n");
      out.write("        <form name=\"formularioTienda\" action=\"LibreriaServlet\" method=\"post\">\n");
      out.write("            <b>Libros</b>\n");
      out.write("            <select name=\"seleccionLibros\">\n");
      out.write("                ");
 for (int i = 0; i < listaLibros.size(); i++) {
                        Libro libro = listaLibros.get(i);
                        String txtLibro = libro.getTitulo() + "; "
                                + libro.getAutor() + "; " + libro.getPrecio();
                
      out.write("\n");
      out.write("                <option value=\"");
      out.print(String.valueOf(libro.getIsbn()));
      out.write('"');
      out.write('>');
      out.print(txtLibro);
      out.write("</option>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <input type=\"hidden\" name=\"Accion\" value=\"agregar\">\n");
      out.write("            <input type=\"submit\" name=\"Agregar\" value=\"Agregar Libro\">\n");
      out.write("        </form>\n");
      out.write("        <hr>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "CarroCompra.jsp", out, true);
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
