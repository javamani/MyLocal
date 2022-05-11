package com.towerplus.itextexample;

import java.io.FileOutputStream;
import java.net.URL;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfImageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Document document = new Document();
		try
		{
		    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("PdfImageExample.pdf"));
		    document.open();
		    document.add(new Paragraph("Image Example"));
		 
		    //Add Image
		    Image image1 = Image.getInstance("image/MyImage.jpg");
		    //Fixed Positioning
		    image1.setAbsolutePosition(50f, 350f);
		    //Scale to new height and new width of image
		    image1.scaleAbsolute(200, 200);
		    //Add to document
		    document.add(image1);
		 
		    String imageUrl = "http://www.eclipse.org/xtend/images/java8_logo.png";
		    Image image2 = Image.getInstance(new URL(imageUrl));
		    image2.setAbsolutePosition(350f, 500f);
		    document.add(image2);		 
		    document.close();
		    writer.close();
		    System.out.println("Image execution pdf completed");
		} catch (Exception e)
		{
		    e.printStackTrace();
		}
	}

}
