package com.semaine2.vehicule.option;

import com.semaine2.vehicule.Option;
import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable{

	private static final long serialVersionUID = -8870898076887601267L;
	private final double prix = 562.9;

	/* Getteur */
	public double getPrix(){ return prix; }

}
