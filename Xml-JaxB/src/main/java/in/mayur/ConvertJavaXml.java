package in.mayur;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

import in.mayur.binding.Person;

public class ConvertJavaXml {
	public static void main(String[] args) throws Exception {
		
		Person p=new Person();
		p.setId(1);
		p.setName("Mayur");
		p.setAge(90);
		p.setPhno(7057707336l);
		
		JAXBContext instance= JAXBContext.newInstance(Person.class);
		Marshaller marshaller = instance.createMarshaller();
		marshaller.marshal(p, new File("Person.xml"));
		System.out.println("Success");
	}
}
