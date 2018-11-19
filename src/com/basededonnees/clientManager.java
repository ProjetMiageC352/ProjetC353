/**
 * 
 */
package com.basededonnees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.beans.Client;

/**
 * @author sutrejz
 *
 */
public class clientManager {
	private Connection connexion; 
	
	/**
	 * @return
	 */
	public List<Client> recupererclient() {
		List<Client> clients = new ArrayList<Client>();
        Statement statement = null;
        ResultSet resultat = null;

    	
/**
 * connexion à la base avec la fonction loadDatabase       
 */
    loadDatabase();
       
    	try {
        	
            statement = connexion.createStatement();

            /**
             * Exécution de la requête
             */
            resultat = statement.executeQuery("SELECT c_nom, c_prenom,c_adresse_mail,c_type_client FROM client;");

           /**
            *  Récupération des données
            */
            while (resultat.next()) {
                String nom = resultat.getString("c_nom");
                String prenom = resultat.getString("c_prenom");
               
                
                Client client = new Client();
                client.setNom(nom);
                client.setPrenom(prenom);
      
                clients.add(client);
            }
        } catch (SQLException e) {
        } finally {
           /**
            *  Fermeture de la connexion
            */
            try {
                if (resultat != null)
                    resultat.close();
                if (statement != null)
                    statement.close();
                if (connexion != null)
                    connexion.close();
            } catch (SQLException ignore) {
            }
        }
        
        return clients;
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
