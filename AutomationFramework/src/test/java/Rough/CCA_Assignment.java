package Rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CCA_Assignment {

	 private static WebDriver driver;
	    public static WebDriver getWebDriver()
		{
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Softwares\\Chromedriver_86\\chromedriver.exe");
			driver = new ChromeDriver();
			//driver.get("https://www.selenium.dev/");
			//driver.navigate().to("https://www.selenium.dev/");
			driver.manage().window().maximize();
		
		    return driver;
		}
	}



