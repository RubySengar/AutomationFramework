package CCA_Assignment;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Ex2TestNG {
	
	
	public static WebDriver driver;
	String name;
	String password;
	

	@BeforeSuite
    public void createDriver() {                  //DO NOT change the method signature
		//Create driver and assign it to 'static' driver variable
    	driver = DriverSetup.getWebDriver();
    	driver.navigate().to("http://webapps.tekstac.com/Shopify/");
	}
	
	@BeforeMethod
	public void resetName() {                   //DO NOT change the method signature
		//NO implementation required. ONLY proper annotation is required.
	}	
	
	@AfterGroups
	public void signin() {                       //DO NOT change the method signature
		System.out.println("signin");
		
	}
	
	 @Test(priority = 1)
    public void initializeName() {                //DO NOT change the method signature
		name="Tom";
	}
	
    @Test(priority = 0)
	public void initializePassword() {           //DO NOT change the method signature
		password="Tom";
	}
	
	public void closeBrowser() {                //DO NOT change the method signature
		//close the driver
	}
	
	public void invokeTest() {                 //DO NOT change the method signature
		//Implement code to invoke test using TestNG
	}

	public static void main(String[] args) {
	    Ex2TestNG ex2=new Ex2TestNG();
	    //Implement any required code.
	    ex2.createDriver();
	}

  
	
	

}
