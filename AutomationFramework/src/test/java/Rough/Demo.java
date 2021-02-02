package Rough;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Utilities.AllExcelFileValidation;
import Utilities.Pdfvalidation;
import Utilities.dataBase;

public class Demo implements dataBase, Pdfvalidation, AllExcelFileValidation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Demo obj = new Demo();
		//obj.Excelvalidation();
		obj.listofFiles();

	}
	
	
	
	
public void Excelvalidation() throws Exception {
		
		ArrayList<String> al = this.DatabaseQuery();
		
		File f = null;
		FileInputStream fis = null;
		
		//f = new File("C:\\Users\\Azad\\Desktop\\azad.xlsx");
		fis = new FileInputStream("C:\\Users\\Azad\\Desktop\\azad.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1   = wb.getSheet("Demo");
		
		int row  = sh1.getLastRowNum();
		
		for (int j = 1; j<= row; j++) {
			
			String s1 = sh1.getRow(j).getCell(0).getStringCellValue();
			if(al.contains(s1) ) {
				
				System.out.println("policy num. is present in the DB -> " + s1);
			}
			else {
				
				throw new Exception("policy num. is not present in the DB " + s1);
			}
			
			
			
		}
	}	


public void listofFiles() throws IOException, ClassNotFoundException, SQLException {
	  
	 //this.PDFvalidation();
	// this.jdbcdatabaseresult();
	this.ExcelsValidation();
	  
}
  
  
  
  
  
  
  
  
  
  
}

