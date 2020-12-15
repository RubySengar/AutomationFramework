package CognizantOOPs;

public class Student {
	
	private int 	studentId ;
	private String 	studentName ;
	private String 	studentAddress ;
	private String 	collegeName ;
	
	public Student(int studentid,String studentname, String studentaddress) {
		this.studentId = studentid;
		this.studentName = studentname;
		this.studentAddress = studentaddress;
		this.collegeName   =  "NIT";
		
	}
	
	public Student(int studentid,String studentname, String studentaddress, String collegename) {
		this.studentId = studentid;
		this.studentName = studentname;
		this.studentAddress = studentaddress;
		this.collegeName   =  collegename;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public String getStudentAddress() {
		return studentAddress;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	
	

}
