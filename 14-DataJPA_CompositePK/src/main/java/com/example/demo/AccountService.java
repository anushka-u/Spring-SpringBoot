package com.example.demo;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class AccountService {
	
	private AccountRepository accountRepository;
	
	public AccountService(AccountRepository accountRepository)
	{
		this.accountRepository= accountRepository;
	}
	public void getDataUsingPK() {
		AccountPk pk = new AccountPk();
		pk.setAccId(105);
		pk.setAccType("Current");
		pk.setHolderName("TCS");
		
		
		Optional<Account> findById = accountRepository.findById(pk);
		if(findById.isPresent())
		{
			System.out.println(findById.get());
		}
	}

	public void saveAccountData() {
		AccountPk pk = new AccountPk();
		pk.setAccId(107);
		pk.setAccType("SALARY");
		pk.setHolderName("Microsoft");
		
		Account account = new Account();
		account.setBranchName("Amerpet");
		account.setMinBal(125000.00);
		
		account.setAccPk(pk);
		
		accountRepository.save(account);
	}
}
