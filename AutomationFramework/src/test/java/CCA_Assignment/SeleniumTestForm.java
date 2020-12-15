package CCA_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumTestForm {
	
	 //Use this declarations to store respective values
    public static WebDriver driver;
    public static String result;
    public static String msg;
    
    
    public void createDriver() {
        //Implement code to create driver and assign it to 'static' driver variable
    	driver = DriverSetup.getWebDriver();
		//return driver;
    }

    public void testSeleniumTestForm(String weight,String transportMode) throws Exception   {
    	//'weight' and 'transportMode' parameter are used to send the values to the form
        //find the elements in the form and set values as per description. Submit the form.
        //Find the element of the message displayed after submit. Store it in 'msg' variable.
        //Store the 'pass' or 'fail' in the 'result' variable
    	
    	CargoShipping cs = new CargoShipping();
    	driver.findElement(By.id("weight")).sendKeys(weight);
    	
    	if(transportMode.equalsIgnoreCase("Air")) {
    		
    		//air  calculate  Dear Customer, your total shipping cost is $200 TestCase
    		driver.findElement(By.id("air")).click();
    	}
    	
    	else {
    		
    		System.out.println("Mode is out of scope");
    	}
    	
    	driver.findElement(By.id("calculate")).click();
    	
        msg = driver.findElement(By.id("result")).getText();
        
        
        if (msg.equalsIgnoreCase("Dear Customer, your total shipping cost is $200")) {
        	
        	result = "Pass";
        	cs.writeExcelData("cargo.xlsx",result);
        	
        	
        }
        
        else {
        	
        	result = "Fail";
        	cs.writeExcelData("cargo.xlsx",result);
        	
        }
              
         }
    public void closeBrowser(){
        //close the browser
    }

    public static void main(String[] args) throws Exception 
	{ 				
			
		SeleniumTestForm st=new SeleniumTestForm();
		//Add code here
		st.createDriver();
		st.testSeleniumTestForm("200", "Air");
		
	}

}
