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
//		int[] t = {5, 6, 3, 2, 7, 4, 1};
//	    Trieur trieur = new Trieur(t, 0 , 6);
//	    trieur.start();
//	    try
//        { 
//	    	trieur.join();
//        } 
//  
//        catch(Exception ex) 
//        { 
//            System.out.println("Exception has been caught" + ex); 
//        }
		
		// Implements Runnable
//		int[] t = {5, 6, 3, 2, 7, 4, 1};
//	    Trieur trieur = new Trieur(t, 0 , 6, null);
//	    Thread monThread = new Thread(trieur);
//	    monThread.start();
//	    try {
//			monThread.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	    for (int i = 0; i <t.length; i++) {
//	      System.out.print(t[i] + " ; ");
//	    }
//	    System.out.println();
		
		// ** Matrice **
		int[][] tab1 = {{ 2, 3, 0},{ 3, 4, 1}};
		int[][] tab2 = {{ 2, 3},{ 3, 4}, {1, 2}};
		
		Matrice m1 = new Matrice(tab1, 2, 3);
		Matrice m2 = new Matrice(tab2, 3, 2);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		
		Matrice m3 = m1.produitMatrice(m1, m2);
		System.out.println(m3.toString());


	}
}
