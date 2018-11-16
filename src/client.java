import java.util.*;



public class client {
	public String c_nom;
	public String c_prenom;
	public String c_adresse_mail;
	public String c_type_client;
	
//constructeur de client	
	public client(String nom,String prenom,String adresse,String type) {
		c_nom=nom;
		c_prenom=prenom;
		c_adresse_mail=adresse;
		c_type_client=type;
    }

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

}