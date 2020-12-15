package CCA_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	
	static WebDriver driver;
	static String baseUrl; 
	
	public WebDriver setupDriver()
	{
		baseUrl = "http://webapps.tekstac.com/Shopify/";
		driver = DriverSetup.getWebDriver(); 
		driver.get(baseUrl);
	    return driver;
	}
	
	public void setElements() throws InterruptedException
	{
	    driver.findElement(By.id("firstname")).sendKeys("Azad");
	    
	    driver.findElement(By.id("lastname")).sendKeys("Singh");
	    
	    driver.findElement(By.id("username")).sendKeys("Azad Singh");
	    
		Select city = new Select(driver.findElement(By.id("selectcity")));
		
		city.selectByVisibleText("Chennai");
   
		
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@type='radio'][@value='female']")).click();
	    
	    
	    driver.findElement(By.id("pass")).sendKeys("Azad@1234");
	    
	    driver.findElement(By.id("reg")).click();;
	    
	    //driver.close();
	    
	    
	     
	    
       
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Registration reg=new Registration();
		reg.setupDriver();
		reg.setElements();

	}

}
