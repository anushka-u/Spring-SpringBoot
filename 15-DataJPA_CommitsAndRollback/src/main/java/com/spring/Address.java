package com.spring;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="EMP_ADDR_TBL")
@ToString
@Getter
@Setter
public class Address {
	@Id
	@Column(name="ADDR_ID")
	private Integer addrId;
	
	private String city;
	private String street;
	private String country;
	
	@Column(name = "EMP_ID")
	private Integer empId;
	

}
