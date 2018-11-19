package com.beans;



/**
 * 
 */
public class CarteBancaire {
	
	

	/**
	 * Id carte
	 */
	protected int idC;
	/**
	 * Numéro de la carte
	 */
	protected int num_carte;
	/**
	 * type de la carte
	 */
	protected String type_carte;
	/**
	 * Echéance de la carte
	 */
	protected int echeance;
	/**
	 * Code crypter de la carte
	 */
	protected String code_crypto;

	
	/* **************************** */
	/*         CONSTRUCTEURS        */
	/* **************************** */	
    /**
     * Default constructor
     */
    public CarteBancaire () {
    }

    
    /* **************************** */
	/*            GETTERS           */
	/* **************************** */
	/**
	 * @return the idC
	 */
	public final int getIdC() {
		return idC;
	}

	/**
	 * @return the num_carte
	 */
	public final int getNum_carte() {
		return num_carte;
	}

	/**
	 * @return the type_carte
	 */
	public final String getType_carte() {
		return type_carte;
	}

	/**
	 * @return the echeance
	 */
	public final int getEcheance() {
		return echeance;
	}

	/**
	 * @return the code_crypto
	 */
	public final String getCode_crypto() {
		return code_crypto;
	}

	
	/* **************************** */
	/*            SETTERS           */
	/* **************************** */
	/**
	 * @param idC the idC to set
	 */
	public final void setIdC(int idC) {
		this.idC = idC;
	}

	/**
	 * @param num_carte the num_carte to set
	 */
	public final void setNum_carte(int num_carte) {
		this.num_carte = num_carte;
	}

	/**
	 * @param type_carte the type_carte to set
	 */
	public final void setType_carte(String type_carte) {
		this.type_carte = type_carte;
	}

	/**
	 * @param echeance the echeance to set
	 */
	public final void setEcheance(int echeance) {
		this.echeance = echeance;
	}

	/**
	 * @param code_crypto the code_crypto to set
	 */
	public final void setCode_crypto(String code_crypto) {
		this.code_crypto = code_crypto;
	}

    


}