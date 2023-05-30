import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import java.io.*;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ReadXMLSAX {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
	     SAXParserFactory sfactory = SAXParserFactory.newInstance();
	     SAXParser parser = sfactory.newSAXParser();

	     File file = new File("src/employe.xml");
	     
	     MyHandler handler = new MyHandler();
	     
	     parser.parse(file, handler);
	}

}
class MyHandler extends DefaultHandler{

	boolean empno = false;
	boolean empname = false;
	boolean designation = false;
	
	@Override
	public void startDocument() throws SAXException {
		System.out.println("Document Parsing Started!");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("Document Parsing Completed!");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		
		if(qName.equalsIgnoreCase("empno")) {
			empno = true;
		}else if(qName.equalsIgnoreCase("empname")) {
			empname = true;
		}else if(qName.equalsIgnoreCase("designation")) {
			designation = true;
		}
		
		
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {

		if(qName.equals("employee")) {
			System.out.println("--------------------------------------------");
		}
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String data = new String(ch,start,length);
		
		if(empno) {
			System.out.println("Id no : "+data);
			empno = false;
		}else if(empname) {
			System.out.println("Employee name : "+data);
			empname = false;
		}else if(designation) {
			System.out.println("Designation : "+data);
			designation = false;
		}
	}
	
	
	
}
