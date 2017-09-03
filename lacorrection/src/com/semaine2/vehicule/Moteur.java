package com.semaine2.vehicule;

import java.io.Serializable;

public abstract class Moteur implements Serializable {

	private static final long serialVersionUID = -3096656330668003090L;
	protected TypeMoteur type;
	protected String cylindre;
	protected double prix;
	
	
	public Moteur(String cylindre, double prix)
	{
		this.prix = prix ;
		this.cylindre = cylindre ;
	}
	
	/* Setteur */
	public void setMoteur(String cylindre, double prix)
	{
		this.cylindre = cylindre;
		this.prix = prix;
	}

	/* Getteur */
	public double getPrix(){ return this.prix; }
	
	public String getCylindre(){ return this.cylindre; }

	public TypeMoteur getType(){ return this.type; }

	/* redefinition de to string retourne le type du moteur et le cylindre */
	public String toString()
	{
		return this.getType().getName() + " " + getCylindre() ;
	}
}
