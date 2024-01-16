package in.springboot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class Main {

	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		// TODO Auto-generated method stub

		Order order = new Order();
		order.setOrderAmt(890.00);
		order.setOrderedBy("Shruthi");
		order.setOrderId(101);
		order.setOrderStatus("In Process");
		
		Gson gson = new Gson();
		String json= gson.toJson(order);
		System.out.println(json);
		
		//gson.fromJson(new FileReader(new File("order.json")), Order.class);
		
	}

}
