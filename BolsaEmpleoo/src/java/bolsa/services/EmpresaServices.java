/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolsa.services;

import bolsa.model.Empresa;
import bolsa.model.EmpresaModel;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpresaServices extends HttpServlet {
	private static final String UserRecord = null;
	private static String INSERT = "/AjustarEmpresas.jsp";//variable qui indique l'URL
	private static String edit = "/ModificarEmpresas.jsp";
	private static String delete = "/SupprimerUtilisateur.jsp";
	private static String liste = "/ListaEmpresas.jsp";
	private EmpresaModel dao;//variable qui le type de userDao
		public EmpresaServices() {
			super();
			dao = new EmpresaModel();	
		}
		
		protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
			
			String redirect = "";
			
			String uId = request.getParameter("id");
                        
			
			String action = request.getParameter("action");
				
			if(  uId != null && action.equalsIgnoreCase("insert")){
				String ID = uId;
                                
			
				Empresa utilisateur = new Empresa();
			
				System.out.println("id : " + ID);
				System.out.println("Nombre : " + request.getParameter("Nombre"));
				System.out.println("Localizacion : " + request.getParameter("Localizacion"));
                                System.out.println("Correo : " + request.getParameter("Correo"));
                                System.out.println("Telefono : " + request.getParameter("Telefono"));
                                System.out.println("Descripcion : " + request.getParameter("Descripcion"));
                                
				utilisateur.setID(ID);
				utilisateur.setNombre(request.getParameter("Nombre"));
				utilisateur.setLocalizacion(request.getParameter("Localizacion"));
                                utilisateur.setCorreo(request.getParameter("Correo"));
                                utilisateur.setTelefono(request.getParameter("Telefono"));
                                utilisateur.setDescripcion(request.getParameter("Descripcion"));
                                
                                
			
			dao.addUser(utilisateur);
			  redirect = liste;
				request.setAttribute("utilisateurs",dao.getAllUsers());
				System.out.println("Empresa creada");
			}
                        
			else if(action.equalsIgnoreCase("delete")){
				String utilistaeurId = request.getParameter("ID");
				String uid = utilistaeurId;
				dao.removeUser(uid);
				redirect = liste;
				request.setAttribute("utilisateurs",dao.getAllUsers());
				System.out.println("Empresa Eliminada");
			}
			
			else if(action.equalsIgnoreCase("editForm")){
                                request.setAttribute("id", request.getParameter("ID"));
                                redirect = edit;
			}
			
			else if(action.equalsIgnoreCase("edit")){
				
				String utilisateurId = request.getParameter("id");
                                String utilisateurNombre = request.getParameter("Nombre");
                                String utilisateurLocalizacion = request.getParameter("Localizacion");
                                String utilisateurCorreo = request.getParameter("Correo");
                                String utilisateurTelefono = request.getParameter("Telefono");
                                String utilisateurDescripcion = request.getParameter("Descripcion");
                                
                                
				
				String uid = utilisateurId;
				
				Empresa utilisateur = new Empresa();
				
					utilisateur.setID(uid);
					utilisateur.setNombre(utilisateurNombre);
				utilisateur.setLocalizacion(utilisateurLocalizacion);
                                utilisateur.setCorreo(utilisateurCorreo);
                                utilisateur.setTelefono(utilisateurTelefono);
                                utilisateur.setDescripcion(utilisateurDescripcion);
				
					dao.editUser(utilisateur);
					request.setAttribute("utilisateur", utilisateur);
					redirect = liste;
					System.out.println("Emresa bien modificada");
			}
			
			else if(action.equalsIgnoreCase("ListUser")){
				
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
