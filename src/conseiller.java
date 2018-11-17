//package ;

/**
 * Classe Conseiller.
 */
public class Conseiller {

	/* **************************** */
	/*           ATTRIBUTS          */
	/* **************************** */
	
	/**
	 * Id du conseiller.
	 */
	protected int id = 0;
	/**
	 * Nom du conseiller.
	 */
	protected String nom = "";
	/**
	 * Prenom du conseiller.
	 */
	protected String prenom = "";
	/**
	 * Login du conseiller pour le compte agency.
	 */
	protected String loginAgency = "";
	/**
	 * Mot de passe du conseiller pour le compte agency.
	 */
	protected String passwordAgency = "";

	/**
	 * Banque qui emploie le conseiller.
	 */
	protected Banque banque = new Banque();
	
	/* **************************** */
	/*         CONSTRUCTEURS        */
	/* **************************** */
	
	/**
     * Constructeur par défaut de la classe.
     */
    public Conseiller() {
    }
    /**
     * Constructeur de la classe.
     *
     * @param nomC Nom du conseiller
     * @param prenomConseiller Prénom du conseiller
     * @param loginAgencyC Login du conseiller pour le compte agency
     * @param passwordC Mot de passe du conseiller pour le compte agency
     * @param banqueC Banque qui emploie le conseiller
     */
    public Conseiller(final String nomC, final String prenomC,
    		final String loginAgencyC, final String passwordAgencyC,
    		final Banque banqueC) {
    	this.nom = nomC;
    	this.prenom = prenomC;
    	this.loginAgency = loginAgencyC;
    	this.passwordAgency = passwordAgencyC;
    	this.banque = banqueC;
    }
    /**
     * Constructeur de la classe.
     *
     * @param idC Id du conseiller
     * @param nomC Nom du conseiller
     * @param prenomConseiller Prénom du conseiller
     * @param loginAgencyC Login du conseiller pour le compte agency
     * @param passwordC Mot de passe du conseiller pour le compte agency
     * @param banqueC Banque qui emploie le conseiller
     */
    public Conseiller(final int idC, final String nomC, final String prenomC,
    		final String loginAgencyC, final String passwordAgencyC,
    		final Banque banqueC) {
    	this.id = idC;
    	this.nom = nomC;
    	this.prenom = prenomC;
    	this.loginAgency = loginAgencyC;
    	this.passwordAgency = passwordAgencyC;
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
     * Getter du nom.
     *
     * @return nom
     */
    public final String getNom() {
        return nom;
    }
    /**
     * Getter du prénom.
     *
     * @return prenom
     */
    public final String getPrenom() {
        return prenom;
    }
    /**
     * Getter du login agency.
     *
     * @return loginAgency
     */
    public final String getLoginAgency() {
        return loginAgency;
    }
    /**
     * Getter du password agency.
     *
     * @return passwordAgency
     */
    public final String getPasswordAgency() {
        return passwordAgency;
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
    * Setter du nom.
    *
    * @param nomC Nouveau nom
    */
   public final void setNom(final String nomC) {
       this.nom = nomC;
   }
   /**
    * Setter du prenom.
    *
    * @param nomC Nouveau prénom
    */
   public final void setPrenom(final String prenomC) {
       this.prenom = prenomC;
   }
   /**
    * Setter du login agency.
    *
    * @param loginAgencyC Nouveau login
    */
   public final void setLoginAgency(final String loginAgencyC) {
       this.loginAgency = loginAgencyC;
   }
   /**
    * Setter du password agency.
    *
    * @param passwordAgencyC Nouveau login
    */
   public final void setPasswordAgency(final String passwordAgencyC) {
       this.passwordAgency = passwordAgencyC;
   }
   /**
    * Setter de la banque.
    *
    * @param banqueC Nouvelle banque
    */
   public final void setBanque(final Banque banqueC) {
       this.banque = banqueC;
   }
}