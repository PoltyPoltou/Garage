package voiture;

public enum Marque {
	RENO("Reno"),
	PIGEOT("Pigeot"),
	TROEN("Troen");
	
	protected String marque;
	
	Marque(String str){
		this.marque = str;
	}
	
	public String toString(){
		return marque;
	}
}
