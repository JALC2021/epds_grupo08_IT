package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>IT - EPD02 - Experimento02</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>IT - EPD02 - Experimento02</h1>        \r\n");
      out.write("        <h2>Identifíquese y seleccione dónde quiere ir:</h2>\r\n");
      out.write("        <form action=\"#\" method=\"post\">\r\n");
      out.write("            <table border=\"1\" cellspacing=\"2\" cellpadding=\"2\">\r\n");
      out.write("                <tr> \r\n");
      out.write("                    <td>Usuario</td> \r\n");
      out.write("                    <td><input type=\"text\" name=\"usuario\"></td> \r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr> \r\n");
      out.write("                    <td>A qué página quieres ir?</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <select name=\"pagina\">\r\n");
      out.write("                            <option value=\"pA\">Página A</option>\r\n");
      out.write("                            <option value=\"pB\">Página B</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td colspan=\"2\"><input type=\"submit\" name=\"btnEnviar\" value=\"Enviar\" size=\"2\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </form>\r\n");
      out.write("        ");
 
            String usuario=request.getParameter("usuario"); 
            Cookie c1=new Cookie("user",usuario);
            
            if(request.getParameter("pagina")=="pA"){
            response.sendRedirect("pA.jsp");
            }else{
             response.sendRedirect("pB.jsp");   
            }
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
