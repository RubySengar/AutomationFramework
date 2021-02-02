package Rough;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Check {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("a");
		a1.add("b");
		a1.add("c");
		a1.add("d");
		a1.add("e");
		a1.add("f");
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("");
		a2.add("a");
		a2.add("b");
		a2.add("c");
		a2.add("x");
		a2.add("");
		a2.add("");
		a2.add("");
		
		System.out.println(a2);
		
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		hmap.put(2, "Tulsi");
		hmap.put(3, "Neem");
		hmap.put(1, "Aluveera");
		
		System.out.println(hmap);
		
		TreeMap<Integer,String> tmap = new TreeMap<Integer,String>();
		tmap.put(2, "Tulsi");
		tmap.put(3, "Neem");
		tmap.put(1, "Aluveera");
		
		System.out.println(tmap);
		
		foldercreation();
		
		
		}
	
	
	private static void foldercreation() throws FileNotFoundException {
		
		File f1 = new File("C:\\Users\\Azad\\Desktop\\AutomatedFolder");
		
		try {
			
			f1.mkdir();
			System.out.println("Directory Created");
			
			
		
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
	
	}

}
