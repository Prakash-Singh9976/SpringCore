import java.io.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
public class ReadXMLDom {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		File file = new File("src/employe.xml");
		
		if(file.exists()) {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = factory.newDocumentBuilder();
			
			Document doc = parser.parse(file);
			
			Node root = doc.getDocumentElement();
			System.out.println("Root element is : "+root.getNodeName());
			
			NodeList list = doc.getElementsByTagName("employee");
			System.out.println("No of employee is : "+list.getLength());
			
			for(int i=0;i<list.getLength();i++) {
				System.out.println("------------------------------------------------");
				Node employee = list.item(i);
				
				if(employee.getNodeType()== Node.ELEMENT_NODE) {
					Element emp = (Element) employee;
					
					System.out.println("ID no : "+emp.getElementsByTagName("empno").item(0).getTextContent());
					System.out.println("Employee name : "+emp.getElementsByTagName("empname").item(0).getTextContent());
					System.out.println("Designation : "+emp.getElementsByTagName("designation").item(0).getTextContent());
					//System.out.println("ID no:"+emp.getElementsByTagName("empno").item(0).getTextContent());
				}
			}
			
		}else {
			System.out.println("File doesn't exists....");
		}

	}

}
