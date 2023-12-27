package com.spring;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer PassportId;
	
	private String passportNumber;
	
	private LocalDate issuedDate;
	
	private LocalDate expiryDate;
	
	@OneToOne
	@JoinColumn(name = "person_id")
	private Person person;
	
}
