package com.semaine2.garage;

import java.util.ArrayList; 
import java.util.List; 
import java .io. BufferedInputStream ;
import java .io. BufferedOutputStream ;
import java .io. FileInputStream ;
import java .io. FileNotFoundException ;
import java .io. FileOutputStream ;
import java .io. IOException ;
import java .io. ObjectInputStream ;
import java .io. ObjectOutputStream ;
import java.io.EOFException;

import com.semaine2.vehicule.*;

public class Garage {
	private List<Vehicule> vehicule = new ArrayList<Vehicule> ();
	
	/* ajout de voiture dans une arraylist puis ajout de la liste de voiture sous forme de liste d'obje serialiser dans le fichier garage.txt*/
	public void addVoiture(Vehicule voit)
	{
		vehicule.add(voit);
		try (  ObjectOutputStream oos = new ObjectOutputStream( new BufferedOutputStream(new FileOutputStream( "garage.txt"))); )
		{	 
			oos.writeObject(vehicule);
			oos.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	/* lecture du fichier garage.txt récupére la liste de vehicule et la charge dans la liste vehicule de la class puis affiche les vehicule de la liste*/
	public String toString()
	{
		String str = "";
		try( ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("garage.txt")))  ; )
		{
			vehicule = (List<Vehicule>) ois.readObject() ;
			for( Vehicule v : vehicule)
				str += v.toString();
			ois.close();
		} 
		catch (FileNotFoundException | ClassNotFoundException | EOFException e)	
		{
			System.out.println("Aucune voiture sauvegardé !") ;
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return "***************************** \n*           Garage          *\n*****************************\n" + str + "\nNombre de vehicules : " + vehicule.size()  ;
	}
		
}