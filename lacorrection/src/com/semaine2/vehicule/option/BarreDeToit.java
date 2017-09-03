package com.semaine2.vehicule.option;

import com.semaine2.vehicule.Option;
import java.io.Serializable;

public class BarreDeToit implements Option, Serializable{

	private static final long serialVersionUID = -9176749305174762594L;
	private final double prix = 29.9; 
	
	/* Getteur */
	public double getPrix(){ return prix; }

}
