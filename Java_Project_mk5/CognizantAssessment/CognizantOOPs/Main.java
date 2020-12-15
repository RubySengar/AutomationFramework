package CognizantOOPs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//******************************************************************CLASS - Sphere***************************************************************	
		
		/*
		 * int radius;
		 * 
		 * Scanner sc = new Scanner(System.in); DecimalFormat df = new
		 * DecimalFormat("#,###,##0.0");
		 * 
		 * System.out.println("Enter radius:"); radius=sc.nextInt();
		 * 
		 * Sphere c = new Sphere(radius);
		 * 
		 * System.out.println("Volume of Sphere is "+df.format(c.calculateVolume()));
		 * sc.close();
		 */
		 
//******************************************************************CLASS - Employee***************************************************************	

		/*
		 * Scanner sc = new Scanner(System.in); PermanentEmployee pem = new
		 * PermanentEmployee();
		 * 
		 * System.out.println("Enter the name:"); String nam = sc.next();
		 * pem.setName(nam);
		 * 
		 * 
		 * System.out.println("Enter the salary:"); float salmain = sc.nextFloat();
		 * pem.setSalary(salmain);
		 * 
		 * System.out.println("Enter the pfpercentage:"); float pfmain = sc.nextFloat();
		 * 
		 * 
		 * sc.close();
		 * 
		 * boolean valid = pem.validateInput(salmain, pfmain);
		 * 
		 * if(valid == true) {
		 * 
		 * System.out.println("Employee Name:" + pem.getName());
		 * 
		 * pem.findNetSalary(); } else {
		 * 
		 * System.out.println("Error!!!  Unable to calculate the NetSalary."); }
		 * 
		 */
				 
//******************************************************************CLASS - Hosteller**************************************************************	

		getHostellerDetails();
		
		
	}
	
	public static Hosteller getHostellerDetails() {
		
		Scanner st = new Scanner(System.in);
		
		Hosteller hst = new Hosteller();
		System.out.println("Enter the Details:" + "\n" + "Student Id");
		int studentid2 = st.nextInt();
		hst.setStudentId(studentid2);
		
		System.out.println("Student Name");
		String name2 = st.next();
		hst.setName(name2);
		
		System.out.println("Department Id");
		int departmentid2 = st.nextInt();
		hst.setDepartmentId(departmentid2);
		
		System.out.println("Gender");
		String gender2 = st.next();	
		hst.setGender(gender2);
		
		System.out.println("Phone Number");
		String phoneno2 = st.next();
		hst.setPhone(phoneno2);
		
		System.out.println("Hostel Name");
		String hostelname2 = st.next();	
		hst.setHostelName(hostelname2);
		
		System.out.println("Room Number");
		int roomno2 = st.nextInt();
		hst.setRoomNumber(roomno2);
		
		System.out.println("Modify Room Number(Y/N)");
		String modrn = st.next();
		
		if ((modrn.equals("Y"))) {
		System.out.println("New Room Number");
		int roomno3 = st.nextInt();
		hst.setRoomNumber(roomno3);
		}
		
		else {
			
		}
		
		System.out.println("Modify Phone Number(Y/N)");
		String modphno = st.next();
	
		if ((modphno.equals("Y"))) {
		System.out.println("New Phone Number");
		String phoneno3 = st.next();
		hst.setPhone(phoneno3);
		}
		
		else {
			
		}
	
		
		System.out.println("The Student Details");
		System.out.println(hst.getStudentId() + " " +  hst.getName() + " " +  hst.getDepartmentId() + " " + hst.getGender() + " " + hst.getPhone() + " " + hst.getHostelName()
		+ " " +  hst.getRoomNumber());		
		
		
		return null;		
		
	}
 
}
