package Rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	static WebDriver driver ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Softwares\\Chromedriver_86\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://webapps.tekstac.com/AddressBook/");
		
		WebElement nickname = driver.findElement(By.id("nickname"));
		Actions action = new Actions(driver);
		action.moveToElement(nickname).click().sendKeys("Azad Narayan").build().perform();
		
		WebElement contact = driver.findElement(By.id("contact"));
		//action.moveToElement(contact).click().sendKeys("Lord Krishna Academy").build().perform();
		action.sendKeys(contact, "Lord Krishna Academy").build().perform();
		
		WebElement addbtn = driver.findElement(By.id("add"));
		action.contextClick(addbtn).build().perform();
		
		
		
		 
		 

	}

}
