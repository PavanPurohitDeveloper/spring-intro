package com.nit.repository;

public interface AccountRepository {

	public double fetchBalance(int acctno);
	public void updateBalance(int acctno, double balance);
}
