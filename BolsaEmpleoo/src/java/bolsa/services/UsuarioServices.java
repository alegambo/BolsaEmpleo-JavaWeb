package bolsa.services;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bolsa.model.UsuarioModel;
import bolsa.model.Usuario;
import bolsa.model.Usuario;
import bolsa.model.UsuarioModel;
public class UsuarioServices extends HttpServlet {
	private static final String UserRecord = null;
	private static String INSERT = "/AjustarUsuarios.jsp";
	private static String edit = "/ModificarUsuarios.jsp";
	private static String delete = "/SupprimerUtilisateur.jsp";
	private static String liste = "/ListaUsuarios.jsp";
	private UsuarioModel dao;
		public UsuarioServices() {
			super();
			dao = new UsuarioModel();	
		}
	
		protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
			
			String redirect = "";
			
			String uId = request.getParameter("id");
                        String uPrenom = request.getParameter("prenom");
			
			String action = request.getParameter("action");
				
			if(  uId != null && action.equalsIgnoreCase("insert")){
				String ID = uId;
                                int PRENOM = Integer.parseInt(uPrenom);
			
				Usuario utilisateur = new Usuario();
			
				System.out.println("id : " + ID);
				System.out.println("nom : " + request.getParameter("nom"));
				System.out.println("prenom : " + request.getParameter("prenom"));
				utilisateur.setID(ID);
				utilisateur.setNom(request.getParameter("nom"));
				utilisateur.setPrenom(PRENOM);
			
			dao.addUser(utilisateur);
			  redirect = liste;
				request.setAttribute("utilisateurs",dao.getAllUsers());
				System.out.println("Usuario Creado");
			}
                        
			else if(action.equalsIgnoreCase("delete")){
				String utilistaeurId = request.getParameter("ID");
				String uid = utilistaeurId;
				dao.removeUser(uid);
				redirect = liste;
				request.setAttribute("utilisateurs",dao.getAllUsers());
				System.out.println("Usuario Eliminado");
			}
			
			else if(action.equalsIgnoreCase("editForm")){
                                request.setAttribute("id", request.getParameter("ID"));
                                redirect = edit;
			}
			
			else if(action.equalsIgnoreCase("edit")){
				
				String utilisateurId = request.getParameter("id");
                                String utilisateurPrenom = request.getParameter("prenom");
                                int uprenom= Integer.parseInt(utilisateurPrenom);
				
				String uid = utilisateurId;
				
				Usuario utilisateur = new Usuario();
				
					utilisateur.setID(uid);
					utilisateur.setNom(request.getParameter("nom"));
					utilisateur.setPrenom(uprenom); 
				
					dao.editUser(utilisateur);
					request.setAttribute("utilisateur", utilisateur);
					redirect = liste;
					System.out.println("usuario Modificado");
			}
			
			else if(action.equalsIgnoreCase("ListUser")){
				// redirect = UserRecord;
				request.setAttribute("utilisateurs", dao.getAllUsers());
			}else{
				redirect = INSERT;
			}
			
			RequestDispatcher rd = request.getRequestDispatcher(redirect);
							  rd.forward(request, response);
		}
		protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
			doGet(request,response);
		}
}


















































