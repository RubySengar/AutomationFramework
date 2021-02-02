package Rough;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestProperties {
	
static	WebDriver driver;

	public static void main(String[] args) throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub Rough.TestProperties
		
		Properties config = new Properties();
		Properties OR = new Properties();
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\Properties\\Config.properties");
		config.load(fis);
		
		 fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\Properties\\OR.properties");		
		OR.load(fis);
		
		
		System.out.println("Config value is >> " + config.getProperty("browser"));
		System.out.println("OR value is >> "  +  OR.getProperty("enterwebsitebtn"));
		
		System.out.println(System.getProperty("user.dir"));
		
		
		
		
		  

			 
		  
			
			
		
		
		
		
				
				

	}

}
