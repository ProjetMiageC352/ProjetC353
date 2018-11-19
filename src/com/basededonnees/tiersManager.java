/**
 * 
 */
package com.basededonnees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import com.beans.Tiers;


/**
 * @author sutrejz
 *
 */
public class tiersManager {
	private Connection connexion; 
	
	public void creerTiers(Tiers Tiers) {
		
	/**
	 * connexion à la base avec la fonction loadDatabase       
	 */
	    loadDatabase();
	    try {
	    	PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO tiers (t_nom,t_prenom,t_num_compte,t_actif) VALUES(?, ?, ?, ?);");
            preparedStatement.setString(1, Tiers.getNom());
            preparedStatement.setString(2, Tiers.getPrenom());
            preparedStatement.setInt(3, Tiers.getNumCompte());
            preparedStatement.setBoolean(4, Tiers.isActif());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}	    
	    
 
	private void loadDatabase() {
  	  
	       /**
	        *  Chargement du driver
	        */
	    	
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	        }

	        try {
	            connexion = DriverManager.getConnection("jdbc:mysql://78.119.33.211:3306/C353", "C353", "C353");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}
