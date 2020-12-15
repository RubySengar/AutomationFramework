package CCA_Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CusRegExcel {
	
	 //Wrire the below values into excel sheet. DO NOT change the values
    static String[] fields1 = new String[] { "Tester", "32" , "XYZ", "2323245235", "test1@gmail.com"};
	static String[] fields2 = new String[] { "Tester1", "33" , "ABC", "4323245125", "test2@gmail.com"};
	static String[] fields3 = new String[] { "Tester2", "34" , "KLM", "1323245235", "test3@gmail.com"};
          
    public static String getExcelPath(String sheetName)  {       
    	//DO NOT change the method signature
	    //Implement code to locate excelsheet. 
	    //Return the filepath
    	
    	
    	sheetName = System.getProperty("user.dir") + sheetName  ;    	
    	//System.out.println("filepath is >> "  + sheetName);
    	return sheetName;
    	
	}

    public static void writeExcelData(String sheetName) throws IOException  {         //DO NOT change the method signature
	    //Implement code to write the given fields1,fields2,fields3 data to excel sheet.
	    //Write from third zero(without any headers)
    	
    	
    	File f1 = new File(sheetName);
		FileOutputStream fos = null ;
		try {
			fos = new FileOutputStream(f1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFWorkbook wb1 = new XSSFWorkbook();
		XSSFSheet sh2    = wb1.createSheet("customervalid");
		
		System.out.println("Size of array is >> " + fields1.length);
		System.out.println("Value of array is >> " + fields1[1]);
		sh2.createRow(0);
		
		for(int i = 0; i<fields1.length; i++) {
			
		sh2.getRow(0).createCell(i).setCellValue(fields1[i]);
	
		
		}
		
		
		sh2.createRow(1).createCell(0).setCellValue("Tester1");
		sh2.getRow(1).createCell(1).setCellValue("33");
		sh2.getRow(1).createCell(2).setCellValue("ABC");
		sh2.getRow(1).createCell(3).setCellValue("4323245125");
		sh2.getRow(1).createCell(4).setCellValue("test2@gmail.com");
		
		sh2.createRow(2).createCell(0).setCellValue("Tester2");
		sh2.getRow(2).createCell(1).setCellValue("34");
		sh2.getRow(2).createCell(2).setCellValue("KLM");
		sh2.getRow(2).createCell(3).setCellValue("1323245235");
		sh2.getRow(2).createCell(4).setCellValue("test3@gmail.com");
		
		wb1.write(fos);
		fos.close();
		wb1.close();
		
		
    }
    
    public static void main(String[] args) throws Exception 
	{ 
	    CusRegExcel customer = new CusRegExcel();
	    //Add required code
	    String s1 = customer.getExcelPath("azad_Writer.xlsx");
	    customer.writeExcelData(s1);
	    System.out.print("Mission Accomplished");
	}

}
