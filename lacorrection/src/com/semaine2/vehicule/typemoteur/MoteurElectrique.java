package com.semaine2.vehicule.typemoteur;

import com.semaine2.vehicule.Moteur;
import com.semaine2.vehicule.TypeMoteur;

public class MoteurElectrique extends Moteur{
	
	private static final long serialVersionUID = -7298926424232319200L;
	public MoteurElectrique(String cylindre, double prix)
	{
		super(cylindre, prix);
		type = TypeMoteur.ELECTRIQUE; 
	}

}
