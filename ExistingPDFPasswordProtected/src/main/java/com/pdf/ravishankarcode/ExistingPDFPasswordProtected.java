package com.pdf.ravishankarcode;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.kernel.pdf.EncryptionConstants;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.WriterProperties;
/**
 * 
 * @author Ravishankar.kumar
 *
 */
public class ExistingPDFPasswordProtected {

	public static final String OLD_UNPROTECTED_PDF = "C:\\temp\\Old.pdf";
    public static final String NEW_PROTECTED_PDF = "C:\\temp\\New.pdf";
    final static String USER_PASSWORD = "user";
    final static String OWNER_PASSWORD = "owner";
    
	public static void main(String[] args) throws IOException {

        // Read existing PDF
        PdfReader reader = new PdfReader(OLD_UNPROTECTED_PDF);
        WriterProperties props = new WriterProperties().setStandardEncryption(
        		                USER_PASSWORD.getBytes(), 
        		                OWNER_PASSWORD.getBytes(), 
                                EncryptionConstants.ALLOW_PRINTING,
                                EncryptionConstants.ENCRYPTION_AES_128 | EncryptionConstants.DO_NOT_ENCRYPT_METADATA);
        // Write to PDF along with encryption properties
        PdfWriter writer = new PdfWriter(new FileOutputStream(NEW_PROTECTED_PDF), props);
        PdfDocument pdfDoc = new PdfDocument(reader, writer);
        pdfDoc.close();       
        
        System.out.println("Awesome Password Protected Existing PDF just got created!");
	}
}
