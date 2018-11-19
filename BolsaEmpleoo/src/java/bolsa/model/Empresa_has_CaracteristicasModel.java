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
public class Empresa_has_CaracteristicasModel {
	
	private Connection conn;
	public Empresa_has_CaracteristicasModel(){
		
		conn = Connexion.getConnection();
        }
	public void addUser(Empresa_has_Caracteristicas utilisateur){
		try {
			
			String sql = "INSERT INTO Empresa_has_Caracteristicas(Caracteristicas_id,nivel,Puesto_id)" + "VALUES(?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, utilisateur.getCaracteristicas_id());
			ps.setString(2,utilisateur.getNivel());
                        ps.setString(3, utilisateur.getPuesto());
                        
			
                        ps.executeUpdate();
			
		} catch (SQLException e) {
                    System.out.println(" execption");
			e.printStackTrace();
		}
	}
	
	public void removeUser(String userId){
		try {
			
				String sql = "DELETE FROM Empresa_has_Caracteristicas WHERE Caracteristicas_id=?";
			
				PreparedStatement ps = conn.prepareStatement(sql);
			
				ps.setString(1, userId);
			
					ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void editUser(Empresa_has_Caracteristicas utilisateur){
		try {
		
			String sql = "UPDATE Empresa_has_Caracteristicas set nivel=? ,Puesto_id=? where Caracteristicas_id=?;";
		
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, utilisateur.getNivel());
				ps.setString(2, utilisateur.getPuesto());
                                ps.setString(3, utilisateur.getCaracteristicas_id());
                               
			
				ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List getAllUsers(){
		
		List liste_utilisateur = new ArrayList();
			try {
				
					String sql = "SELECT *from Empresa_has_Caracteristicas;";
				
					PreparedStatement ps = conn.prepareStatement(sql);
				
					ResultSet rs = ps.executeQuery();
				
					while(rs.next()){
				
						Empresa_has_Caracteristicas utilisateur = new Empresa_has_Caracteristicas();
						utilisateur.setCaracteristicas_id(rs.getString("Caracteristicas_id"));
						utilisateur.setNivel(rs.getString("nivel"));
						utilisateur.setPuesto(rs.getString("Puesto_id"));
                                               
                                                
						
						liste_utilisateur.add(utilisateur);
					}
					
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return liste_utilisateur;
	}
	
		public Empresa_has_Caracteristicas getUserById(String userId){
			
			Empresa_has_Caracteristicas utilisateur = new Empresa_has_Caracteristicas();
			try {
				String sql = "SELECT *from Empresa_has_Caracteristicas WHERE Caracteristicas_id=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, userId);
				ResultSet rs = ps.executeQuery();
					if(rs.next()){
						utilisateur.setCaracteristicas_id(rs.getString("Caracteristicas_id"));
						utilisateur.setNivel(rs.getString("nivel"));
						utilisateur.setPuesto(rs.getString("Puesto_id"));
                                                
					}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return utilisateur;
		}
}










