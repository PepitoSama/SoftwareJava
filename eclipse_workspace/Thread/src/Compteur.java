
public class Compteur extends Thread{
	
	private String name;
	private int n;
	
	// CONSTRUCTOR
	public Compteur(String name, int n) {
		this.name = name;
		this.n = n;
	}
	
	public void run() {
		for(int i = 1; i <= this.n; i++) {
			System.out.println(this.name + " : " + i);
			try {
				Thread.sleep((int)(Math.random() * 100));
			} catch (InterruptedException e) {
				System.out.println("Error sleep");
			}
		}
		System.out.println(this.name + " a fini de compter jusqu'à " + this.n);
	}

}
