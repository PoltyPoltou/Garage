package moteur;


public abstract class Engine {
	TypeMoteur type;
	String cylindre;
	double prix;
	public Engine(String cyl,double price){
		this.prix=price;
		this.cylindre=cyl;
	}
	public double getPrix(){
		return this.prix;
	}
	public String toString(){
		return this.type.toString();
	}
	public String getCylindre(){
		return this.cylindre;
	}
}
