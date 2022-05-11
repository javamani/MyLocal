package com.towerplus.itextexample;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfFileAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Document document = new Document();
		try
		{
		    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("PdfFileAttribute.pdf"));
		    document.open();
		    document.add(new Paragraph("Some content here"));
		 
		    //Set attributes here
		    document.addAuthor("Manikandan Marimuthu");
		    document.addCreationDate();
		    document.addCreator("HowToDoInJava.com");
		    document.addTitle("Set Attribute Example");
		    document.addSubject("An example to show how attributes can be added to pdf files.");
		 
		    document.close();
		    writer.close();
		} catch (Exception e)
		{
		    e.printStackTrace();
		}
	}

}
