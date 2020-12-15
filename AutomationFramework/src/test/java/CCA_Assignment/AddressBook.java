package CCA_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressBook {
	
	 static WebDriver driver;
		
		public WebDriver createDriver()
		{
			driver = DriverSetup.getWebDriver();
			return driver;
		}
		
		public void setNewFormValues(String nickname,String contact,String company,String city,String country,String type)
		{
		    //Find the form elements and set values by passing those values from 'main' method. 
		    //Submit form to add the details
			driver.findElement(By.id("nickname")).sendKeys(nickname);
			driver.findElement(By.id("contact")).sendKeys(contact);
			driver.findElement(By.id("company")).sendKeys(company);
			driver.findElement(By.id("city")).sendKeys(city);
			driver.findElement(By.id("country")).sendKeys(country);
			driver.findElement(By.id("type")).sendKeys(type);
			
			driver.findElement(By.id("add")).click();			
			
		}
		
		public String getNewNickName() {
			//Find and return the 'nickname' web element of the row displayed after first submit
			String nickname ;
			nickname = driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[2]/td/input")).getText();
			System.out.println("nickname is >> " + nickname);
			return nickname;
			
			
		}
		
		public String getNewContact() {
			//Find and return the 'contact' web element of the row displayed after first submit
			WebElement contact ;
			String s1 ;
			s1 = driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[2]/td[2]")).getText();
			System.out.println("Newcontact is >> " + s1);
			
			return s1;
			
		}
		
		public WebElement getNewCompany() {
			
			//Find and return the 'company' web element of the row displayed after first submit
			WebElement company ;
			company = driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[2]/td[3]"));
			return company;
			
		}
		
		public WebElement getNewCity() {
			//Find and return the 'city' web element of the row displayed after first submit
			WebElement city ;
			city = driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[2]/td[4]"));
			return city;
			
		}
		
		public WebElement getNewCountry() {
			//Find and return the 'country' web element of the row displayed after first submit
			WebElement country ;
			country = driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[2]/td[5]"));
			return country;
			
		}
		
		public WebElement getNewType() {
			//Find and return the 'type' web element of the row displayed after first submit
			WebElement type ;
			type = driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[2]/td[6]"));
			return type;
		}
		
		
		public void editDetails() {
		    //Find the first radio button and click 
		    //Find edit button and click edit radio0
			driver.findElement(By.id("radio0")).click();
		   driver.findElement(By.id("edit")).click();
		}
//		
//		
		public String getEditNickName() {
		    //Find and return the 'nickname' value in the edit box in the form after cicking edit
			String ednickname;
			ednickname = driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[2]/td[1]")).getText();
			//System.out.println("edit nickname is >> " + ednickname);
			return ednickname;
			
		}
		
		
		public String getEditContact() {
			//Find and return the 'contact' value in the edit box in the form after cicking edit
			String edcontact;
			edcontact = driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[2]/td[2]")).getText();
			//System.out.println("edit contact is >> " + edcontact);
			return edcontact;
		}
		
		
		public String EditNewCompany() {
			//Find and return the 'company' value in the edit box in the form after cicking edit
			String ednewcomp;
			ednewcomp = driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[2]/td[3]")).getText();
			System.out.println(" contact is >> " + ednewcomp);
			return ednewcomp;
		}
		
		
		public String getEditCity() {
			//Find and return the 'city' value in the edit box in the form after cicking edit
			String edcity;
			edcity = driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[2]/td[4]")).getText();
			//System.out.println(" city is >> " + edcity);
			return edcity;
			
		}
		
		
		public String getEditCountry() {
			//Find and return the 'country' value in the edit box in the form after cicking edit
			String edcountry;
			edcountry = driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[2]/td[5]")).getText();
			//System.out.println(" country is >> " + edcountry);
			return edcountry;
		}
		
		
		public String getEditType() {
			//Find and return the 'type' value in the edit box in the form after cicking edit
			String edtype;
			edtype = driver.findElement(By.xpath("//div[@id='result']/table/tbody/tr[2]/td[6]")).getText();
			//System.out.println(" type is >> " + edtype);
			return edtype;
		}
		
		public void setUpdateFormValues(String nickname,String contact,String company,String city,String country,String type)
		{
			//Set form values to update and submit (by passing those values from 'main' method).
			driver.findElement(By.id("add")).click();
			
			driver.findElement(By.id("nickname")).sendKeys(nickname);
			driver.findElement(By.id("contact")).sendKeys(contact);
			driver.findElement(By.id("company")).sendKeys(company);
			driver.findElement(By.id("city")).sendKeys(city);
			driver.findElement(By.id("country")).sendKeys(country);
			driver.findElement(By.id("type")).sendKeys(type);
			
			driver.findElement(By.id("add")).click();
			
			
			
		}
		
		
		
		public void deleteDetails() {
			//Find the SECOND row of address displayed and click the radio button
			//Find delete button and click to delete SECOND row radio1 delete
			driver.findElement(By.id("radio1")).click();
			driver.findElement(By.id("delete")).click();
			
			
		}
		
		public static void main(String[] args) {
			AddressBook ab=new AddressBook();
			ab.createDriver();
			ab.setNewFormValues("Madhav", "Krishna Yaduvanshi", "CTS", "KOLKATA", "INDIA", "FIGHTER");
			ab.getNewNickName();
			ab.getNewContact();
			ab.getNewCompany();
			ab.getNewCity();
			ab.getNewCountry();
			ab.getNewType();
			
			ab.editDetails();
			ab.getEditNickName();
			ab.getEditContact();
			ab.EditNewCompany();
			ab.getEditCity();
			ab.getEditCountry();
			ab.getEditType();
			
			ab.setUpdateFormValues("Shankar", "Bhole Singh", "INFY", "KANPUR", "INDIA", "ENGINEER");
			ab.deleteDetails();
		}

}
