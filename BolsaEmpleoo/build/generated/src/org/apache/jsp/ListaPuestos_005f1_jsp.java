package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bolsa.model.Puesto;
import bolsa.model.Puesto;
import bolsa.model.PuestoModel;
import java.util.*;

public final class ListaPuestos_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     <script src=\"js/BuscadorTabla.js\"  type=\"text/javascript\"></script>\r\n");
      out.write("<title>Lista de Puestos Disponibles Inscritos en el Sistema</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("     <label>Buscar Puesto:</label>\r\n");
      out.write("     <input id=\"searchTerm\" type=\"text\" onkeyup=\"doSearch()\"/>\r\n");
      out.write("     <h1>Bienvenidos a la Bolsa de Empleo</h1>\r\n");
      out.write("     <h3>Ultimas oferta de Puestos en Empresas</h3>\r\n");
      out.write("     \r\n");
      out.write("     \r\n");

	PuestoModel dao = new PuestoModel();
	List<Puesto> userList = dao.getAllUsers();
	Iterator<Puesto> itr = userList.iterator();
        Puesto utilisateur = null;

      out.write("\r\n");
      out.write("<marquee scrolldelay=\"5\"><table id=\"datos\" class=\"table\">\r\n");
      out.write("    <caption>Lista de Puestos</caption>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>Cedula Juridica de la Empresa Oferente</th>\r\n");
      out.write("\t\t<th>Nombre del puesto</th>\r\n");
      out.write("\t\t<th>Salario Ofrecido</th>\r\n");
      out.write("                \r\n");
      out.write("                <th>id del Puesto</th>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t");
 //avec la boucle while
		//	while(itr.hasNext()){
		//		userBean user = new userBean();
		//		System.out.println(user.getID());
                //while(utilisateur.getTipo()=="Publico"){
		while(itr.hasNext()) {
                    utilisateur = itr.next();
		
      out.write("\r\n");
      out.write("\t\t\t<td>");
      out.print( utilisateur.getEmpresa_id()  );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( utilisateur.getNombrePuesto()  );
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( utilisateur.getSalario()  );
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( utilisateur.getID()  );
      out.write("</td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");

			}
//}
		
      out.write("\t\r\n");
      out.write("</table></marquee>\r\n");
      out.write("<div class=\"lien\">\r\n");
      out.write("    \r\n");
      out.write("    <p><a href=\"AjustarUsuarios_1.jsp\" >Desea Registrarse?</a></p>\r\n");
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
