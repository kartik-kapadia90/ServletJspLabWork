package com.javabootcamp.day4;

public class CheckingAccount extends Account{
	
	long authorizedOverdraftAmount;
	public CheckingAccount(String name, long authorizedOverdraftAmount) {
		super(name);
		this.authorizedOverdraftAmount=authorizedOverdraftAmount;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean deposit(long amount) {
		// TODO Auto-generated method stub
		transaction("Checking Deposit", amount);
		return true;
	}

	@Override
	public boolean withdraw(long amount) {
		// TODO Auto-generated method stub
		
		long balanceAfterWithdrawal = this.getBalance()-amount;
		
		
		if(balanceAfterWithdrawal>=0)
			transaction("Checking Withdrawal", -amount);
		else if (balanceAfterWithdrawal<0)
		{
			long absoluteVal = Math.abs(balanceAfterWithdrawal);
			if(absoluteVal<=this.authorizedOverdraftAmount)
				transaction("Checking Withdrawal", -amount);
			else
				return false;
		}
	
		
		return true;
	}

}
