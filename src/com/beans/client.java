package com.beans;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;



public class client {
	public String c_nom;
	public String c_prenom;
	public String c_adresse_mail;
	public String c_type_client;
	private Connection connexion;


//retourne le nom d'un client	
    public String getC_nom() {
		return c_nom;
	}

//ajoute le nom d'un client	
	public void setC_nom(String c_nom) {
		this.c_nom = c_nom;
	}

//retourne le prenom d'un client	
	public String getC_prenom() {
		return c_prenom;
	}

//ajoute le prenom d'un client		
	public void setC_prenom(String c_prenom) {
		this.c_prenom = c_prenom;
	}

//retourne l'adresse d'un client	
	public String getC_adresse_mail() {
		return c_adresse_mail;
	}

//ajoute l'adresse d'un client		
	public void setC_adresse_mail(String c_adresse_mail) {
		this.c_adresse_mail = c_adresse_mail;
	}

//retourne le type d'un client	
	public String getC_type_client() {
		return c_type_client;
	}

//ajoute le type d'un client	
	public void setC_type_client(String c_type_client) {
		this.c_type_client = c_type_client;
	}



    /**
     * 
     */
    public void LierCpteClient() {
        // TODO implement here
    }

    /**
     * 
     */
    public void LierOpCpte() {
        // TODO implement here
    }

    /**
     * 
     */
    public void ClientAgency() {
        // TODO implement here
    }

    /**
     * 
     */
    public void CreerCompteAgency() {
        // TODO implement here
    }

    /**
     * 
     */
    public void LierOpClient() {
        // TODO implement here
    }
    

//retourne la liste des clients 	
    public List<client> recupererclient() {
		List<client> clients = new ArrayList<client>();
        Statement statement = null;
        ResultSet resultat = null;
           
//connexion à la base        
    loadDatabase();
       
    	try {
        	
            statement = connexion.createStatement();

            // Exécution de la requête
            resultat = statement.executeQuery("SELECT c_nom, c_prenom,c_adresse_mail,c_type_client FROM CLIENT;");

            // Récupération des données
            while (resultat.next()) {
                String nom = resultat.getString("c_nom");
                String prenom = resultat.getString("c_prenom");
               
                
                client client = new client();
                client.setC_nom(nom);
                client.setC_prenom(prenom);
                
                clients.add(client);
            }
        } catch (SQLException e) {
        } finally {
            // Fermeture de la connexion
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
        // Chargement du driver
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