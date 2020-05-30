package com.pdf.ravishankarcode;

import java.io.File;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
/**
 * 
 * @author Ravishankar.kumar
 *
 */
public class BackgroundImage {

    public static final String DEST = "C://temp//background_image.pdf";
    
    public static final String IMAGE = "C://temp//Ravi.jpg";
    
	public static void main(String[] args) throws Exception {

        File file = new File(DEST);
        file.getParentFile().mkdirs();
 
        new BackgroundImage().manipulatePdf(DEST);
	}

    protected void manipulatePdf(String dest) throws Exception {
        PdfDocument pdfDoc = new PdfDocument(new PdfWriter(dest));
        PageSize pageSize = PageSize.A4.rotate();
        Document doc = new Document(pdfDoc, pageSize);
 
        PdfCanvas canvas = new PdfCanvas(pdfDoc.addNewPage());
        canvas.addImage(ImageDataFactory.create(IMAGE), pageSize, false);
 
        doc.add(new Paragraph("Ravishankar!"));
 
        doc.close();
    }
}
