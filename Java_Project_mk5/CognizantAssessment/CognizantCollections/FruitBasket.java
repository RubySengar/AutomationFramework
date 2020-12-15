package CognizantCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

@SuppressWarnings("unchecked")
public class FruitBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = 0 ;
		int key = 0;
		String value ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the  no of fruits pair you want to store:");
		size = sc.nextInt();
		
		HashMap<Integer,String> Unsortedfruits = new HashMap<Integer,String>();
		
		for (int i = 0; i < size; i++) {
		
			System.out.println("Enter the  Key" + (i+1));
			key = sc.nextInt();
			
			System.out.println("Enter the  Value" +  (i+1));
			value = sc.next();
			Unsortedfruits.put(key, value);
			
		}
		
		//System.out.println("Unsorted list of fruits are -> " + Unsortedfruits);
		
		Map<Integer,String> sortedfruits = new TreeMap<Integer,String>(Unsortedfruits);
		
		System.out.println("Fruit Details");
		
	      Set set = sortedfruits.entrySet(); 
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print(mentry.getKey() + " ");
	         System.out.println(mentry.getValue());
		
		

	} 
	}
	

}
