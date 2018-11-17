package com.beans;



/**
 * 
 */
public class tiers extends client {
	
	/**
	 * Id du tiers
	 */
	protected int idT;
	
	/**
	 * Numéro de compte du client
	 */
	private int numCompte;
	
	/**
	 * Client actif?
	 */
	private boolean actif;

	/* **************************** */
	/*         CONSTRUCTEURS        */
	/* **************************** */	
	
	
	/**
     * Default constructor
     */
    public tiers() {
    }

    /**
     * Constructeur de la classe.
     */
	 /**
     * @param id_T
     * @param numCompteT
     * @param actifT
     */
    public tiers(final int id_T,final int numCompteT, final boolean actifT) {
    	this.idT=id_T;
    	this.numCompte=numCompteT;
    	this.actif=actifT;
    }
    
	
	/* **************************** */
	/*            GETTERS           */
	/* **************************** */
    /**
	 * @return the id
	 */
	public final int getIdT() {
		return idT;
	}
	
    /**
	 * @return the numCompte
	 */
	public final int getNumCompte() {
		return numCompte;
	}
	/**
	 * @return the actif
	 */
	public final boolean isActif() {
		return actif;
	}
	
	/* **************************** */
	/*            SETTERS           */
	/* **************************** */
	/**
	 * @param id the id to set
	 */
	public final void setIdT(int id) {
		this.idT = id;
	}
	/**
	 * @param numCompte the numCompte to set
	 */
	public final void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}
	/**
	 * @param actif the actif to set
	 */
	public final void setActif(boolean actif) {
		this.actif = actif;
	}
	
   
}