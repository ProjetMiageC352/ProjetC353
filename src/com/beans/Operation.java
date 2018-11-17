package com.beans;

import java.sql.Date;

/**
 * Classe Operation.
 */
public class Operation {

	/* **************************** */
	/*           ATTRIBUTS          */
	/* **************************** */
	
	/**
	 * Id de l'opération.
	 */
    protected int id = 0;
    /**
	 * Date de l'opération.
	 */
    protected Date date;
    /**
	 * Montant de l'opération.
	 */
	protected double montant = 0;
	/**
	 * Type de l'opération.
	 */
	protected String type = "";
    	
	/* **************************** */
	/*         CONSTRUCTEURS        */
	/* **************************** */
	
	/**
     * Constructeur par défaut de la classe.
     */
    public Operation() {
    }
    /**
     * Constructeur de la classe.
     *
     * @param dateO Date de l'opération
     * @param montantO Montant de l'opération
     * @param typeO Type de l'opération
     */
    public Operation(final Date dateO, final double montantO,
    		final String typeO) {
    	this.date = dateO;
    	this.montant = montantO;
    	this.type = typeO;
    }
    /**
     * Constructeur de la classe.
     *
     * @param idO Id de l'opération
     * @param dateO Date de l'opération
     * @param montantO Montant de l'opération
     * @param typeO Type de l'opération
     */
    public Operation(final int idO, final Date dateO, final double montantO,
    		final String typeO) {
    	this.id = idO;
    	this.date = dateO;
    	this.montant = montantO;
    	this.type = typeO;
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
    
    /* **************************** */
   	/*            SETTERS           */
   	/* **************************** */

    /**
     * Setter de l'id.
     *
     * @param idC Nouvel id
     */
    public final void setId(final int idC) {
        this.id = idC;
    }

	/* **************************** */
	/*           METHODES           */
	/* **************************** */
	
	/**
	 * 
	 */
	public void ListerOpération() {
	    // TODO implement here
	}
	
	/**
	 * 
	 */
	public void EffectuerVersement() {
	    // TODO implement here
	}
	
	/**
	 * 
	 */
	public void Date() {
	    // TODO implement here
	}
	
	/**
	 * 
	 */
	public void Montant() {
	    // TODO implement here
	}
	
	/**
	 * 
	 */
	public void VerserSolde() {
	    // TODO implement here
	}
	
	/**
	 * 
	 */
	public void Créer_operation() {
	    // TODO implement here
	}

}