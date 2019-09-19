package fr.polymontp.guyon.saimond.entreprise;

public class Employe_heure extends Employe{
	
	private double nbHeure;
	private double coefHSupp;
	private double tarifHoraire;

	
	public Employe_heure(String name, double nbHeure, double coef, double tarifHoraire) {
		super(name);
		setInfosSalaire(nbHeure, coef, tarifHoraire);
	}
	
	public double getSalaire() {
		if(nbHeure <= 35) {
			return (getNbHeure() * getTarifHoraire());
		} else {
			return ((35 * getTarifHoraire()) + (getNbHeure()-35)*(getTarifHoraire()*getCoefHSupp()));
		}
	}
	
	/**
	 * 
	 * @param nbHeure Nombre d'heure travaillé
	 * @param coefHSupp Coeff d'heure supplémentaire
	 * @param tarifHeure Tarif pour un heure
	 */
	public void setInfosSalaire(double nbHeure, double coefHSupp, double tarifHeure) {
		setNbHeure(nbHeure);
		setCoefHSupp(coefHSupp);
		setTarifHoraire(tarifHeure);
	}

	public double getNbHeure() {
		return nbHeure;
	}

	public void setNbHeure(double nbHeure) {
		this.nbHeure = nbHeure;
	}

	public double getCoefHSupp() {
		return coefHSupp;
	}

	public void setCoefHSupp(double coefHSupp) {
		this.coefHSupp = coefHSupp;
	}
	
	public double getTarifHoraire() {
		return tarifHoraire;
	}

	public void setTarifHoraire(double tarifHoraire) {
		this.tarifHoraire = tarifHoraire;
	}
}
