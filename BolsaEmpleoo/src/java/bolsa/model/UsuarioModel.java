package bolsa.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bolsa.database.Connexion;;
public class UsuarioModel {
	
	private Connection conn;
	public UsuarioModel(){
		
		conn = Connexion.getConnection();
	}
	
	public void addUser(Usuario utilisateur){
		try {
			
			String sql = "INSERT INTO Usuario(id,clave,tipo)" + "VALUES(?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, utilisateur.getID());
			ps.setString(2,utilisateur.getNom());
                        ps.setInt(3, utilisateur.getPrenom());
			
                        ps.executeUpdate();
			
		} catch (SQLException e) {
                    System.out.println(" inserer execption");
			e.printStackTrace();
		}
	}
	
	public void removeUser(String userId){
		try {
			
				String sql = "DELETE FROM Usuario WHERE id=?";
			
				PreparedStatement ps = conn.prepareStatement(sql);
			
				ps.setString(1, userId);
			
					ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void editUser(Usuario utilisateur){
		try {
		
			String sql = "UPDATE Usuario set clave=? ,tipo=? where id=?;";
		
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, utilisateur.getNom());
				ps.setInt(2, utilisateur.getPrenom());
				ps.setString(3, utilisateur.getID());
			
				ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List getAllUsers(){
		
		List liste_utilisateur = new ArrayList();
			try {
				
					String sql = "SELECT *from Usuario;";
				
					PreparedStatement ps = conn.prepareStatement(sql);
				
					ResultSet rs = ps.executeQuery();
				
					while(rs.next()){
			
						Usuario utilisateur = new Usuario();
						utilisateur.setID(rs.getString("id"));
						utilisateur.setNom(rs.getString("clave"));
						utilisateur.setPrenom(rs.getInt("tipo"));
						/* on met cette instance dans la liste */
						liste_utilisateur.add(utilisateur);
					}
					
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return liste_utilisateur;
	}
	
		public Usuario getUserById(String userId){
			
			Usuario utilisateur = new Usuario();
			try {
				String sql = "SELECT *from Usuario WHERE id=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, userId);
				ResultSet rs = ps.executeQuery();
					if(rs.next()){
						utilisateur.setID(rs.getString("id"));
						utilisateur.setNom(rs.getString("clave"));
						utilisateur.setPrenom(rs.getInt("tipo"));
					}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return utilisateur;
		}
}










