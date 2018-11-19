package com.beans;



/**
 * 
 */
/**
 * @author sutrejz
 *
 */
public class Interne extends Client {

	/**
	 * Id interne
	 */
	protected int idI;
	/**
	 * login interne
	 */
	protected String login;
	/**
	 * mot de passe
	 */
	protected String mot_de_passe;
	/**
	 * année d'arrivée
	 */
	protected int annee_arrivee;
	/**
	 * numéro du contrat
	 */
	protected int num_contrat;
	/**
	 * numéro du portable
	 */
	protected int num_portable;
	/**
	 * agency
	 */
	protected boolean agency;
	/**
	 * type de contrat 
	 */
	protected String type_contrat;
	
	/* **************************** */
	/*         CONSTRUCTEURS        */
	/* **************************** */	
	/**
     * Default constructor
     */
    public Interne() {
    	
    }
    
    /**
     * Constructeur de la classe.
     */
public Interne(String loginI, String mdp,int annee,int contrat, int portable,boolean agencyI) {
    	this.login=loginI;
    	this.mot_de_passe=mdp;
    	this.annee_arrivee=annee;
    	this.num_contrat=contrat;
    	this.num_portable=portable;
    	this.agency=agencyI;
}

	
	
    /* **************************** */
	/*            GETTERS           */
	/* **************************** */
    /**
	 * @return the id
	 */
	public final int getIdI() {
		return idI;
	}


	/**
	 * @return the login
	 */
	public final String getLogin() {
		return login;
	}


	/**
	 * @return the mot_de_passe
	 */
	public final String getMot_de_passe() {
		return mot_de_passe;
	}


	/**
	 * @return the annee_arrivee
	 */
	public final int getAnnee_arrivee() {
		return annee_arrivee;
	}


	/**
	 * @return the num_contrat
	 */
	public final int getNum_contrat() {
		return num_contrat;
	}


	/**
	 * @return the num_portable
	 */
	public final int getNum_portable() {
		return num_portable;
	}


	/**
	 * @return the agency
	 */
	public final boolean isAgency() {
		return agency;
	}


	/**
	 * @return the type_contrat
	 */
	public final String getType_contrat() {
		return type_contrat;
	}


	/* **************************** */
	/*            SETTERS           */
	/* **************************** */
	/**
	 * @param id the id to set
	 */
	public final void setIdI(int id) {
		this.idI = id;
	}


	/**
	 * @param login the login to set
	 */
	public final void setLogin(String login) {
		this.login = login;
	}


	/**
	 * @param mot_de_passe the mot_de_passe to set
	 */
	public final void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}


	/**
	 * @param annee_arrivee the annee_arrivee to set
	 */
	public final void setAnnee_arrivee(int annee_arrivee) {
		this.annee_arrivee = annee_arrivee;
	}


	/**
	 * @param num_contrat the num_contrat to set
	 */
	public final void setNum_contrat(int num_contrat) {
		this.num_contrat = num_contrat;
	}


	/**
	 * @param num_portable the num_portable to set
	 */
	public final void setNum_portable(int num_portable) {
		this.num_portable = num_portable;
	}


	/**
	 * @param agency the agency to set
	 */
	public final void setAgency(boolean agency) {
		this.agency = agency;
	}


	/**
	 * @param type_contrat the type_contrat to set
	 */
	public final void setType_contrat(String type_contrat) {
		this.type_contrat = type_contrat;
	}



}