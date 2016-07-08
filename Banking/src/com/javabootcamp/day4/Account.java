package com.javabootcamp.day4;

public abstract class Account {

	
	private long balance;
	private String holderName;
	
	public Account(String name){
		this.holderName=name;
	}
	
	
	public final void transaction(String message, long amount){
		System.out.println("Holder name: "+ this.holderName+" "+message+" "+amount);
		this.balance+=amount;
	}


	public long getBalance() {
		return balance;
	}

	public abstract boolean deposit(long amount);
	
	public abstract boolean withdraw(long amount);
	
	
}
