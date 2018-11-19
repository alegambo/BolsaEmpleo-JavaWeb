/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolsa.model;

/**
 *
 * @author Anayansi
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bolsa.database.Connexion;;
public class EmpresaModel {
	
	private Connection conn;
	public EmpresaModel(){
		
		conn = Connexion.getConnection();
        }
	public void addUser(Empresa utilisateur){
		try {
			
			String sql = "INSERT INTO Empresa(id,Nombre,Localizacion,Correo,Telefono,Descripcion)" + "VALUES(?,?,?,?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, utilisateur.getID());
			ps.setString(2,utilisateur.getNombre());
                        ps.setString(3, utilisateur.getLocalizacion());
                        ps.setString(4, utilisateur.getCorreo());
                        ps.setString(5, utilisateur.getTelefono());
                        ps.setString(6, utilisateur.getDescripcion());
                        
			
                        ps.executeUpdate();
			
		} catch (SQLException e) {
                    System.out.println(" execption");
			e.printStackTrace();
		}
	}
	
	public void removeUser(String userId){
		try {
			
				String sql = "DELETE FROM Empresa WHERE id=?";
			
				PreparedStatement ps = conn.prepareStatement(sql);
			
				ps.setString(1, userId);
			
					ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void editUser(Empresa utilisateur){
		try {
		
			String sql = "UPDATE Empresa set Nombre=? ,Localizacion=? ,Correo=? ,Telefono=? ,Descripcion=?  where id=?;";
		
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, utilisateur.getNombre());
				ps.setString(2, utilisateur.getLocalizacion());
                                ps.setString(3, utilisateur.getCorreo());
                                ps.setString(4, utilisateur.getTelefono());
                                ps.setString(5, utilisateur.getDescripcion());
                                ps.setString(6, utilisateur.getID());
			
				ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List getAllUsers(){
		
		List liste_utilisateur = new ArrayList();
			try {
				
					String sql = "SELECT *from Empresa;";
				
					PreparedStatement ps = conn.prepareStatement(sql);
				
					ResultSet rs = ps.executeQuery();
				
					while(rs.next()){
				
						Empresa utilisateur = new Empresa();
						utilisateur.setID(rs.getString("id"));
						utilisateur.setNombre(rs.getString("Nombre"));
						utilisateur.setLocalizacion(rs.getString("Localizacion"));
                                                utilisateur.setCorreo(rs.getString("Correo"));
                                                utilisateur.setTelefono(rs.getString("Telefono"));
                                                utilisateur.setDescripcion(rs.getString("Descripcion"));
						
						liste_utilisateur.add(utilisateur);
					}
					
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return liste_utilisateur;
	}
	
		public Empresa getUserById(String userId){
			
			Empresa utilisateur = new Empresa();
			try {
				String sql = "SELECT *from Empresa WHERE id=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, userId);
				ResultSet rs = ps.executeQuery();
					if(rs.next()){
						utilisateur.setID(rs.getString("id"));
						utilisateur.setNombre(rs.getString("Nombre"));
						utilisateur.setLocalizacion(rs.getString("Localizacion"));
                                                utilisateur.setCorreo(rs.getString("Correo"));
                                                utilisateur.setTelefono(rs.getString("Telefono"));
                                                utilisateur.setDescripcion(rs.getString("Descripcion"));
					}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return utilisateur;
		}
}










