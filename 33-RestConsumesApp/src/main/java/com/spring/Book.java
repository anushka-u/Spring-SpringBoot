package com.spring;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@XmlRootElement
public class Book {
	
	private Integer id;
	private String nameString;
	private Double price;

}
