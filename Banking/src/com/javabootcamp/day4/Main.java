package com.javabootcamp.day4;

public class Main {

	
	public static void main(String[] args) {
		
		
		MortgageAccount m1 = new MortgageAccount("mortgage", 100000);
		CheckingAccount ch1 = new CheckingAccount("Checking1", 200);
		CheckingAccount ch2 = new CheckingAccount("Checking2", 1000);
		
		Account[] arr = new Account[3];
		arr[0]=m1;
		arr[1]=ch1;
		arr[2]=ch2;
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i].deposit(1000));
			System.out.println(arr[i].withdraw(500));
			System.out.println(arr[i].withdraw(1000));
			System.out.println(arr[i].withdraw(2000));
		}
		
	}
}
