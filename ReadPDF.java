package com.pdf.ravishankarcode;

import java.io.IOException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.canvas.parser.PdfTextExtractor;

public class ReadPDF {

	public static final String READ_PDF = "C:\\temp\\hello.pdf";
	
	public static void main(String[] args) throws IOException {
		
        // PDFReader
        PdfReader reader = new PdfReader(READ_PDF);
        PdfDocument pdfDoc = new PdfDocument(reader);
        
        // get the number of pages in PDF
        int noOfPages = pdfDoc.getNumberOfPages();
 
        for(int i = 1; i <= noOfPages; i++) {
            // Extract content of each page
            String contentOfPage = PdfTextExtractor.getTextFromPage(pdfDoc.getPage(i));
            System.out.println(contentOfPage );
        }
        pdfDoc.close();

	}

}
