package com.towerplus.xml.main;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

//Get the list of Xpath string
//https://xmltoolbox.appspot.com/xpath_generator.html
//https://www.novixys.com/blog/modify-xml-file-java/
//https://www.novixys.com/blog/parse-xml-in-java-dom/
//https://www.journaldev.com/1237/java-convert-string-to-xml-document-and-xml-document-to-string
//https://stackoverflow.com/questions/33759441/delete-a-node-and-its-elements-from-an-xml-file-in-java

public class XMLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Document document = null;
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		String fileName = "SampleXML.xml";	
		document = loadXMLFile(documentBuilderFactory,fileName);
		if(null == document) {
			System.out.println("Document is null");
		} else {
			System.out.println("Document is not null");
		}
		List<String>  xpathLists = new ArrayList<String>();
		xpathLists.add("/letter/Employee/Java/MiddleLayer");
		xpathLists.add("/letter/Employee/Java/JMS");
//		xpathLists.add("/letter/logo[@alt=\"Logo of Smith and Company Ltd.\"]@alt");
		
		try {
			removeNodesBasedonXpath(xpathLists,document);
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public static Document loadXMLFile(DocumentBuilderFactory documentBuilderFactory,String fileName ) {
		
		Document document = null;		
		try {
			document = documentBuilderFactory.newDocumentBuilder().parse(new File("C:\\TechLearnings\\XMLModifier\\" + fileName));
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		return document;
	}
	
	
	public static void removeNodesBasedonXpath(List<String>  xpathLists,Document document) throws XPathExpressionException {
		
		XPathFactory xfact = XPathFactory.newInstance();
		XPath xpath = xfact.newXPath();
		for(String xpathStr : xpathLists) {
			Object res = xpath.evaluate(xpathStr, document, XPathConstants.NODESET);
			NodeList nlist = (NodeList)res;
			for (int i = 0 ; i < nlist.getLength() ; i++) {
			    Node node = nlist.item(i);
			    Node parent = node.getParentNode();
			    if ( parent != null ) parent.removeChild(node);
			}
		}		
		System.out.println("*********************REmoval completed");
		TransformDocumentToXML(document);
	}


	private static String TransformDocumentToXML(Document document) throws TransformerFactoryConfigurationError {
		TransformerFactory tf = TransformerFactory.newInstance();		
		 String output = null;
		try {
			Transformer t = tf.newTransformer();		
		//	t.transform(new DOMSource(document), new StreamResult(System.out));
			 StringWriter writer = new StringWriter();
			 t.transform(new DOMSource(document), new StreamResult(writer));
			output = writer.getBuffer().toString();	           
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("*************Transformation completed");
		System.out.println("Results is *************** "+ output);
		return output;
	}
}
