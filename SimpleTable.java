package com.pdf.ravishankarcode;

import java.io.File;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.UnitValue;

public class SimpleTable {

	public static final String DEST = "C://temp//simple_table.pdf";
	
	public static void main(String[] args) throws Exception {
		
        File file = new File(DEST);
        file.getParentFile().mkdirs();
 
        new SimpleTable().manipulatePdf(DEST);

	}

    protected void manipulatePdf(String dest) throws Exception {
        PdfDocument pdfDoc = new PdfDocument(new PdfWriter(dest));
        Document doc = new Document(pdfDoc);
 
        Table table = new Table(UnitValue.createPercentArray(new float[8])).useAllAvailableWidth();
 
        for (int i = 0; i < 16; i++) {
            table.addCell("Ravi");
        }
 
        doc.add(table);
 
        doc.close();
    }
}
