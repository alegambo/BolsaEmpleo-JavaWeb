package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.String;
import bolsa.model.Usuario;
import bolsa.model.UsuarioModel;
import java.util.*;

public final class ListaUsuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Lista de Usuarios del Sistema</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	UsuarioModel dao = new UsuarioModel();
	List<Usuario> userList = dao.getAllUsers();
	Iterator<Usuario> itr = userList.iterator();
        Usuario utilisateur = null;

      out.write("\r\n");
      out.write("<table class=\"table\">\r\n");
      out.write("    <caption>Lista de Usuarios</caption>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>Id</th>\r\n");
      out.write("\t\t<th>Clave</th>\r\n");
      out.write("\t\t<th>Tipo</th>\r\n");
      out.write("\t\t<th>Modificar</th>\r\n");
      out.write("\t\t<th>Eliminar</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t");
 //avec la boucle while
		//	while(itr.hasNext()){
		//		userBean user = new userBean();
		//		System.out.println(user.getID());
		while(itr.hasNext()) {
                    utilisateur = itr.next();
		
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                %>\r\n");
      out.write("\t\t\t<td>");
      out.print( utilisateur.getID()  );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( utilisateur.getNom()  );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( utilisateur.esTipo()  );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("                            <form method=\"POST\" action=\"UsuarioServices\">\r\n");
      out.write("                                <button class=\"edit\"></button>\r\n");
      out.write("                                <input type=\"hidden\" name=\"action\" value=\"editForm\" >\r\n");
      out.write("                                <input type=\"hidden\" name=\"ID\" value=\"");
      out.print( utilisateur.getID() );
      out.write("\" >\r\n");
      out.write("                            </form>\r\n");
      out.write("                            \r\n");
      out.write("                        </td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("                            <form method=\"POST\" action=\"UsuarioServices\">\r\n");
      out.write("                                <button class=\"effacer\" onclick=\"if(!confirm('Êsta seguro que desea eliminar un usuario?')) return false;\"></button>\r\n");
      out.write("                                <input type=\"hidden\" name=\"action\" value=\"delete\" >\r\n");
      out.write("                                <input type=\"hidden\" name=\"ID\" value=\"");
      out.print( utilisateur.getID() );
      out.write("\" >\r\n");
      out.write("                            </form>\r\n");
      out.write("                            \r\n");
      out.write("                        </td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");

			}
		
      out.write("\t\r\n");
      out.write("</table>\r\n");
      out.write("<div class=\"lien\">\r\n");
      out.write("    \r\n");
      out.write("    <p><a href=\"UsuarioServices?action=insert\" >Agregar Usuario Nuevo</a></p>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
