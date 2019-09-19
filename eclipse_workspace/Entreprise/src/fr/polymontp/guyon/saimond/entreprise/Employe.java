package fr.polymontp.guyon.saimond.entreprise;

public abstract class Employe {
	
	protected String name;
	private static double sommeCA = 0;

	public static double getSommeCA() {
		return sommeCA;
	}

	public void setSommeCA(double sommeCA) {
		Employe.sommeCA = sommeCA;
	}

	public Employe(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return Le salaire de l'employé
	 */
	public abstract double getSalaire();
	
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return this.getName() + " gagne " + this.getSalaire() + " €";
	}
} 
