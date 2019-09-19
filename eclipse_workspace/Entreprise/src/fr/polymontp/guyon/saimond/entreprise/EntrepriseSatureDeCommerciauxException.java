package fr.polymontp.guyon.saimond.entreprise;

public class EntrepriseSatureDeCommerciauxException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 947940181710792549L;
	private Entreprise entreprise;
	
	public EntrepriseSatureDeCommerciauxException(Entreprise entreprise) {
		this.setEntreprise(entreprise);
	}
	
	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	
	public String getMessage() {
		return "Impossible d'ajouter un comercial à cette entreprise car elle ne peut contenir que " + this.getEntreprise().getMax() + " commerciaux";
	}
}
