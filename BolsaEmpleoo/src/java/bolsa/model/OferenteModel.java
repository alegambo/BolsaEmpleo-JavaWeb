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
public class OferenteModel {
	
	private Connection conn;
	public OferenteModel(){
		
		conn = Connexion.getConnection();
	}
	
	public void addUser(Oferente utilisateur){
		try {
			
			String sql = "INSERT INTO Oferente(id,Nombre,Apellido,Nacionalidad,Telefono,Direccion,Correo)" + "VALUES(?,?,?,?,?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, utilisateur.getID());
			ps.setString(2, utilisateur.getNombre());
                        ps.setString(3, utilisateur.getApellido());
                        ps.setString(4, utilisateur.getNacionalidad());
                        ps.setString(5, utilisateur.getTelefono());
                        ps.setString(6, utilisateur.getDireccion());
                        ps.setString(7, utilisateur.getCorreo());
                        
			
                        ps.executeUpdate();
			
		} catch (SQLException e) {
                    System.out.println(" inserer execption");
			e.printStackTrace();
		}
	}
	
	public void removeUser(String userId){
		try {
			
				String sql = "DELETE FROM Oferente WHERE id=?";
			
				PreparedStatement ps = conn.prepareStatement(sql);
			
				ps.setString(1, userId);
			
					ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void editUser(Oferente utilisateur){
		try {
		
			String sql = "UPDATE Oferente set Nombre=? ,Apellido=? ,Nacionalidad=? ,Telefono=? ,Direccion=? ,Correo=?  where id=?;";
		
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, utilisateur.getNombre());
				ps.setString(2, utilisateur.getApellido());
                                ps.setString(3, utilisateur.getNacionalidad());
                                ps.setString(4, utilisateur.getTelefono());
                                ps.setString(5, utilisateur.getDireccion());
                                ps.setString(6, utilisateur.getCorreo());
				ps.setString(7, utilisateur.getID());
			
				ps.executeUpdate();
			//g�rer les exceptions
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public List getAllUsers(){
		
		List liste_utilisateur = new ArrayList();
			try {
				
					String sql = "SELECT *from Oferente;";
				
					PreparedStatement ps = conn.prepareStatement(sql);
				
					ResultSet rs = ps.executeQuery();
				
					while(rs.next()){
				
						Oferente utilisateur = new Oferente();
						utilisateur.setID(rs.getString("id"));
						utilisateur.setNombre(rs.getString("Nombre"));
						utilisateur.setApellido(rs.getString("Apellido"));
                                                utilisateur.setNacionalidad(rs.getString("Nacionalidad"));
                                                utilisateur.setTelefono(rs.getString("Telefono"));
                                                utilisateur.setDireccion(rs.getString("Direccion"));
                                                utilisateur.setCorreo(rs.getString("Correo"));
						/* on met cette instance dans la liste */
						liste_utilisateur.add(utilisateur);
					}
					
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return liste_utilisateur;
	}
	
		public Oferente getUserById(String userId){
			
			Oferente utilisateur = new Oferente();
			try {
				String sql = "SELECT *from Oferente WHERE id=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, userId);
				ResultSet rs = ps.executeQuery();
					if(rs.next()){
						utilisateur.setID(rs.getString("id"));
						utilisateur.setNombre(rs.getString("Nombre"));
						utilisateur.setApellido(rs.getString("Apellido"));
                                                utilisateur.setNacionalidad(rs.getString("Nacionalidad"));
                                                utilisateur.setTelefono(rs.getString("Telefono"));
                                                utilisateur.setDireccion(rs.getString("Direccion"));
                                                utilisateur.setCorreo(rs.getString("Correo"));
					}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return utilisateur;
		}
}










