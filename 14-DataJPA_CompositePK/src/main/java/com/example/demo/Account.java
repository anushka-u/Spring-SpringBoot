package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "BANK_ACCOUNT")
public class Account {

	@Column(name = "BRANCH_NAME")
	private String branchName;
	
	@Column(name = "MIN_BAL")
	private Double minBal;
	
	@EmbeddedId
	private AccountPk accPk;

	public AccountPk getAccPk() {
		return accPk;
	}

	public void setAccPk(AccountPk accPk) {
		this.accPk = accPk;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Double getMinBal() {
		return minBal;
	}

	public void setMinBal(Double minBal) {
		this.minBal = minBal;
	}
	
}
