package CognizantOOPs;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getStudentDetails();

		
	}
	
	public static Student getStudentDetails() {
		
		Student st1 = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student's Id:");
		int studentid1 = sc.nextInt();
		
		System.out.println("Enter Student's Name:");
		String studentname = sc.next();
		
		System.out.println("Enter Student's address:");
		String studentadd = sc.next();
		
		System.out.println("Whether the student is from NIT(Yes/No):");
		String collegename1 = sc.next();		
		
		
		if(collegename1.equalsIgnoreCase("YES")) {
			
			 st1 = new Student(studentid1, studentname, studentadd);
			System.out.println("Student id:" + st1.getStudentId());
			System.out.println("Student name:" + st1.getStudentName());
			System.out.println("Address:" + st1.getStudentAddress());
			System.out.println("College name:" + st1.getCollegeName());
			
		}
		
		else if(collegename1.equalsIgnoreCase("NO")) {
			
			System.out.println("Enter the college name:");
			String collegename2 = sc.next();
			st1 = new Student(studentid1, studentname, studentadd, collegename2);
			System.out.println("Student id:" + st1.getStudentId());
			System.out.println("Student name:" + st1.getStudentName());
			System.out.println("Address:" + st1.getStudentAddress());
			System.out.println("College name:" + st1.getCollegeName());
			
		}
		
		else {
			
			System.out.println("Wrong Input");
		}
		
		sc.close();
		
		return st1;
		
		
		
	}

}
