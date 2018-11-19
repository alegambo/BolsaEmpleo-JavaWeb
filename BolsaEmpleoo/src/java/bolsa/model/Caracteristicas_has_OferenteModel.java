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
public class Caracteristicas_has_OferenteModel {
	
	private Connection conn;
	public Caracteristicas_has_OferenteModel(){
		
		conn = Connexion.getConnection();
        }
	public void addUser(Caracteristicas_has_Oferente utilisateur){
		try {
			
			String sql = "INSERT INTO Caracteristicas_has_Oferente(Caracteristicas_id,Oferente_id,nivel)" + "VALUES(?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, utilisateur.getCaracteristicas_id());
			ps.setString(2,utilisateur.getOferente_id());
                        ps.setString(3, utilisateur.getNivel());
                        
			
                        ps.executeUpdate();
			
		} catch (SQLException e) {
                    System.out.println(" execption");
			e.printStackTrace();
		}
	}
	
	public void removeUser(String userId){
		try {
			
				String sql = "DELETE FROM Caracteristicas_has_Oferente WHERE Caracteristicas_id=?";
			
				PreparedStatement ps = conn.prepareStatement(sql);
			
				ps.setString(1, userId);
			
					ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void editUser(Caracteristicas_has_Oferente utilisateur){
		try {
		
			String sql = "UPDATE Caracteristicas_has_Oferente set Oferente_id=? ,nivel=? where Caracteristicas_id=?;";
		
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, utilisateur.getOferente_id());
				ps.setString(2, utilisateur.getNivel());
                                ps.setString(3, utilisateur.getCaracteristicas_id());
                               
			
				ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List getAllUsers(){
		
		List liste_utilisateur = new ArrayList();
			try {
				
					String sql = "SELECT *from Caracteristicas_has_Oferente;";
				
					PreparedStatement ps = conn.prepareStatement(sql);
				
					ResultSet rs = ps.executeQuery();
				
					while(rs.next()){
				
						Caracteristicas_has_Oferente utilisateur = new Caracteristicas_has_Oferente();
						utilisateur.setCaracteristicas_id(rs.getString("Caracteristicas_id"));
						utilisateur.setOferente_id(rs.getString("Oferente_id"));
						utilisateur.setNivel(rs.getString("nivel"));
                                               
                                                
						
						liste_utilisateur.add(utilisateur);
					}
					
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return liste_utilisateur;
	}
	
		public Caracteristicas_has_Oferente getUserById(String userId){
			
			Caracteristicas_has_Oferente utilisateur = new Caracteristicas_has_Oferente();
			try {
				String sql = "SELECT *from Caracteristicas_has_Oferente WHERE Caracteristicas_id=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, userId);
				ResultSet rs = ps.executeQuery();
					if(rs.next()){
						utilisateur.setCaracteristicas_id(rs.getString("Caracteristicas_id"));
						utilisateur.setOferente_id(rs.getString("Oferente_id"));
						utilisateur.setNivel(rs.getString("nivel"));
                                                
					}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return utilisateur;
		}
}










