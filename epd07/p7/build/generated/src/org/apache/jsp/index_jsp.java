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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>EPD 7_p7</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("        ");

            if (request.getParameter("login") != null) {
                String usu = request.getParameter("usuario");
                String pass = request.getParameter("contrasenia");
                try {
                    paquete.ServicioAutenticacion_Service service = new paquete.ServicioAutenticacion_Service();
                    paquete.ServicioAutenticacion port = service.getServicioAutenticacionPort();
                    // TODO initialize WS operation arguments here

                    // TODO process result here
                    long result = port.login(usu, pass);
//                    out.println("Result = " + result);

                    Cookie cook = new Cookie("token", Long.toString(result));
                    response.addCookie(cook);
                    out.println("Cookie cook = " + cook.getValue());
                    out.println("Cookie cook = " + cook.getName().equals("token"));
                    //response.sendRedirect("login.jsp");

                } catch (Exception ex) {
                    // TODO handle custom exceptions here
                    out.println("exception" + ex);
                }
            
        
      out.write("\n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("        ");
 }else if (request.getCookies() != null) {

                Cookie cookies[] = request.getCookies();
                boolean enc = false;

                int i = 0;
                while (i < cookies.length && !enc) {

                    if (cookies[i].getName().equals("token")) {

                        String auxtoken = cookies[i].getValue();
                        long token = Long.parseLong(auxtoken);
                   //     long token = Long.parseLong(cookies[i].getValue());

                        try {
                            paquete.ServicioAutenticacion_Service service = new paquete.ServicioAutenticacion_Service();
                            paquete.ServicioAutenticacion port = service.getServicioAutenticacionPort();
                            // TODO initialize WS operation arguments here

                            // TODO process result here
                            java.lang.Boolean result = port.isAlive(token);
                            out.println("Result = " + result);
                            if (result) {
                                enc = true;
                                out.println("Result = " + result);
                                response.sendRedirect("login.jsp");
                            }

                        } catch (Exception ex) {
                            out.println("exception" + ex);
                        }
                    }
                i++;
                }
            }
        
      out.write("\n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("        <h1>Registro</h1>\n");
      out.write("        <form method=\"post\" action=\"#\">\n");
      out.write("            <p> <label>Usuario:</label> <input type=\"text\" name=\"usuario\"></p>\n");
      out.write("            <p><label>Contrase&ntilde;a:</label> <input type=\"password\" name=\"contrasenia\"></p>\n");
      out.write("            <input type=\"submit\" name=\"login\" value=\"Login\">\n");
      out.write("        </form>\n");
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
