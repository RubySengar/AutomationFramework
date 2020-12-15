package CCA_Assignment;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CargoShipping {
	
	 
    public static void writeExcelData(String fileName,String result) throws Exception { //Do not change the method signature
        //Write the Test result to the excel sheet
    	
    	fileName = System.getProperty("user.dir") + "\\"  +  fileName  ;
    	File f1 = new File(fileName);
    	
    	FileOutputStream fos = new FileOutputStream(f1);
    	
    	XSSFWorkbook wb1 = new XSSFWorkbook();
		XSSFSheet sh2    = wb1.createSheet("TestCase");
		sh2.createRow(0).createCell(0).setCellValue(result);
		
		wb1.write(fos);
		fos.close();
		wb1.close();
    	
    	 
    }
    

}
