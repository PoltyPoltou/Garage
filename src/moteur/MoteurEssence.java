package moteur;

public class MoteurEssence extends Engine{
	public MoteurEssence(String cyl,double price){
		super(cyl,price);
		this.type=TypeMoteur.ESSENCE;
	}
}
