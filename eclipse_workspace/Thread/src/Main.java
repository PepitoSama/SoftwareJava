import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		// Partie TOTO
//		ArrayList<Compteur> compteurs = new ArrayList<Compteur>();
//		for(int i = 0; i<50; i++) {
//			compteurs.add(new Compteur("Toto " + i, 10));
//		}
//		
//		for(int i = 0; i<50; i++) {
//			Thread t = new Thread(compteurs.get(i));
//			t.start();
//		}
		
		
		// Partie trie
		int[] t = {5, 6, 3, 2, 7, 4, 1};
	    Trieur trieur = new Trieur(t, 0 , 6);
	    trieur.start();
	    try
        { 
	    	trieur.join();
        } 
  
        catch(Exception ex) 
        { 
            System.out.println("Exception has been caught" + ex); 
        } 

	    // A COMPLETER...


	    for (int i = 0; i <t.length; i++) {
	      System.out.print(t[i] + " ; ");
	    }
	    System.out.println();
	}
}
