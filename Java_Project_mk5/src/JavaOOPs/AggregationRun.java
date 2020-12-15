package JavaOOPs;

public class AggregationRun  {
	
	
	  int rollNum;
	   String studentName;
	   //Creating HAS-A relationship with Address class
	   Aggregation studentAddr; 
	   
	   AggregationRun(int roll, String name, Aggregation addr){
	       this.rollNum=roll;
	       this.studentName=name;
	       this.studentAddr = addr;
	   }
	   
	   public static void Aggregate () {
		   
		   System.out.println("Aggregation Concept Began >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		   Aggregation ad = new Aggregation(55, "Agra", "UP", "India");
		   AggregationRun obj = new AggregationRun(123, "Chaitanya", ad);
	       System.out.println(obj.rollNum);
	       System.out.println(obj.studentName);
	       System.out.println(obj.studentAddr.streetNum);				//	OR 	 System.out.println(ad.streetNum); 
	       System.out.println(ad.city); 								//  OR   System.out.println(obj.studentAddr.city);
	       System.out.println(ad.state);           						//  OR   System.out.println(obj.studentAddr.state);
	       System.out.println(obj.studentAddr.country);
	   }

}
