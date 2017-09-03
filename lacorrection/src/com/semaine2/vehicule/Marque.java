package com.semaine2.vehicule;

public enum Marque 
{
	RENO ("Voiture RENO"),
	PIGEOT ("Voiture PIGEOT"),
	TROEN ("Voiture TROEN");
	
	
	private String marque = "";
	
	Marque(String name) 
	{
		this.marque = name;
	}
	
	public String getName() 
	{
		return this.marque; 
	}
}
