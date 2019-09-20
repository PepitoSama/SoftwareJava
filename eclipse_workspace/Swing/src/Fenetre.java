import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Fenetre extends JFrame implements ActionListener {
	
	JLabel label = new JLabel("Combien de bouton ");
	JTextArea textArea = new JTextArea(15, 5);
	JButton b1 = new JButton("OK");
	JButton[] buttons = new JButton[15];
	JLabel Nom = new JLabel("Nom : ");
	JLabel Prenom = new JLabel("Prenom : ");
	JLabel Phone = new JLabel("Phone : ");
	JPanel PanelN = new JPanel();
	JPanel PanelS = new JPanel();
	JButton Resume = new JButton("Resumé");
	JButton Quit = new JButton("Quit");

	
	public Fenetre() {
		// Titre de la fenêtre
		super("Une fenêtre");
		
		// Dimension de la fenêtre
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int hauteurEcran = d.height;
		int largeurEcran = d.width;
		setSize(largeurEcran/4, hauteurEcran/2);
		setLocation(largeurEcran/4, hauteurEcran/4);
		
		// Ajout des composants
//		this.add(label, BorderLayout.NORTH);
//		this.add(textArea, BorderLayout.CENTER);
//		this.add(b1, BorderLayout.SOUTH);
		this.setLayout(new GridLayout(3,2));
		
		for (int i=0; i<15; i++) {
			JButton button = new JButton("BUTTON " + (i+1));
			button.addActionListener(this);
			buttons[i] = button;
		}
		
		// Ajout du/des listener
		//b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == b1) {
			String textContent = textArea.getText();
			int buttonNbr = Integer.parseInt(textContent);
			if (buttonNbr < 15) {
				this.remove(label);
				this.remove(textArea);
				this.remove(b1);
				this.setLayout(new GridLayout(buttonNbr,1));
				for (int i=0; i<buttonNbr; i++) {
					this.add(buttons[i]);
				}
				this.setVisible(true);
			} else {
				this.textArea.setText("MOINS QUE CA WLH");
			}
		} if (source == buttons[0]) {
			System.out.println("1");
		} if (source == buttons[1]) {
			System.out.println("2");
		} if (source == buttons[2]) {
			System.out.println("3");
		} if (source == buttons[3]) {
			System.out.println("4");
		} if (source == buttons[4]) {
			System.out.println("5");
		} if (source == buttons[5]) {
			System.out.println("6");
		} if (source == buttons[6]) {
			System.out.println("7");
		} if (source == buttons[7]) {
			
		} if (source == buttons[8]) {
			
		} if (source == buttons[9]) {
			
		} if (source == buttons[10]) {
			
		} if (source == buttons[11]) {
			
		} if (source == buttons[12]) {
			
		} if (source == buttons[13]) {
			
		} if (source == buttons[14]) {
			
		}
	}
}