import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class CreateXMLDom {

	public static void main(String[] args)throws Exception {
		/*--------Initialize dom parser ----*/
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder parser = factory.newDocumentBuilder();
		
		Document doc = parser.newDocument();
		
		Element root = doc.createElement("employees");
		doc.appendChild(root);
		
		Element employee = doc.createElement("employee");
		root.appendChild(employee);
		
		Element name = doc.createElement("name");
		Text name_data = doc.createTextNode("Prakash Singh");
		name.appendChild(name_data);
		employee.appendChild(name);
		
		Element email = doc.createElement("email");
		Text email_data = doc.createTextNode("prakash.singh@acuerconsulting.com");
		email.appendChild(email_data);
		employee.appendChild(email);
		
		Element address = doc.createElement("address");
		Text address_data = doc.createTextNode("HSR layout sector 5 Bengaluru");
		address.appendChild(address_data);
		employee.appendChild(address);
		
		TransformerFactory tFactory = TransformerFactory.newInstance();
		Transformer transformer = tFactory.newTransformer();
		
		FileOutputStream fos = new FileOutputStream("D:/employee.xml");
		transformer.transform(new DOMSource(doc), new StreamResult(fos));
		
		System.out.println("XML file Generated Successfully...");
		
	}

}
