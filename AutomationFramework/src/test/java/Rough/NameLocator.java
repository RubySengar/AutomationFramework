package Rough;

import org.openqa.selenium.WebDriver;

public class NameLocator {
	
	static String page1, page2,page3,page4,page5,baseUrl;
	static WebDriver driver;
	public CCA_Assignment test;
	
	public WebDriver setupDriver()
	{
	    /*Replace this comment by the code statement to get the driver*/
		//CCA_Assignment test = new CCA_Assignment();
		 driver = test.getWebDriver();
		 return driver;
	}
	public void navigate1() 
	{
	   driver.navigate().to("https://www.selenium.dev/");
	    
	}
	public void getPageTitle1()
	{
		String page1 = driver.getTitle();
		System.out.println("Page title is > " + page1);
	    
	}
	public void navigate2()
	{
		driver.navigate().to("https://www.google.co.in/");
        
	}
	public void getPageTitle2()
	{
		String page2 = driver.getTitle();
		System.out.println("Page title is > " + page2);
        
	}
	public void navigateBack()
	{
	    driver.navigate().back();
       
	}
	public void getPageTitle3()
	{
		String page3 = driver.getTitle();
		System.out.println("Page title is > " + page3);
        
	}
	public void navigateForward()
	{
	    driver.navigate().forward();
        
	}
	public void getPageTitle4()
	{
		String page4 = driver.getTitle();
		System.out.println("Page title is > " + page4);
        
	}
	public void refreshPage()
	{
	    driver.navigate().refresh();
       
	}
	public void getPageTitle5()
	{
		String page5 = driver.getTitle();
		System.out.println("Page title is > " + page5);
        
	}

	
	public static void main(String[] args)
	{
	    NameLocator namLocator=new NameLocator();
	    //Implement code here
	    namLocator.setupDriver();
	    
	    namLocator.navigate1();
	    
	    namLocator.getPageTitle1();
	    
	    namLocator.navigate2();
	    
	    namLocator.getPageTitle2();
	    
	    namLocator.navigateBack();
	    
	    namLocator.getPageTitle3();
	    
	    namLocator.navigateForward();
	    
	    namLocator.getPageTitle4();
	    
	    namLocator.refreshPage();
	    
	    namLocator.getPageTitle5();
	}

}


