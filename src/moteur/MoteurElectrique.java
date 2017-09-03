package moteur;

public class MoteurElectrique extends Engine{
	public MoteurElectrique(String cyl,double price){
		super(cyl,price);
		this.type=TypeMoteur.ELECTRIQUE;
	}
}
