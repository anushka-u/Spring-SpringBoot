package in.springboot;

import lombok.Data;

@Data
public class Order {
	
	private Integer orderId;
	private String orderedBy;
	private String orderStatus;
	private double orderAmt;
	

}
