package com.beans;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/** 
 * Classe client
 */

public class client {
	
	/**
	 * Id du client
	 */
	protected int id;
	/** 
	 * Nom du client
	 */
	protected String nom;
	/**
	 * Prenom du client
	 */
	protected String prenom;
	/**
	 * Adresse Mail du client
	 */
	protected String adresse_mail;
	/**
	 * Type du client
	 */
	protected String type_client;
	
	
	/* **************************** */
	/*         CONSTRUCTEURS        */
	/* **************************** */
	
	/**
     * Constructeur par défaut de la classe.
     */
	public client() {
	}
	
	/**
     * Constructeur de la classe.
     */
	/**
	 * @param idC
	 * @param nomC
	 * @param prenomC
	 * @param adresseC
	 * @param typeC
	 */
	public client(final int idC,final String nomC, final String prenomC,final String adresseC, final String typeC) {
		this.id=idC;
		this.nom=nomC;
		this.prenom=prenomC;
		this.adresse_mail=adresseC;
		this.type_client=typeC;
	}
	
	/* **************************** */
	/*            GETTERS           */
	/* **************************** */
	
	/**
	 * @return the id
	 */
	public final int getId() {
		return id;
	}

	/**
	 * @return the nom
	 */
	public final String getNom() {
		return nom;
	}

	/**
	 * @return the prenom
	 */
	public final String getPrenom() {
		return prenom;
	}

	/**
	 * @return the adresse_mail
	 */
	public final String getAdresse_mail() {
		return adresse_mail;
	}

	/**
	 * @return the type_client
	 */
	public final String getType_client() {
		return type_client;
	}
	

	/* **************************** */
	/*            SETTERS           */
	/* **************************** */
	
	/**
	 * @param id the id to set
	 */
	public final void setId(int id) {
		this.id = id;
	}

	/**
	 * @param nom the nom to set
	 */
	public final void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public final void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @param adresse_mail the adresse_mail to set
	 */
	public final void setAdresse_mail(String adresse_mail) {
		this.adresse_mail = adresse_mail;
	}

	/**
	 * @param type_client the type_client to set
	 */
	public final void setType_client(String type_client) {
		this.type_client = type_client;
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