package fr.polymontp.guyon.saimond.entreprise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TranspositionMap {
	
	
	private HashMap<String, String> map = new HashMap<String, String>();
	
	public TranspositionMap() {
		map.put("Fred", "Wilma");
		map.put("Barney", "Betty");
		map.put("Tristan", "Isolde");
		map.put("Romeo", "Juliette");
	}
	
	public void transposer() {
		Set set = this.map.entrySet();
		Iterator it = set.iterator();
		HashMap<String, String> newMap = new HashMap<String, String>();
		
		while(it.hasNext()) {
			Map.Entry<String, String> temp = (Entry<String, String>) it.next();
			newMap.put(temp.getValue(), temp.getKey());
		}
		this.setMap(newMap);
	}
	
	public HashMap<String, String> getMap() {
		return map;
	}

	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}
}
