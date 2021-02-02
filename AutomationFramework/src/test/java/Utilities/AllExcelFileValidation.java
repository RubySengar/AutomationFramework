package Utilities;

import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public interface AllExcelFileValidation {
	
	
	default void ExcelsValidation() {
		
		File f = new File("C:\\Users\\Azad\\eclipse-workspace\\ExcelFiles\\");
		
		  File[] lstfile = f.listFiles();
		  System.out.println("Total Num. of files is -> " + lstfile.length);
		  for(int i = 0; i< lstfile.length; i++ ) {
			  
			 //File s1 = new File("C:\\Users\\Azad\\Desktop\\Personal_Documents\\Cognizant_Documents\\Offer_Letter\\Azad Sengar_CognizantOfferletter.pdf");
			  File s1 = lstfile[i];
			  System.out.println("" + lstfile[i]);
				  
			  System.out.println("******************************************************");
				  
				  
			  } 
		
		
	}
	


}
