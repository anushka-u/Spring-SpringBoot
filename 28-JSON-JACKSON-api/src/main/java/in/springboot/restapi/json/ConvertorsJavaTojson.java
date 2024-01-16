package in.springboot.restapi.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertorsJavaTojson {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		// TODO Auto-generated method stub

		Book book = new Book();
		book.setId(101);
		book.setName("Spring");
		book.setPrice(459.00);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("book.json"), book);
		System.out.println("Conversion Completed......");
	}

}
