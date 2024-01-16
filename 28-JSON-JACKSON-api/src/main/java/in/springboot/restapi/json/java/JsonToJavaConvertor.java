package in.springboot.restapi.json.java;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.springboot.restapi.json.Book;

public class JsonToJavaConvertor {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		// TODO Auto-generated method stub

		File jsonFile = new File("book.json");
		
		ObjectMapper mapper = new ObjectMapper();
		
		//readValue() is used to convert JSON value into Java object
		Book book = mapper.readValue(jsonFile, Book.class);
		
		System.out.println(book);
	}

}
