package org.apache.jsp.Usuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write(" <body>\n");
      out.write("\n");
      out.write("    <h1>Nuevo Usuario</h1><br><br>\n");
      out.write("    <form action=\"\" method=\"POST\" autocomplete=\"off\">\n");
      out.write("\n");
      out.write("        <p>\n");
      out.write("            Nombre: <br>\n");
      out.write("            <input type=\"text\" id=\"Nombre\" name=\"Nombre\"><br><br>\n");
      out.write("        </p>\n");
      out.write("        <p>\n");
      out.write("            Apelldio: <br>\n");
      out.write("            <input type=\"text\" id=\"Apelldio\" name=\"Apelldio\"><br><br>\n");
      out.write("        </p>\n");
      out.write("        \n");
      out.write("        <p>\n");
      out.write("            Tipo_Documento: <br>\n");
      out.write("            <input type=\"text\" id=\"Tipo_Documento\" name=\"Tipo_Documento\"><br><br>\n");
      out.write("        </p>   \n");
      out.write("        \n");
      out.write("        <p>\n");
      out.write("            Documento_Identificacion: <br>\n");
      out.write("            <input type=\"text\" id=\"Documento_Identificacion\" name=\"Documento_Identificacion\"><br><br>\n");
      out.write("        </p>    \n");
      out.write("        \n");
      out.write("        <p>   \n");
      out.write("            Estado: <br>\n");
      out.write("            <input type=\"text\" id=\"Estado\" name=\"Estado\"><br><br>\n");
      out.write("                      \n");
      out.write("        </p>\n");
      out.write("        \n");
      out.write("        <button id=\"guardar\" name=\"guardar\" type=\"submit\" > Guardar</button>\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("</body>\n");
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
