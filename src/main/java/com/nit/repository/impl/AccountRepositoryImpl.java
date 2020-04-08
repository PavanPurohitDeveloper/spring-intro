package com.nit.repository.impl;

import com.nit.repository.AccountRepository;

public class AccountRepositoryImpl implements AccountRepository {

	public double fetchBalance(int acctno) {
		System.out.println("In FetchBalance");
		return 1000.0;
	}

	public void updateBalance(int acctno, double balance) {
		System.out.println("In UpdateBalance");
	}

}
