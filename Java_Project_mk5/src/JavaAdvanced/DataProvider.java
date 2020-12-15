package JavaAdvanced;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;

public class DataProvider {
	
	public static void configfile() throws IOException {
		
		 Properties config = new Properties();
		 File f = new File("C:\\Users\\Azad\\eclipse-workspace\\UIAutomation_mk2\\Properties\\DataProviders\\Config");
		 FileInputStream fis = new FileInputStream(f);
		 config.load(fis);
		 
		 System.out.println("Browser from config file is >> "  +  config.getProperty("browser"));
		 System.out.println("URL from config file is >> "  +  config.getProperty("URL"));
	}

	
	public static void textDataFile() throws IOException {
		
		Properties text = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Azad\\Desktop\\Personal_Documents\\TextData.txt");
		text.load(fis);
		
		System.out.println("Browser from textdata file is >>" + text.getProperty("browser"));
		System.out.println("URL from textdata file is >>" + text.getProperty("URL"));
		
		
		
	}
	
	
}
