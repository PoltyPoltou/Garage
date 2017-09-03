package com.semaine2.vehicule.option;

import com.semaine2.vehicule.Option;
import java.io.Serializable;

public class Climatisation implements Option, Serializable{
	
	private static final long serialVersionUID = 3061919366972942548L;
	private final double prix = 347.3;

	/* Getteur */
	public double getPrix(){ return prix; }

}
