package com.pdf.ravishankarcode;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.MalformedURLException;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;

/**
 * 
 * @author Ravishankar.kumar
 *
 */
public class ImagePDF {

	public static final String IMAGE_PDF = "C://temp//Image.pdf";
	public static final String IMAGE_PATH = "C://temp//Image.jpg";
	
	public static void main(String[] args) throws MalformedURLException, FileNotFoundException {

		PdfWriter writer;
        // path to image
        Image image = new Image(ImageDataFactory.create(IMAGE_PATH));
        writer = new PdfWriter(new FileOutputStream(IMAGE_PDF));
        PdfDocument pdfDoc = new PdfDocument(writer);
        Document document = new Document(pdfDoc);       
        // adding image
        document.add(image);              
        document.close();
	}

}
