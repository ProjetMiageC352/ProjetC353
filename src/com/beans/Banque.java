package com.beans;

/**
 * Classe Banque.
 */
public class Banque {

	/* **************************** */
	/*           ATTRIBUTS          */
	/* **************************** */
	
	/**
	 * Id de la banque.
	 */
	protected int id = 0;
	/**
	 * Nom de la banque.
	 */
	protected String nom = "";
	/**
	 * Adresse de la banque.
	 */
	protected String adresse = "";
	
	/* **************************** */
	/*         CONSTRUCTEURS        */
	/* **************************** */
	
    /**
     * Constructeur par défaut de la classe.
     */
    public Banque() {
    }
    /**
     * Constructeur de la classe.
     *
     * @param nomB Nom de la banque
     * @param adresseB Adresse de la banque
     */
    public Banque(final String nomB, final String adresseB) {
    	this.nom = nomB;
    	this.adresse = adresseB;
    }
    /**
     * Constructeur de la classe.
     *
     * @param idB Id de la banque
     * @param nomB Nom de la banque
     * @param adresseB Adresse de la banque
     */
    public Banque(final int idB, final String nomB, final String adresseB) {
        this.id = idB;
        this.nom = nomB;
    	this.adresse = adresseB;
    }
    
    /* **************************** */
	/*            GETTERS           */
	/* **************************** */

    /**
     * Getter de l'id.
     *
     * @return id
     */
    public final int getId() {
        return id;
    }
    /**
     * Getter du nom.
     *
     * @return nom
     */
    public final String getNom() {
        return nom;
    }
    /**
     * Getter de l'adresse.
     *
     * @return adresse
     */
    public final String getAdresse() {
        return adresse;
    }
    
    /* **************************** */
	/*            SETTERS           */
	/* **************************** */

    /**
     * Setter de l'id.
     *
     * @param idB Nouvel id
     */
    public final void setId(final int idB) {
        this.id = idB;
    }
    /**
     * Setter du nom.
     *
     * @param nomB Nouveau nom
     */
    public final void setNom(final String nomB) {
        this.nom = nomB;
    }
    /**
     * Setter de l'adresse.
     *
     * @param adresseB Nouvelle adresse
     */
    public final void setAdresse(final String adresseB) {
        this.adresse = adresseB;
    }
}