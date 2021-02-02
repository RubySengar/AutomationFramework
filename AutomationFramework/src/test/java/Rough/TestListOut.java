package Rough;

import java.util.ArrayList;
import java.util.List;

import Utilities.ListOut;

public class TestListOut implements ListOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestListOut to = new TestListOut();
		to.listprt();

	}
	
	
	public void listprt() {
		
		List<String> al = this.ListOutput("Krishna", "Shiva", "Rama");
		System.out.println(al);
		System.out.println(al.size());
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ram");
		a1.add("Laxman");
		a1.add("Bharat");
		a1.add("Satrughan");
		this.lstcopy(a1);
		
	}

}
