package com.pdf.ravishankarcode;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.EncryptionConstants;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.WriterProperties;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
/**
 * 
 * @author Ravishankar.kumar
 *
 */
public class NewPDFPasswordProtected {

    public static final String CREATED_PDF = "C:\\temp\\New.pdf";
    final static String USER_PASSWORD = "user";
    final static String OWNER_PASSWORD = "owner";
    
	public static void main(String[] args) throws FileNotFoundException {

        PdfWriter writer = new PdfWriter(CREATED_PDF, new WriterProperties()
                    .setStandardEncryption(USER_PASSWORD.getBytes(), OWNER_PASSWORD.getBytes(), 
                     EncryptionConstants.ALLOW_PRINTING, 
                     EncryptionConstants.ENCRYPTION_AES_128 | EncryptionConstants.DO_NOT_ENCRYPT_METADATA));
        
        PdfDocument pdf = new PdfDocument(writer);    
        Document document = new Document(pdf); 
        document.add(new Paragraph("Password protected PDF where only content printing is permitted content can't be copied."));
        document.close();        
        
        System.out.println("Awesome Password Protected New PDF just got created!");
	}
}
