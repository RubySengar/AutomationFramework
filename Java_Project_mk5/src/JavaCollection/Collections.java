package JavaCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;

public class Collections {
	
	public static void arraylst() {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Ruby");
		al.add("Singh");
		al.add("Sengar");
		al.add("is married to Azad Singh");
		
		for(String s1 : al) {
			System.out.println(s1);
			
		}
		
		java.util.Collections.sort(al);
	
		for(String s2 : al) {
			System.out.println("The Sorting is followed as Below: ");
		System.out.println(s2);
		
		
		
		
	}
		
	}	
	
	
	
	public static void hashmape() {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
				
		hmap.put(0, "Arihant");
		hmap.put(1, "Arighat");
		hmap.put(2, "Aridhman");
		
		System.out.println(hmap.keySet());
		System.out.println(hmap.values());
		System.out.println("Entry set is >>> " + hmap.entrySet());
		System.out.println("Key set is >>> " + hmap.keySet());
			
		
		
	}
	
	
	
	@SuppressWarnings("unchecked")
	public static void vectore() {
		
		Vector<String> vec = new Vector<String>(3,2);
		Vector<String> vec1 = new Vector<String>(3,2);
		vec.add("Kanishka");
		vec.addElement("Kushan");
		vec.add("Hindikush");
		vec.addElement("Karakoram");
		
		//vec.removeAllElements();
		vec.addAll(vec);
		vec1 = (Vector<String>) vec.clone();
		
		for(String s2 : vec) {
		System.out.println(s2);
		
	}
		
		for(String s3 : vec1) {
		System.out.println(s3);
		
	}
		
		
	}
	
	 
	
	public static void property() {
		
		Properties pop = new Properties();
		pop.put("Destroyer", "Vishakhapatnam Class");
		pop.put("Frigate", "Shivalik Class");
		pop.put("Corvette", "Kamorta Class");
		pop.put("Oil_Replenishment", "Aditya Class");
		
		System.out.println(pop.getProperty("Destroyer"));
		System.out.println("Keys are >>> " + pop.keys());
		System.out.println("Values are >>> " + pop.values());
		System.out.println("Entryset are >>> " + pop.entrySet());
		System.out.println("Elements are >>> " + pop.elements());
		
	}
	
	
	
	public static void hashtable() {
		
		Hashtable<String, String> hst = new Hashtable<String, String>();
		
		System.out.println("Kashtable concept began >>> >>>>>>>>>>> >>>>>>> >>>>>>>>>> >>>>>>>>>> >>>>>>>>  " );
		hst.put("Destroyer", "Kolkata Class");
		hst.put("Frigate", "Talwar Class");
		hst.put("Corvette", "Khanjar Class");
		hst.put("Oil_Replenishment", "Shakti Class");
		
		System.out.println("Keys are >>> " + hst.keys());
		System.out.println("Values are >>> " + hst.values());
		System.out.println("Entryset are >>> " + hst.entrySet());
		System.out.println("Elements are >>> " + hst.elements());
		
	}
	


}
