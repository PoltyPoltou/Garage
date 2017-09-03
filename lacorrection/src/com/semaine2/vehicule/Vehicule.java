package com.semaine2.vehicule;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

import com.semaine2.vehicule.Marque;
import com.semaine2.vehicule.Moteur;
import com.semaine2.vehicule.Option;

public abstract class Vehicule implements Serializable{
	
	private static final long serialVersionUID = 5394808707210601200L;
	protected double prix;
	protected String nom;
	protected Marque nomMarque;
	protected List<Option> option = new ArrayList<Option> ();
	protected Moteur moteur;

	/* Getteur */
	public double getPrix()	{ return this.prix; }
	public Marque getMarque(){ return this.nomMarque; }
	public String getNom(){	return this.nom; }

	/* Setteur */
	public void setMoteur(Moteur moteur){ this.moteur = moteur; }
	public void addOption(Option opt){ option.add(opt); }
	
	/* Mecanisme interne retourne la sommes du prix de toutes les options */
	private double prixTotal() 
	{
		double pt = getPrix() ; 
		
		for(Option o : option) 
			pt += o.getPrix();	
		return  pt;
	}
	
	/* Redefinition de toString affiche le detail du vehicule */
	public String toString()
	{
		String str = ""; 
		
		for(Option o : option)
			str +=  o.getClass().getSimpleName() + " " + "("+o.getPrix()+"€)"; 
		return ( "+ " + this.getMarque().getName() + " : " + getNom() + " " + this.moteur.toString() + " " + "("+String.valueOf(getPrix())+"€)" + " ["+ str +"]" + " d'une valeur totale de " + this.prixTotal() + " €\n" ) ;        
	}
}
