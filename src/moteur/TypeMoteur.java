package moteur;

public enum TypeMoteur {
	DIESEL("Diesel"),
	ESSENCE("Essence"),
	HYBRIDE("Hybride"),
	ELECTRIQUE("Electrique");
	
	protected String type;
	
	TypeMoteur(String str){
		this.type = str;
	}
	
	public String toString(){
		return type;
	}
}
