import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import voiture.Vehicule;


public class Garage{
	protected ArrayList<Vehicule> voiture=new ArrayList<Vehicule>();
	File garage;
	FileWriter fouts;
	Scanner fints;
	public Garage(){
			garage= new File("garage.txt");			
	}
	public void addVoiture(Vehicule voit){
		voiture.add(voit);
		try {
			garage= new File("garage.txt");
			fouts= new FileWriter(garage);
			for(int i =0;i<voiture.size();i++)
			fouts.write(voiture.get(i).toString());
			fouts.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	public String toString(){
		String str="";
		try{
			fints= new Scanner(garage);
			while(fints.hasNextLine())
		        str +=fints.nextLine()+"\n";
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		if (str=="")
			return "Aucune voiture sauvegardé!";
		else
			return str;
	}
}
