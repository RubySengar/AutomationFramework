package CCA_Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	
	 private static WebDriver driver;
	 
	 public static WebDriver getWebDriver()
		{
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Softwares\\Chromedriver_86\\chromedriver.exe");
			driver = new ChromeDriver();
			//driver.get("http://webapps.tekstac.com/Cargo_Shipping_Cost/");
			//driver.navigate().to("https://www.selenium.dev/");
			driver.manage().window().maximize();
		    return driver;
		}

}
