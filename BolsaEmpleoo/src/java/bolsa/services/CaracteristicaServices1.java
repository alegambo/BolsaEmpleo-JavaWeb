/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolsa.services;

import bolsa.model.Caracteristicas;
import bolsa.model.CaracteristicasModel;
import bolsa.model.Empresa;
import bolsa.model.EmpresaModel;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CaracteristicaServices1 extends HttpServlet {
	private static final String UserRecord = null;
	private static String INSERT = "/AjustarCaracteristicas.jsp";//variable qui indique l'URL
	private static String edit = "/ModificarCaracteristicas.jsp";
	private static String delete = "/SupprimerUtilisateur.jsp";
	private static String liste = "/Desea_1.jsp";
	private CaracteristicasModel dao;//variable qui le type de userDao
		public CaracteristicaServices1() {
			super();
			dao = new CaracteristicasModel();	
		}
		
		protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
			
			String redirect = "";
			
			String uId = request.getParameter("id");
                        
                        
			
			String action = request.getParameter("action");
				
			if(  uId != null && action.equalsIgnoreCase("insert")){
				String ID = uId;
                                
			
				Caracteristicas utilisateur = new Caracteristicas();
			
				
                                
				utilisateur.setID(ID);
				utilisateur.setNombre(request.getParameter("Nombre"));
				utilisateur.setNivel(request.getParameter("Nivel"));
                                utilisateur.setLenguaje1(request.getParameter("Lenguaje1"));
                                utilisateur.setLenguaje2(request.getParameter("Lenguaje2"));
                                utilisateur.setLenguaje3(request.getParameter("Lenguaje3"));
                                 utilisateur.setTecnologia1(request.getParameter("Tecnologia1"));
                                utilisateur.setTecnologia2(request.getParameter("Tecnologia2"));
                                utilisateur.setTecnologia3(request.getParameter("Tecnologia3"));
                                
			
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
                                request.setAttribute("id", request.getParameter("ID"));
                                redirect = edit;
			}
			
			else if(action.equalsIgnoreCase("edit")){
				
				String utilisateurId = request.getParameter("id");
                                String utilisateurNombre = request.getParameter("Nombre");
                                String utilisateurNivel = request.getParameter("Nivel");
                                String utilisateurLenguaje1 = request.getParameter("Lenguaje1");
                                String utilisateurLenguaje2 = request.getParameter("Lenguaje2");
                                String utilisateurLenguaje3 = request.getParameter("Lenguaje3");
                                String utilisateurTecnologia1 = request.getParameter("Tecnologia1");
                                String utilisateurTecnologia2 = request.getParameter("Tecnologia2");
                                String utilisateurTecnologia3 = request.getParameter("Tecnologia3");
                                
                                
                                
				
				String uid = utilisateurId;
				
				Caracteristicas utilisateur = new Caracteristicas();
				
					utilisateur.setID(uid);
					utilisateur.setNombre(utilisateurNombre);
				utilisateur.setNivel(utilisateurNivel);
                                utilisateur.setLenguaje1(utilisateurLenguaje1);
                                utilisateur.setLenguaje2(utilisateurLenguaje2);
                                utilisateur.setLenguaje3(utilisateurLenguaje3);
                                utilisateur.setTecnologia1(utilisateurTecnologia1);
                                utilisateur.setTecnologia2(utilisateurTecnologia2);
                                utilisateur.setTecnologia3(utilisateurTecnologia3);
                                
                                
				
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
