package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AjustarCaracteristicas_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=windows-1256");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <script src=\"js/ValidarCaracteristicas.js\"  type=\"text/javascript\"></script>\r\n");
      out.write("<title>Ajustar una Nueva Caracteristica</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form method=\"POST\" action=\"CaracteristicaServices1\" name=\"ajouter\" onsubmit=\"return validar();\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"action\" value=\"insert\" />\r\n");
      out.write("\t\t<table>\r\n");
      out.write("                        <caption>Ajustar una nueva Caracteristica</caption>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("                                <td><input id=\"id\" type=\"text\" name=\"id\" placeholder=\"id\"/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("                                <td><input id=\"Nombre\" type=\"text\" name=\"Nombre\" placeholder=\"nombre de la Caracteristica\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                                <td><input id=\"Nivel\" type=\"text\" name=\"Nivel\" placeholder=\"Nivel\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                                <td><input id=\"Lenguaje1\" type=\"text\" name=\"Lenguaje1\" placeholder=\"Lenguaje1\" /></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                                <td><input id=\"Lenguaje2\" type=\"text\" name=\"Lenguaje2\" placeholder=\"Lenguaje2\" /></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                                <td><input id=\"Lenguaje3\" type=\"text\" name=\"Lenguaje3\" placeholder=\"Lenguaje3\" /></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                                <td><input id=\"Tecnologia1\" type=\"text\" name=\"Tecnologia1\" placeholder=\"Tecnologia1\" /></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("                 <tr>\r\n");
      out.write("                                <td><input id=\"Tecnologia2\" type=\"text\" name=\"Tecnologia2\" placeholder=\"Tecnologia2\" /></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("                 <tr>\r\n");
      out.write("                                <td><input id=\"Tecnologia3\" type=\"text\" name=\"Tecnologia3\" placeholder=\"Tecnologia3\" /></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("                            <td><input type=\"submit\" value=\"ajustar\" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"reset\" value=\"annuler\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
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
