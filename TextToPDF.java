package com.pdf.ravishankarcode;

import java.io.BufferedReader;
import java.io.FileReader;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

/**
 * 
 * @author Ravishankar.kumar
 *
 */
public class TextToPDF {
	
    public static final String SOURCE_FILE = "C:\\temp\\Test.txt";
    public static final String CREATED_PDF = "C:\\temp\\Result.pdf";
    
    public static void main(String[] args) throws java.io.IOException {

        	
       BufferedReader br = new BufferedReader(new FileReader(SOURCE_FILE));
       PdfDocument pdf = new PdfDocument(new PdfWriter(CREATED_PDF)); 
       
       Document document = new Document(pdf);
       String line;

       while ((line = br.readLine()) != null) {
           document.add(new Paragraph(line));
       }
       
       br.close();
       document.close();   
       
       System.out.println("Awesome Text to PDF Conversion completed!");

    }

}
