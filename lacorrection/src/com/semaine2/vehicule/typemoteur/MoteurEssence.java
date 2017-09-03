package com.semaine2.vehicule.typemoteur;

import com.semaine2.vehicule.Moteur;
import com.semaine2.vehicule.TypeMoteur;

public class MoteurEssence extends Moteur{
	
	private static final long serialVersionUID = 6068574853753605778L;

	public MoteurEssence(String cylindre, double prix)
	{
		super(cylindre, prix);
		type = TypeMoteur.ESSENCE;
	}

}
