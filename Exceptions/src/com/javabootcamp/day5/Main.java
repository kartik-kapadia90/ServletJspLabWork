package com.javabootcamp.day5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a month name (UPPERCASE)");
		String month = scanner.nextLine();
		System.out.println("Enter day");
		int day = Integer.parseInt(scanner.nextLine());					
		if(checkValidDayMonth(month,day))
			System.out.println("VALID MONTH & DAY");
		while(!("quit".equalsIgnoreCase(month))){
			System.out.println("Please enter a month name (UPPERCASE)");
			 month = scanner.nextLine();
			System.out.println("Enter day");
			 day = Integer.parseInt(scanner.nextLine());					
			if(checkValidDayMonth(month,day))
				System.out.println("VALID MONTH & DAY");
			System.out.println("");
		}
	}

	public enum Months{
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
	}

	static int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};


	public static boolean checkValidDayMonth(String month, int day){
		int index = 0;
		try{						
			index = Months.valueOf(month).ordinal();			
			
		}
		catch(Exception e){
			try {
				throw new BadMonth("Invalid Month");
			} catch (BadMonth e1) {				
				e1.printStackTrace();	
				
				return false;
			}
		}
		
		int val = days[index];
		if(val!=day){
			try {
				throw new BadDay("Invalid day for this month");
				
			} catch (BadDay e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				return false;
			}
		}
		
		return true;
	}
}
