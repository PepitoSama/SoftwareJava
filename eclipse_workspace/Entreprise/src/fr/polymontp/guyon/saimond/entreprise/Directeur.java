package fr.polymontp.guyon.saimond.entreprise;

public class Directeur extends Employe {
	
	private static Directeur theDirecteur;
	private double sommeFix;
	
	
	public double getSommeFix() {
		return sommeFix;
	}

	public void setSommeFix(double sommeFix) {
		this.sommeFix = sommeFix;
	}

	private Directeur(String name, double sommeFix) {
		super(name);
		this.setSommeFix(sommeFix);
	}
	
	public double getSalaire(){
		return (this.getSommeFix() + 0.04 * Employe.getSommeCA());
	}
	
	
	/**
	 * Si le directeur existe, le renvoie
	 * Sinon, creer un nouveau directeur
	 * @param name
	 * @param sommeFix
	 * @return Le nouveau directeur
	 */
	public static Directeur creerDirecteur(String name, double sommeFix) {
		if(theDirecteur == null) {
			theDirecteur = new Directeur(name, sommeFix);
		}
		return theDirecteur;
	}
	
	public static boolean isCreated() {
		if(theDirecteur == null) {
			return false;
		}
		return true;
	}

}
