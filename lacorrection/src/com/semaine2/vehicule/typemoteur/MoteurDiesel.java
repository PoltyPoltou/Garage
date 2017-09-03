package com.semaine2.vehicule.typemoteur;

import com.semaine2.vehicule.Moteur;
import com.semaine2.vehicule.TypeMoteur;

public class MoteurDiesel extends Moteur{
	
	private static final long serialVersionUID = 910488797245190287L;

	public MoteurDiesel(String cylindre, double prix)
	{
		super(cylindre, prix); 
		type = TypeMoteur.DIESEL;
	}

}
