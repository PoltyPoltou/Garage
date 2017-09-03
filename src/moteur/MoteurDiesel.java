package moteur;

public class MoteurDiesel extends Engine{
	public MoteurDiesel(String cyl,double price){
		super(cyl,price);
		this.type=TypeMoteur.DIESEL;
	}
}
