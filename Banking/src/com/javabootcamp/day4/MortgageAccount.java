package com.javabootcamp.day4;

public class MortgageAccount extends Account{
	
	public MortgageAccount(String name, long initialAmt) {
		super(name);		
		transaction("Initial Borrowed Amount", -initialAmt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean deposit(long amount) {
		// TODO Auto-generated method stub
		
		transaction("Mortgage Payment", amount);
		return true;
	}

	@Override
	public boolean withdraw(long amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
