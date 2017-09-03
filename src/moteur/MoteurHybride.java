package moteur;

public class MoteurHybride extends Engine{
	public MoteurHybride(String cyl,double price){
		super(cyl,price);
		this.type=TypeMoteur.HYBRIDE;
	}
}
