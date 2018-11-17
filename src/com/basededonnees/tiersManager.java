/**
 * 
 */
package com.basededonnees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



import com.beans.tiers;


/**
 * @author sutrejz
 *
 */
public class tiersManager {
	private Connection connexion; 
	
	public void creerTiers() {
		tiers Tiers = new tiers();
		java.sql.PreparedStatement prepare = null;
		int id=Tiers.getIdT();
		String nom=Tiers.getNom();
		String prenom=Tiers.getPrenom();
		int numCompte=Tiers.getNumCompte();
		boolean actif=Tiers.isActif();
		
		
	/**
	 * connexion à la base avec la fonction loadDatabase       
	 */
	    loadDatabase();
	    
try {
        	
    
            /**
             * Exécution de la requête
             */
     	prepare = connexion.prepareStatement("INSERT INTO tiers (t_id,t_nom,t_prenom,t_num_compte,t_actif) VALUE ('"+id+"','"+nom+"','"+prenom+"','"+numCompte+"','"+actif+"';");

          
            
        } catch (SQLException e) {
        } finally {
           /**
            *  Fermeture de la connexion
            */
            try {
                if (prepare != null)
                	prepare.close();
                if (connexion != null)
                    connexion.close();
            } catch (SQLException ignore) {
            }
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
