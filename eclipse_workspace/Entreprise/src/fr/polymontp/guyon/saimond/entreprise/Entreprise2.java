package fr.polymontp.guyon.saimond.entreprise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Entreprise2 {
	private ArrayList employes = new ArrayList();
	private String name;
	
	
	/** CONSTRUCTOR
	 * Entreprise2
	 * @param name
	 * @param max
	 */
	
	public Entreprise2(String name) {
		this.setName(name);
	}
	
	// METHODS
	
	public String toString() {
		String nomEmployes = new String();
		for(Employe employe : (ArrayList<Employe>)this.getEmployes()) {
			nomEmployes += employe.getName();
			nomEmployes += ", ";
		}
		return "Entreprise : " + this.getName() + ", Employes : " + nomEmployes;
	}
	
	public Iterator iterEmployes() {
		return this.getEmployes().iterator();
	}
	
	// GET / SET

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList getEmployes() {
		return employes;
	}
	
	public void setEmployes(ArrayList employes) {
		this.employes = employes;
	}
	
	public int getNbEmploye() {
		return this.getEmployes().size();
	}
}
