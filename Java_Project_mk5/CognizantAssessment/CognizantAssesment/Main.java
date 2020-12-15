package CognizantAssesment;

import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] status = new String[10];
		System.out.println("Enter the Shipment details :");
		Scanner sc = new Scanner(System.in);
		String shipmentdetail = sc.next();
		
		System.out.println("Enter the number of shipment status :");
		int totalstatus = sc.nextInt();
		
		for (int i=0; i<totalstatus; i++) {
			System.out.println("Enter the shipment status" +( i +1) + "details :");
			String statusdetail = sc.next();
			status[i] = statusdetail ;		
			
		}
		
		String[] splitshipmentdetail = shipmentdetail .split(",");
		for (String s : splitshipmentdetail) {
			System.out.println(s);
		}
		

	}

}
