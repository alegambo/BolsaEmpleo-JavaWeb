/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolsa.services;

import bolsa.model.Caracteristicas;
import bolsa.model.CaracteristicasModel;
import bolsa.model.Caracteristicas_has_Oferente;
import bolsa.model.Caracteristicas_has_OferenteModel;
import bolsa.model.Empresa;
import bolsa.model.EmpresaModel;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Caracteristica_has_OferenteServices extends HttpServlet {
	private static final String UserRecord = null;
	private static String INSERT = "/AjustarCaracteristicas_has_Oferente.jsp";//variable qui indique l'URL
	private static String edit = "/ModificarCaracteristicas_has_Oferente.jsp";
	private static String delete = "/SupprimerUtilisateur.jsp";
	private static String liste = "/ListaCaracteristicas_has_Oferente.jsp";
	private Caracteristicas_has_OferenteModel dao;//variable qui le type de userDao
		public Caracteristica_has_OferenteServices() {
			super();
			dao = new Caracteristicas_has_OferenteModel();	
		}
		
		protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
			
			String redirect = "";
			
			String uId = request.getParameter("Caracteristicas_id");
                        
                        
			
			String action = request.getParameter("action");
				
			if(  uId != null && action.equalsIgnoreCase("insert")){
				String ID = uId;
                                
			
				Caracteristicas_has_Oferente utilisateur = new Caracteristicas_has_Oferente();
			
				
                                
				utilisateur.setCaracteristicas_id(ID);
				utilisateur.setOferente_id(request.getParameter("Oferente_id"));
				utilisateur.setNivel(request.getParameter("nivel"));
                               
                                
			
			dao.addUser(utilisateur);
			  redirect = liste;
				request.setAttribute("utilisateurs",dao.getAllUsers());
				System.out.println("Caracteristicas creada");
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
                                request.setAttribute("Caracteristicas_id", request.getParameter("ID"));
                                redirect = edit;
			}
			
			else if(action.equalsIgnoreCase("edit")){
				
				String utilisateurId = request.getParameter("Caracteristicas_id");
                                String utilisateurOferente_id = request.getParameter("Oferente_id");
                                String utilisateurNivel = request.getParameter("nivel");
                                
                                
                                
                                
				
				String uid = utilisateurId;
				
				Caracteristicas_has_Oferente utilisateur = new Caracteristicas_has_Oferente();
				
					utilisateur.setCaracteristicas_id(uid);
					utilisateur.setOferente_id(utilisateurOferente_id);
				utilisateur.setNivel(utilisateurNivel);
                                
                                
                                
				
					dao.editUser(utilisateur);
					request.setAttribute("utilisateur", utilisateur);
					redirect = liste;
					System.out.println("caracteristica bien modificada");
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
