package com.pdf.ravishankarcode;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

/**
 * 
 * @author Ravishankar.kumar
 *
 */
public class HelloWorld 
{
	public static final String DEST = "C:\\temp\\hello.pdf";
	
    public static void main( String[] args ) throws FileNotFoundException
    {
        PdfDocument pdf = new PdfDocument(new PdfWriter(DEST));
        Document document = new Document(pdf);
        String line = "Hello! Welcome to iTextPdf";
        document.add(new Paragraph(line));
        document.close();

        System.out.println("Awesome PDF just got created.");
    }
}
