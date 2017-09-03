package com.semaine2.vehicule.option;

import com.semaine2.vehicule.Option;
import java.io.Serializable;


public class VitreElectrique implements Option, Serializable{

	private static final long serialVersionUID = -7114200268372328427L;
	private final double prix = 212.35;
	
	/* Getteur */
	public double getPrix(){ return prix; }

}
