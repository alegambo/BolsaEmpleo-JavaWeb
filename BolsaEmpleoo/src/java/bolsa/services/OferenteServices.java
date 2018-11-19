/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolsa.services;

import bolsa.model.Oferente;
import bolsa.model.OferenteModel;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OferenteServices extends HttpServlet {
	private static final String UserRecord = null;
	private static String INSERT = "/AjustarOferentes.jsp";//variable qui indique l'URL
	private static String edit = "/ModificarOferentes.jsp";
	private static String delete = "/SupprimerUtilisateur.jsp";
	private static String liste = "/ListaOferentes.jsp";
	private OferenteModel dao;
		public OferenteServices() {
			super();
			dao = new OferenteModel();	
		}
		
		protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
			
			String redirect = "";
			
			String uId = request.getParameter("id");
                        
			
			String action = request.getParameter("action");
				
			if(  uId != null && action.equalsIgnoreCase("insert")){
				String ID = uId;
                                
			
				Oferente utilisateur = new Oferente();
			
				System.out.println("id : " + ID);
				System.out.println("Nombre : " + request.getParameter("Nombre"));
				System.out.println("Apellido : " + request.getParameter("Apellido"));
                                System.out.println("Nacionalidad : " + request.getParameter("Nacionalidad"));
                                System.out.println("Telefono : " + request.getParameter("Telefono"));
                                System.out.println("Direccion : " + request.getParameter("Direccion"));
                                System.out.println("Correo : " + request.getParameter("Correo"));
				utilisateur.setID(ID);
				utilisateur.setNombre(request.getParameter("Nombre"));
				utilisateur.setApellido(request.getParameter("Apellido"));
                                utilisateur.setNacionalidad(request.getParameter("Nacionalidad"));
                                utilisateur.setTelefono(request.getParameter("Telefono"));
                                utilisateur.setDireccion(request.getParameter("Direccion"));
                                utilisateur.setCorreo(request.getParameter("Correo"));
                                
			
			dao.addUser(utilisateur);
			  redirect = liste;
				request.setAttribute("utilisateurs",dao.getAllUsers());
				System.out.println("Oferente creado");
			}
                        
			else if(action.equalsIgnoreCase("delete")){
				String utilistaeurId = request.getParameter("ID");
				String uid = utilistaeurId;
				dao.removeUser(uid);
				redirect = liste;
				request.setAttribute("utilisateurs",dao.getAllUsers());
				System.out.println("Oferente eliminado");
			}
			
			else if(action.equalsIgnoreCase("editForm")){
                                request.setAttribute("id", request.getParameter("ID"));
                                redirect = edit;
			}
			
			else if(action.equalsIgnoreCase("edit")){
				
				String utilisateurId = request.getParameter("id");
                                String utilisateurNombre = request.getParameter("Nombre");
                                String utilisateurApellido = request.getParameter("Apellido");
                                String utilisateurNacionalidad = request.getParameter("Nacionalidad");
                                String utilisateurTelefono = request.getParameter("Telefono");
                                String utilisateurDireccion = request.getParameter("Direccion");
                                String utilisateurCorreo = request.getParameter("Correo");
                                
				
				String uid = utilisateurId;
				
				Oferente utilisateur = new Oferente();
				
					utilisateur.setID(uid);
					utilisateur.setNombre(utilisateurNombre);
					utilisateur.setApellido(utilisateurApellido);
                                        utilisateur.setNacionalidad(utilisateurNacionalidad);
                                        utilisateur.setTelefono(utilisateurTelefono);
                                        utilisateur.setDireccion(utilisateurDireccion);
                                        utilisateur.setCorreo(utilisateurCorreo); 
				
					dao.editUser(utilisateur);
					request.setAttribute("utilisateur", utilisateur);
					redirect = liste;
					System.out.println("Oferente modificado");
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
