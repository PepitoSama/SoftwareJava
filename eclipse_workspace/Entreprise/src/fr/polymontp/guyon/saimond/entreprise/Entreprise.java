package fr.polymontp.guyon.saimond.entreprise;

public class Entreprise {
	private int max;
	private Employe[] employes;
	private int nbEmploye;
	
	public int getNbEmploye() {
		return nbEmploye;
	}

	public void setNbEmploye(int nbEmploye) {
		this.nbEmploye = nbEmploye;
	}

	public Entreprise (int max) {
		this.setMax(max);
		this.setEmployes(new Employe[max]);
		this.setNbEmploye(0);
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public Employe[] getEmployes() {
		return employes;
	}

	public void setEmployes(Employe[] employes) {
		this.employes = employes;
	}
	
	public void addEmploye(Employe employe) throws EntrepriseSatureDeCommerciauxException {

		if (this.getMax() == this.getNbEmploye()) {
			throw new EntrepriseSatureDeCommerciauxException(this);
		}
		
		Employe temp[] = this.getEmployes();
		temp[this.getNbEmploye()] = employe;
		this.setEmployes(temp);
		this.setNbEmploye(this.getNbEmploye()+1);
	}
}
