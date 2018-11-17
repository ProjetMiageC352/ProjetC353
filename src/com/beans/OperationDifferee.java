package com.beans;

import java.sql.Date;

/**
 * Classe OperationDifferee.
 */
public class OperationDifferee extends Operation {

	/* **************************** */
	/*           ATTRIBUTS          */
	/* **************************** */
	
	/**
	 * Date de l'échéance.
	 */
    protected Date echeance;
	
	/* **************************** */
	/*         CONSTRUCTEURS        */
	/* **************************** */
	
	/**
     * Constructeur par défaut de la classe.
     */
    public OperationDifferee() {
    	super();
    }
    /**
     * Constructeur de la classe.
     *
     * @param dateO Date de l'opération
     * @param montantO Montant de l'opération
     * @param typeO Type de l'opération
     * @param echeanceO Date de l'échéance
     */
    public OperationDifferee(final Date dateO, final double montantO,
    		final String typeO, final Date echeanceO) {
    	super(dateO, montantO, typeO);
    	this.echeance = echeanceO;
    }
    /**
     * Constructeur de la classe.
     *
     * @param idO Id de l'opération
     * @param dateO Date de l'opération
     * @param montantO Montant de l'opération
     * @param typeO Type de l'opération
     * @param echeanceO Date de l'échéance
     */
    public OperationDifferee(final int idO, final Date dateO,
    		final double montantO, final String typeO, final Date echeanceO) {
    	super(idO, dateO, montantO, typeO);
    	this.echeance = echeanceO;
    }
    
    /* **************************** */
	/*            GETTERS           */
	/* **************************** */

    /**
     * Getter de la date de l'échéance.
     *
     * @return echeance
     */
    public final Date getEcheance() {
        return echeance;
    }
    
    /* **************************** */
   	/*            SETTERS           */
   	/* **************************** */

    /**
     * Setter de la date de l'échéance.
     *
     * @param echeanceO Nouvelle date d'échéance
     */
    public final void setEcheance(final Date echeanceO) {
        this.echeance = echeanceO;
    }
}