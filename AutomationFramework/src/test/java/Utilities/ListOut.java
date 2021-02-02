package Utilities;

import java.util.ArrayList;

public interface ListOut {
	
	
	default ArrayList<String> ListOutput(String s1, String s2, String s3) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s1);
		al.add(s2);
		
		
		return al;
		
	}
	
	
	default void lstcopy(ArrayList<String> a1) {
		
		
		ArrayList<String> a2 = new ArrayList<String>();
		
		
		
		a2.addAll(a1);
		
		System.out.println(a2);
	}

}
