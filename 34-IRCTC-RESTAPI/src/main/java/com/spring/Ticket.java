package com.spring;

import org.apache.logging.log4j.util.StringBuilderFormattable;

import lombok.Data;

@Data
public class Ticket {
	
	private Integer ticketId;
	private String pnr;
	private String ticketStatus;
	

}
