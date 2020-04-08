package com.nit.service;

import com.nit.helper.MinBalanceVerifier;
import com.nit.repository.AccountRepository;

public class AccountService {
	
	private AccountRepository accountRepository;  //mandatory dependency
	private MinBalanceVerifier minBalanceVerifier; //optional dependency
	
	//constrcutor based to Inject the dependency
	public AccountService(AccountRepository accountRepository){  //injection point
		this.accountRepository = accountRepository;
	}
	
	//setter method to Inject the dependency
	public void setMinBalanceVerifier(MinBalanceVerifier minBalanceVerifier){ //injection point
		this.minBalanceVerifier = minBalanceVerifier;
	}
	
	public void deposit(int acctno, double balance) {
		System.out.println("in deposit");
		accountRepository.updateBalance(acctno, balance);
	}
	
	public void withdraw(int acctno, double amt) {
		double mainBalance = accountRepository.fetchBalance(acctno);
		double newBalance = mainBalance - amt;
		
		if(minBalanceVerifier.check(newBalance)) {
			accountRepository.updateBalance(acctno, newBalance);
		} else {
			System.out.println("Couldn't process withdraw operation");
		}
	}

}
