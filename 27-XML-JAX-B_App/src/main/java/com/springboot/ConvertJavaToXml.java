package com.springboot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Result;

public class ConvertJavaToXml {
	public static void main(String... args) throws JAXBException, FileNotFoundException
	{
		Person person = new Person();
		person.setId(101);
		person.setName("Johnny");
		person.setAge(28);
		person.setPhNumber("9098897654");
		
		   JAXBContext instanceContext=   JAXBContext.newInstance(Person.class);
		   Marshaller marshaller =instanceContext.createMarshaller();
		   marshaller.marshal(person, new FileOutputStream("Person.xml"));
		   System.out.println("Marshalling Completed");
	}

}
