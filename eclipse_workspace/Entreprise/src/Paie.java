import fr.polymontp.guyon.saimond.entreprise.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Paie {
	public static void main(String[] args) {
		Employe[] employes = new Employe[9];
		// 30%
		employes[0] = new Employe_heure("trente1", 40, 1.3, 9);
		employes[1] = new Employe_heure("trente2", 44, 1.3, 9);
		employes[2] = new Employe_heure("trente3", 47, 1.3, 9);
		
		// 50%
		employes[3] = new Employe_heure("cinq1", 30, 1.5, 9);
		employes[4] = new Employe_heure("cinq2", 20, 1.5, 9);
		employes[5] = new Employe_heure("cinq3", 49, 1.5, 9);
		
		// Commerciaux
		employes[6] = new Commercial("commercial1", 500, 20000);
		employes[7] = new Commercial("commercial2", 500, 30000);
		employes[8] = new Commercial("commercial3");
		((Commercial) employes[8]).setInfosSalaire(500.0, 10000.0);
		
		for (Employe employe : employes) {
			System.out.println(employe.toString());
		}
		
		System.out.println("Chiffre d'affaires total : " + Employe.getSommeCA());
		Directeur directeur = Directeur.creerDirecteur("nomDirecteur", 4000);
		System.out.println(directeur.toString());
		Directeur directeur2 = Directeur.creerDirecteur("nomDirecteur22222", 66666600);
		System.out.println(directeur2.toString());
		
		Entreprise2_impl entreprise = new Entreprise2_impl(10);
		
		for(int i = 0; i < 9; i++) {
			try {
				entreprise.addEmploye(employes[i]);
			} catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		try {
			entreprise.addEmploye(directeur);
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		// Ecriture
		try {
			File outputFile = new File("commercial.txt");
			FileWriter out = new FileWriter(outputFile);
			((Commercial) entreprise.getEmployes()[6]).enregistreToi(out);			
		} catch (Exception e){
			System.out.println("Erreur lors de l'ecriture du fichier String");
		}
		
		// Lecture String
		try {
			File inputFile = new File("commercial.txt");
			FileReader in = new FileReader(inputFile);
			System.out.println(Commercial.lire(in));
		} catch (Exception e) {
			System.out.println("Erreur lors de la lecture du String");
		}
		
		// Ecriture Binaire
		try {
			FileOutputStream fos = new FileOutputStream("commercial");
			((Commercial) entreprise.getEmployes()[6]).enregistreToiBinaire(fos);			
		} catch (Exception e) {
			System.out.println("Erreur lors de l'ecriture binaire");
		}
		
		// Lecture Binaire
		try {
			FileInputStream fis = new FileInputStream("commercial");
			System.out.println(Commercial.lireBinaire(fis));
			
		} catch (Exception e) {
			System.out.println("Erreur lors de la lecture binaire");
		}
			
	}
}
