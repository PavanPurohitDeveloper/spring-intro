package com.nit.helper;

public class MinBalanceVerifier {
	
	private double minBalance; //to hold Minimum balance value
	
	public MinBalanceVerifier(double minBalance){
		this.minBalance = minBalance;
	}
	
	public boolean check(double newBalance) {
		if(newBalance >= minBalance)
			return true;
		else
			return false;
	}

}
