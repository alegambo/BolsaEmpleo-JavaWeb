package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bolsa.model.Empresa;
import bolsa.model.EmpresaModel;
import bolsa.model.OferenteModel;
import bolsa.model.Oferente;

public final class ModificarEmpresas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Modificar datos de Empresa</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            EmpresaModel dao = new EmpresaModel();
            String ida = (String)request.getAttribute("id");
            Empresa utilisateur = (Empresa)dao.getUserById(ida);
        
      out.write("\n");
      out.write("\t<form method=\"POST\" action=\"EmpresaServices\" name=\"ajouter\">\n");
      out.write("\t\t<input type=\"hidden\" name=\"action\" value=\"edit\" /> \n");
      out.write("\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print( utilisateur.getID() );
      out.write("\" /> \n");
      out.write("                <table class=\"tableModifier\">\n");
      out.write("                        <caption>Modificar Empresa</caption>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td class=\"l\">Id : </td>\n");
      out.write("                                <td class=\"r\"><input type=\"text\" name=\"\" disabled value=\"");
      out.print( utilisateur.getID() );
      out.write("\"/></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td class=\"l\">Nombre : </td>\n");
      out.write("                                <td class=\"r\"><input type=\"text\" name=\"Nombre\" value=\"");
      out.print( utilisateur.getNombre() );
      out.write("\"/></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td class=\"l\">Localizacion : </td>\n");
      out.write("\t\t\t\t<td class=\"r\"><input type=\"text\" name=\"Localizacion\" value=\"");
      out.print( utilisateur.getLocalizacion() );
      out.write("\"/></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("                        <tr>\n");
      out.write("\t\t\t\t<td class=\"l\">Correo : </td>\n");
      out.write("\t\t\t\t<td class=\"r\"><input type=\"text\" name=\"Correo\" value=\"");
      out.print( utilisateur.getCorreo() );
      out.write("\"/></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("                        <tr>\n");
      out.write("\t\t\t\t<td class=\"l\">Telefono : </td>\n");
      out.write("\t\t\t\t<td class=\"r\"><input type=\"text\" name=\"Telefono\" value=\"");
      out.print( utilisateur.getTelefono() );
      out.write("\"/></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("                         <tr>\n");
      out.write("\t\t\t\t<td class=\"l\">Descripcion : </td>\n");
      out.write("\t\t\t\t<td class=\"r\"><input type=\"text\" name=\"Descripcion\" value=\"");
      out.print( utilisateur.getDescripcion() );
      out.write("\"/></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("                        \n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td class=\"l\"><input type=\"submit\" value=\"edit\" /></td>\n");
      out.write("\t\t\t\t<td class=\"r\"><input type=\"reset\" value=\"annuler\" /></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t</form>\n");
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
