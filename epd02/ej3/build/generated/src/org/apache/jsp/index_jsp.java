package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Date;

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ej3-epd2</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("          ");

        if(request.getParameter("invalidar")!=null){
            out.print("has pulsado invalidar");
            session.invalidate();
        }
         
      out.write("\n");
      out.write("        <h1>DATOS DE LA SESI&Oacute;N:</h1>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <td>ID de la sesi&oacute;n</td>\n");
      out.write("                <td>");
      out.print(session.getId());
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Fecha de creaci&oacute;n</td>\n");
      out.write("                ");
Date fecha=new Date(session.getCreationTime());
      out.write("\n");
      out.write("                <td>");
      out.print(fecha);
      out.write("</td>\n");
      out.write("               ");
 SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
      out.write("\n");
      out.write("             \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("               <td>Fecha formateada</td>\n");
      out.write("               <td>");
      out.print(df.format(fecha));
      out.write("</td>\n");
      out.write("               \n");
      out.write("            </tr>\n");
      out.write("           ");
 
           Date createTime = new Date(session.getCreationTime());
           Date lastAccessTime = new Date(session.getLastAccessedTime());
           Long duracion = lastAccessTime.getTime() - createTime.getTime();
           
      out.write("\n");
      out.write("               <tr>\n");
      out.write("                   <td>Duraci&oacute;n</td>\n");
      out.write("                   <td>");
out.print(duracion / 1000);
      out.write("</td>\n");
      out.write("               </tr>\n");
      out.write("        </table>\n");
      out.write("         \n");
      out.write("       <form action=\"#\" method=\"post\">\n");
      out.write("           <label><br />Pulse para invalidar la sesi&oacute;n y ver los datos de la nueva sesi&oacute;n</label> <p> <input type=\"submit\" name=\"invalidar\" value=\"Invalidar\"></p>\n");
      out.write("       </form>\n");
      out.write("        \n");
      out.write("      \n");
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
