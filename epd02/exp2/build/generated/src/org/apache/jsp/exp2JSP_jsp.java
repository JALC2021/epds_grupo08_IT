package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Enumeration;

public final class exp2JSP_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String[] parametros = {"Nombre", "correo-e", "dni"}; 
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
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <form action=\"exp2JSP.jsp\" method=\"get\">\n");
      out.write("            <table border=1 cellspacing=1 cellpadding=2>\n");
      out.write("                ");
 for (int i = 0; i < parametros.length; i++) {
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(parametros[i]);
      out.write("</td>\n");
      out.write("                    <td><input type=\"text\" name= ");
      out.print(parametros[i]);
      out.write(">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" value=\"Enviar\" size=\"2\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        <hr>\n");
      out.write("        <table border=1 cellspacing=1 cellpadding=2>\n");
      out.write("            ");

                Enumeration enu = request.getParameterNames();
                while (enu.hasMoreElements()) {
                    String paramName = (String) enu.nextElement();
                    String paramValue = (String) request.getParameter(paramName);
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(paramName);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(paramValue);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("        </table>\n");
      out.write("        ");
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
