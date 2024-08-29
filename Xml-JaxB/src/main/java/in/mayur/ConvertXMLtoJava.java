package in.mayur;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import in.mayur.binding.Person;

public class ConvertXMLtoJava {
	public static void main(String[] args) throws Exception {
		File f= new File("Person.xml");
		JAXBContext context=JAXBContext.newInstance(Person.class);
		
		Unmarshaller unmarshaller= context.createUnmarshaller();
		Object obj= unmarshaller.unmarshal(f);
		Person person =(Person) obj;
		
		System.out.println(person);
	}
}
