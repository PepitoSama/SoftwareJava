package fr.polymontp.guyon.saimond.entreprise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Commercial extends Employe{
	private double sommeFixe;
	private double chiffreAffaire;
	
	public Commercial(String name) {
		super(name);
	}
	
	public Commercial(String name, double sommeFixe, double chiffreAffaire) {
		super(name);
		setInfosSalaire(sommeFixe, chiffreAffaire);
		this.setSommeCA(Employe.getSommeCA() + chiffreAffaire);
	}
	
	/**
	 * 
	 * @param sommeFixe Somme payé au commercial
	 * @param chiffreAffaire Chiffre d'affaire généré par le commercial
	 */
	public void setInfosSalaire(double sommeFixe, double chiffreAffaire) {
		setSommeFixe(sommeFixe);
		setChiffreAffaire(chiffreAffaire);
	}
	
	public double getSalaire() {
		return this.getSommeFixe() + 0.01*this.getChiffreAffaire();
	}
	
	public double getSommeFixe() {
		return sommeFixe;
	}
	public void setSommeFixe(double sommeFixe) {
		this.sommeFixe = sommeFixe;
	}
	public double getChiffreAffaire() {
		return chiffreAffaire;
	}
	public void setChiffreAffaire(double chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}
	
	public void enregistreToi(FileWriter fileW) throws IOException {
		String infos = this.getName() + "|" + this.getSommeFixe() + "|" + this.getChiffreAffaire();
		fileW.write(infos);
		fileW.close();
	}
	
	public static String lire(FileReader fileR) throws IOException {
		
		BufferedReader in = new BufferedReader(fileR);
		String infos  = new String();
		String buffer = new String();
		while((buffer = in.readLine())!= null) {
			infos += buffer;
		}
		String [] tab = infos.split("\\|");
		return "Le commercial s'appelle " + tab[0] + ", somme fixe : " + tab[1] + " et son chiffre d'affaires est de " + tab[2] + ".";
	}
	
	public void enregistreToiBinaire(FileOutputStream fos) throws IOException {
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeUTF(this.getName() + "|");
		dos.writeDouble(this.getSommeFixe());
		dos.writeUTF("|");
		dos.writeDouble(this.getChiffreAffaire());
		dos.close();
		bos.close();
		fos.close();
	}
	
	public static String lireBinaire(FileInputStream fis) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		String buffer = new String();
		buffer += dis.readUTF();
		buffer += dis.readDouble();
		buffer += dis.readUTF();
		buffer += dis.readDouble();
		return buffer;
	}
}
