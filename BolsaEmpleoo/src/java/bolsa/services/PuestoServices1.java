/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolsa.services;

import bolsa.model.Empresa;
import bolsa.model.EmpresaModel;
import bolsa.model.Puesto;
import bolsa.model.PuestoModel;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PuestoServices1 extends HttpServlet {
	private static final String UserRecord = null;
	private static String INSERT = "/AjustarPuestos.jsp";//variable qui indique l'URL
	private static String edit = "/ModificarPuestos.jsp";
	private static String delete = "/SupprimerUtilisateur.jsp";
	private static String liste = "/AjustarCaracteristicas_1.jsp";
	private PuestoModel dao;
		public PuestoServices1() {
			super();
			dao = new PuestoModel();	
		}
		
		protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
			
			String redirect = "";
			
			String uId = request.getParameter("id");
                        
			
			String action = request.getParameter("action");
				
			
			if(  uId != null && action.equalsIgnoreCase("insert")){
				String ID = uId;
                                
			
				Puesto utilisateur = new Puesto();
			
				System.out.println("id : " + ID);
				System.out.println("Nombre Puesto : " + request.getParameter("NombrePuesto"));
				System.out.println("Salario : " + request.getParameter("Salario"));
                                System.out.println("Tipo : " + request.getParameter("Tipo"));
                                System.out.println("id de la Empresa : " + request.getParameter("Empresa_id"));
                                
                                
				utilisateur.setID(ID);
				utilisateur.setNombrePuesto(request.getParameter("NombrePuesto"));
				utilisateur.setSalario(request.getParameter("Salario"));
                                utilisateur.setTipo(request.getParameter("Tipo"));
                                utilisateur.setEmpresa_id(request.getParameter("Empresa_id"));
                                
                                
                                
			
			dao.addUser(utilisateur);
			  redirect = liste;
				request.setAttribute("utilisateurs",dao.getAllUsers());
				System.out.println("Puesto Creado");
			}
                        
			else if(action.equalsIgnoreCase("delete")){
				String utilistaeurId = request.getParameter("ID");
				String uid = utilistaeurId;
				dao.removeUser(uid);
				redirect = liste;
				request.setAttribute("utilisateurs",dao.getAllUsers());
				System.out.println("Puesto Eliminado");
			}
			
			else if(action.equalsIgnoreCase("editForm")){
                                request.setAttribute("id", request.getParameter("ID"));
                                redirect = edit;
			}
			
			else if(action.equalsIgnoreCase("edit")){
				
				String utilisateurId = request.getParameter("id");
                                String utilisateurNombrePuesto = request.getParameter("NombrePuesto");
                                String utilisateurSalario = request.getParameter("Salario");
                                String utilisateurTipo = request.getParameter("Tipo");
                                String utilisateurEmpresa_id = request.getParameter("Empresa_id");
                                
                                
                
				String uid = utilisateurId;
				
				Puesto utilisateur = new Puesto();
				
					utilisateur.setID(uid);
					utilisateur.setNombrePuesto(utilisateurNombrePuesto);
				utilisateur.setSalario(utilisateurSalario);
                                utilisateur.setTipo(utilisateurTipo);
                                utilisateur.setEmpresa_id(utilisateurEmpresa_id);
                                
				
					dao.editUser(utilisateur);
					request.setAttribute("utilisateur", utilisateur);
					redirect = liste;
					System.out.println("Puesto Modificado");
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
