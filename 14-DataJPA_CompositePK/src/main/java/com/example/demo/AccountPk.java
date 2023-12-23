package com.example.demo;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class AccountPk implements Serializable {

	private Integer accId;
	private String accType;
	private String holderName;
	public Integer getAccId() {
		return accId;
	}
	public void setAccId(Integer accId) {
		this.accId = accId;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	
	
}
