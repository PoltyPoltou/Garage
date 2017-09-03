package com.semaine2.vehicule;

public enum TypeMoteur {
DIESEL ("Moteur DIESEL"),
ESSENCE ("Moteur ESSENCE"),
HYBRIDE ("Moteur HYBRIDE"),
ELECTRIQUE ("Moteur ELECTRIQUE");

	private String type = ""; 

	TypeMoteur(String name) 
	{
		this.type = name;
	}

	public String getName()
	{
		return this.type;
	}
}
