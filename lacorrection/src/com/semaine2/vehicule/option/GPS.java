package com.semaine2.vehicule.option;

import com.semaine2.vehicule.Option;
import java.io.Serializable;

public class GPS implements Option, Serializable{

	private static final long serialVersionUID = 4333776652087045944L;
	private final double prix = 113.5;
	
	/* Getteur */
	public double getPrix(){ return prix; }

}
