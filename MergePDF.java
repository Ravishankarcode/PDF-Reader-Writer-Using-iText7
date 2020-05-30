package com.pdf.ravishankarcode;

import java.io.IOException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.utils.PdfMerger;

/**
 * 
 * @author Ravishankar.kumar
 *
 */
public class MergePDF {

    public static final String SRC_PDF1 = "C://temp//PDF1.pdf";
    public static final String SRC_PDF2 = "C://temp//PDF2.pdf";
    public static final String MERGED_PDF = "C://temp//Merged.pdf";
    
	public static void main(String[] args) throws IOException {
		
        PdfDocument pdfDoc = new PdfDocument(new PdfWriter(MERGED_PDF));               
        PdfMerger merger = new PdfMerger(pdfDoc);
        PdfDocument PDF1 = new PdfDocument(new PdfReader(SRC_PDF1));
        PdfDocument PDF2 = new PdfDocument(new PdfReader(SRC_PDF2));
        merger.merge(PDF1, 1, PDF1.getNumberOfPages());
        merger.merge(PDF2, 1, PDF2.getNumberOfPages());
           
        PDF1.close();
        PDF2.close();
        pdfDoc.close();

	}

}
