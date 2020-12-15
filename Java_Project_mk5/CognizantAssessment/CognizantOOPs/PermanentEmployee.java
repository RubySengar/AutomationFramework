package CognizantOOPs;

public class PermanentEmployee extends Employee {
	 
	private float pfpercentage = 0;
	private float pfamount = 0;
	
	
	
	public boolean validateInput(float salary2, float pfpercent) {
		
		boolean flag = true;					
		this.pfpercentage = pfpercent;
				
		if(salary2>0 && pfpercent>=0) {
			
			return flag;
			
		}
		else {
			
			flag = false;
		}	
		
		return flag;
		
	}
	
	public void  findNetSalary() {
		
	
		float sal2 = this.getSalary();
		pfamount = (pfpercentage*sal2)/100 ; 
		this.setPfAmount(pfamount);
		
		float netsal2 = sal2 - pfamount ; 
		System.out.println("PF Amount:" + this.getPfAmount());
		System.out.println("Netsalary:" + netsal2);
		
						
	}
	
	public void setPfAmount(float netsalary1) {
		this.pfamount = netsalary1;
		
		
	}
	
	public float getPfAmount() {
		return pfamount;
		
	}
	
	public void setPfpercentage(float netsalary1) {
		this.pfpercentage = netsalary1;
		
	}
	
	public float getPfpercentage() {
		return pfpercentage;
		
	}
	
	

	


}
