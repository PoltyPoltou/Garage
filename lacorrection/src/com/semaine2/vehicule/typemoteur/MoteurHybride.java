package com.semaine2.vehicule.typemoteur;

import com.semaine2.vehicule.Moteur;
import com.semaine2.vehicule.TypeMoteur;

public class MoteurHybride extends Moteur {

	private static final long serialVersionUID = 542272795353728341L;

	public MoteurHybride(String cylindre, double prix)
	{
		super(cylindre, prix); 
		type = TypeMoteur.HYBRIDE;
	}
	
	
}
