
package fr.polymontp.guyon.saimond.entreprise;

import java.util.Comparator;

public class NameComparator implements Comparator {
	private int sign;
	public final static int ASCENDING_ORDER = 1;
	public final static int DESCENDING_ORDER = -1;
	
	// CONSTRUCTOR
	public NameComparator (int sign) {
		this.sign = sign;
	}
	
	// METHODS
	public int compare(Object o1, Object o2) {
		return (int)((Employe)o1).getName().compareTo(((Employe)o2).getName()) * this.sign;
	}
}
