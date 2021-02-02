package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public interface Pdfvalidation {
	
	default void PDFvalidation() throws IOException {
		
		File f = new File("C:\\Users\\Azad\\Desktop\\Personal_Documents\\Cognizant_Documents\\Offer_Letter\\");
		
		  File[] lstfile = f.listFiles();
		  System.out.println("Total Num. of files is -> " + lstfile.length);
		  for(int i = 0; i< lstfile.length; i++ ) {
			  
			 //File s1 = new File("C:\\Users\\Azad\\Desktop\\Personal_Documents\\Cognizant_Documents\\Offer_Letter\\Azad Sengar_CognizantOfferletter.pdf");
			  File s1 = lstfile[i];
			  System.out.println("" + lstfile[i]);
			  
			  PDDocument pdfdoc = PDDocument.load(s1);
			  PDFTextStripper pdftext = new PDFTextStripper();
			  int page = pdfdoc.getNumberOfPages();
			  System.out.println("Total num. of pages is -> " + page);
			  for(int j = 0; j< page; j++) {
				  
				  pdftext.setStartPage(j);
				  pdftext.setEndPage(j);
				  
				  String pdfcontent = pdftext.getText(pdfdoc);
				  System.out.println(pdfcontent);
				  
				  System.out.println("******************************************************");
				  
				  
			  }  
			  
		  }
	}

}
