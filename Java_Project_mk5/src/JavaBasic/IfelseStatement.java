package JavaBasic;

public class IfelseStatement {
	
	
	public static void Decision() throws Exception {
		
	int i = 0;
	
	if(i == 1) {
		System.out.println("Integer Detected");
	}
	
	else if (i == 2) {
		System.out.println("Integer Detected at 2nd phase");
	}
	
	else {
		System.out.println("Integer Undetected");
		//throw new Exception("Integer Undetected");
	}
		
		
	}

}
