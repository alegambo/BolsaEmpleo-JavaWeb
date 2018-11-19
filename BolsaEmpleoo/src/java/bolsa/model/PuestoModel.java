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

import bolsa.database.Connexion;

;

public class PuestoModel {
    //Cr�er une variable de connexion

    private Connection conn;

    public PuestoModel() {
        // ouvrir une connexion
        conn = Connexion.getConnection();
    }
    //D�finit la m�thode addUser qui permet d'ajouter un nouveau utilisateur
    //elle admet en argumen un variavle de type userBean ,
    //La classe qui repr�sente tout les utilisateurs

    public void addUser(Puesto utilisateur) {
        try {
          
            String sql = "INSERT INTO Puesto(id,NombrePuesto,Salario,Tipo,Empresa_id)" + "VALUES(?,?,?,?,?)";
            
            PreparedStatement ps = conn.prepareStatement(sql);
          
            ps.setString(1, utilisateur.getID());
            ps.setString(2, utilisateur.getNombrePuesto());
            ps.setString(3, utilisateur.getSalario());
            ps.setString(4, utilisateur.getTipo());
            ps.setString(5, utilisateur.getEmpresa_id());

            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(" inserer execption");
            e.printStackTrace();
        }
    }

    
    public void removeUser(String userId) {
        try {
            
            String sql = "DELETE FROM Puesto WHERE id=?";
           
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, userId);
          
            ps.executeUpdate();
          
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   

    public void editUser(Puesto utilisateur) {
        try {
           
            String sql = "UPDATE Puesto set NombrePuesto=? ,Salario=? ,Tipo=? ,Empresa_id=?  where id=?;";
           
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, utilisateur.getNombrePuesto());
            ps.setString(2, utilisateur.getSalario());
            ps.setString(3, utilisateur.getTipo());
            ps.setString(4, utilisateur.getEmpresa_id());
            ps.setString(6, utilisateur.getID());
            
            ps.executeUpdate();
    
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   
    public List getAllUsers() {
       
        List liste_utilisateur = new ArrayList();
        try {
           
            String sql = "SELECT *from Puesto;";
           
            PreparedStatement ps = conn.prepareStatement(sql);
         
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
              
                Puesto utilisateur = new Puesto();
                utilisateur.setID(rs.getString("id"));
                utilisateur.setNombrePuesto(rs.getString("NombrePuesto"));
                utilisateur.setSalario(rs.getString("Salario"));
                utilisateur.setTipo(rs.getString("Tipo"));
                utilisateur.setEmpresa_id(rs.getString("Empresa_id"));

             
                liste_utilisateur.add(utilisateur);
            }
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return liste_utilisateur;
    }
   

    public Puesto getUserById(String userId) {
        
        Puesto utilisateur = new Puesto();
        try {
            String sql = "SELECT *from Puesto WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, userId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                utilisateur.setID(rs.getString("id"));
                utilisateur.setNombrePuesto(rs.getString("NombrePuesto"));
                utilisateur.setSalario(rs.getString("Salario"));
                utilisateur.setTipo(rs.getString("Tipo"));
                utilisateur.setEmpresa_id(rs.getString("Empresa_id"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return utilisateur;
    }
}








