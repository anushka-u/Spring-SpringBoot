package in.springboot.restapi.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertorsJavaTojson {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		// TODO Auto-generated method stub

		
		Author author = new Author();
		author.setAuthorEmail("xyz@gmail.com");
		author.setAuthorName("xyz");
		author.setPhNumber((long) 987654329);
		
		
		Book book = new Book();
		book.setId(101);
		book.setName("Spring");
		book.setPrice(459.00);
		book.setAuthor(author);
		
		ObjectMapper mapper = new ObjectMapper();
		
		//converting java obj to json and store into a file
		mapper.writeValue(new File("book.json"), book);
		System.out.println("Conversion Completed......");
	}

}
