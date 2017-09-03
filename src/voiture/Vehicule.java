package voiture;
import java.util.ArrayList;

import moteur.Engine;
import options.Options;


public class Vehicule {
	protected double prix;
	protected String name;
	protected ArrayList<Options>opt=new ArrayList<Options>();
	protected Marque nomMarque;
	protected int nbOption=0;
	protected Engine engine;
	
	public double getPrix(){
		double prixtotal=engine.getPrix();
		for(int i=0;i<opt.size();i++){
			prixtotal+=opt.get(i).getPrice();
		}
		return prixtotal;
	}
	
	public String getOptions(){
		String str="";
		for(int i=0;i<opt.size();i++){
			if(i+1==opt.size())
				str+=opt.get(i).toString();
			else
				str+=opt.get(i).toString()+", ";
		}
		return str;
	}
	
	public void addOption(Options option){
		opt.add(option);
	}
	
	public void setMoteur(Engine engine){
		this.engine = engine;
	}
	
	public String toString(){
		String option="";
		option =getOptions();
		if(option=="")
			option="Aucune options";
		String str=("voiture "+this.nomMarque+" :"+name+" moteur "+engine+" "+engine.getCylindre()+"("+engine.getPrix()+"€) ["+option+"] d'une valeur totale de "+this.getPrix()+"€\n");
		return str;
	}
}
