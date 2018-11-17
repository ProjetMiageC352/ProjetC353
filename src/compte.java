//package ;

/**
 * Classe Compte.
 */
public class Compte {

	/* **************************** */
	/*           ATTRIBUTS          */
	/* **************************** */
	
	/**
	 * Id du compte / numéro de compte.
	 */
	protected int id = 0;
	/**
	 * Type de compte.
	 */
	protected String type = "";
	/**
	 * Découvert autorisé pour le compte.
	 */
	protected boolean decouvert = false;
	/**
	 * Solde du compte.
	 */
	protected double solde = 0;

	/**
	 * Banque qui gère le compte.
	 */
	protected Banque banque = new Banque();
	/**
	 * Propriétaire du compte.
	 */
	//TODO
	//protected Client = new Client();
	
	/* **************************** */
	/*         CONSTRUCTEURS        */
	/* **************************** */
	
	/**
     * Constructeur par défaut de la classe.
     */
    public Compte() {
    }
    /**
     * Constructeur de la classe.
     *
     * @param typeC Type de compte
     * @param decouvertC Découvert autorisé pour le compte
     * @param soldeC Solde du compte
     * @param banqueC Banque qui gère le compte
     */
    public Compte(final String typeC, final boolean decouvertC,
    		final double soldeC, final Banque banqueC) {
    	this.type = typeC;
    	this.decouvert = decouvertC;
    	this.solde = soldeC;
    	this.banque = banqueC;
    }
    /**
     * Constructeur de la classe.
     *
     * @param idC Numéro de compte
     * @param typeC Type de compte
     * @param decouvertC Découvert autorisé pour le compte
     * @param soldeC Solde du compte
     * @param banqueC Banque qui gère le compte
     */
    public Compte(final int idC, final String typeC, final boolean decouvertC,
    		final double soldeC, final Banque banqueC) {
    	this.id = idC;
    	this.type = typeC;
    	this.decouvert = decouvertC;
    	this.solde = soldeC;
    	this.banque = banqueC;
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
     * Getter du type.
     *
     * @return type
     */
    public final String getType() {
        return type;
    }
    /**
     * Getter du découvert autorisé.
     *
     * @return decouvert
     */
    public final boolean getDecouvert() {
        return decouvert;
    }
    /**
     * Getter du solde.
     *
     * @return solde
     */
    public final double getSolde() {
        return solde;
    }
    /**
     * Getter de la banque.
     *
     * @return banque
     */
    public final Banque getBanque() {
        return banque;
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
    /**
     * Setter du type.
     *
     * @param typeC Nouveau type
     */
    public final void setType(final String typeC) {
        this.type = typeC;
    }
    /**
     * Setter du découvert autorisé.
     *
     * @param decouvertC Nouveau découvert autorisé
     */
    public final void setDecouvert(final boolean decouvertC) {
        this.decouvert = decouvertC;
    }
    /**
     * Setter du solde.
     *
     * @param soldeC Nouveau solde
     */
    public final void setSolde(final double soldeC) {
        this.solde = soldeC;
    }
    /**
     * Setter de la banque.
     *
     * @param banqueC Nouvelle banque
     */
    public final void setBanque(final Banque banqueC) {
        this.banque = banqueC;
    }
    
    /* **************************** */
	/*           METHODES           */
	/* **************************** */

    /**
     * 
     */
    public void CréerCompte() {
        // TODO implement here
    }

    /**
     * 
     */
    public void ListeOper() {
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
    public void LierOperClient() {
        // TODO implement here
    }

}