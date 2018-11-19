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
public class CaracteristicasModel {
	
	private Connection conn;
	public CaracteristicasModel(){
		
		conn = Connexion.getConnection();
        }
	public void addUser(Caracteristicas utilisateur){
		try {
			
			String sql = "INSERT INTO Caracteristicas(id,Nombre,Nivel,Lenguaje1,lenguaje2,Lenguaje3,Tecnologia1,Tecnologia2,Tecnologia3)" + "VALUES(?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, utilisateur.getID());
			ps.setString(2,utilisateur.getNombre());
                        ps.setString(3, utilisateur.getNivel());
                        ps.setString(4, utilisateur.getLenguaje1());
                        ps.setString(5, utilisateur.getLenguaje2());
                        ps.setString(6, utilisateur.getLenguaje3());
                         ps.setString(7, utilisateur.getTecnologia1());
                         ps.setString(8, utilisateur.getTecnologia2());
                          ps.setString(9, utilisateur.getTecnologia3());
			
                        ps.executeUpdate();
			
		} catch (SQLException e) {
                    System.out.println(" execption");
			e.printStackTrace();
		}
	}
	
	public void removeUser(String userId){
		try {
			
				String sql = "DELETE FROM Caracteristicas WHERE id=?";
			
				PreparedStatement ps = conn.prepareStatement(sql);
			
				ps.setString(1, userId);
			
					ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void editUser(Caracteristicas utilisateur){
		try {
		
			String sql = "UPDATE Caracteristicas set Nombre=? ,Nivel=? ,Lenguaje1=? ,lenguaje2=? ,Lenguaje3=? ,Tecnologia1=? ,Tecnologia2=? ,Tecnologia3=?  where id=?;";
		
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, utilisateur.getNombre());
				ps.setString(2, utilisateur.getNivel());
                                ps.setString(3, utilisateur.getLenguaje1());
                                ps.setString(4, utilisateur.getLenguaje2());
                                ps.setString(5, utilisateur.getLenguaje3());
                                ps.setString(6, utilisateur.getTecnologia1());
                                ps.setString(7, utilisateur.getTecnologia2());
                                ps.setString(8, utilisateur.getTecnologia3());
                                ps.setString(9, utilisateur.getID());
			
				ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List getAllUsers(){
		
		List liste_utilisateur = new ArrayList();
			try {
				
					String sql = "SELECT *from Caracteristicas;";
				
					PreparedStatement ps = conn.prepareStatement(sql);
				
					ResultSet rs = ps.executeQuery();
				
					while(rs.next()){
				
						Caracteristicas utilisateur = new Caracteristicas();
						utilisateur.setID(rs.getString("id"));
						utilisateur.setNombre(rs.getString("Nombre"));
						utilisateur.setNivel(rs.getString("Nivel"));
                                                utilisateur.setLenguaje1(rs.getString("Lenguaje1"));
                                                utilisateur.setLenguaje2(rs.getString("Lenguaje2"));
                                                utilisateur.setLenguaje3(rs.getString("Lenguaje3"));
                                                utilisateur.setTecnologia1(rs.getString("Tecnologia1"));
                                                utilisateur.setTecnologia2(rs.getString("Tecnologia2"));
                                                utilisateur.setTecnologia3(rs.getString("Tecnologia3"));
                                                
						
						liste_utilisateur.add(utilisateur);
					}
					
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return liste_utilisateur;
	}
	
		public Caracteristicas getUserById(String userId){
			
			Caracteristicas utilisateur = new Caracteristicas();
			try {
				String sql = "SELECT *from Caracteristicas WHERE id=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, userId);
				ResultSet rs = ps.executeQuery();
					if(rs.next()){
						utilisateur.setID(rs.getString("id"));
						utilisateur.setNombre(rs.getString("Nombre"));
						utilisateur.setNivel(rs.getString("Nivel"));
                                                utilisateur.setLenguaje1(rs.getString("Lenguaje1"));
                                                utilisateur.setLenguaje2(rs.getString("Lenguaje2"));
                                                utilisateur.setLenguaje3(rs.getString("Lenguaje3"));
                                                utilisateur.setTecnologia1(rs.getString("Tecnologia1"));
                                                utilisateur.setTecnologia2(rs.getString("Tecnologia2"));
                                                utilisateur.setTecnologia3(rs.getString("Tecnologia3"));
					}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return utilisateur;
		}
}










