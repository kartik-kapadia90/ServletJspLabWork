package com.javabootcamp.day2;

import java.util.Scanner;

public class FindDay {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter day (1-31): ");
		while(scanner.hasNext()){			
			String input = scanner.nextLine();
			if(input.equalsIgnoreCase("quit"))
				break;
			else
			{
				int day = Integer.parseInt(input);
				System.out.println("Enter month (1-12)");
				int month = Integer.parseInt(scanner.nextLine());
				System.out.println("Enter year : ");
				int year = Integer.parseInt(scanner.nextLine());
				
				if(month==1 || month==2){
					month+=12;
					year-=1;
				}
				double monthCal = (13*(month+1))/5;
				int monthCalInt = (int)monthCal;
				int yearInt = (int)(year/4);
				int cMid = (int)(year/100);
				int cVal = 6*cMid;
				int dVal = (int)(year/400);		
				
				int sum = monthCalInt+yearInt+cVal+dVal+year+day;
				int val = sum%7;
				System.out.print("The day is: ");
				switch (val) {
				case 0:
					System.out.println("Saturday");
					break;				
				case 1:
					System.out.println("Sunday");
					break;
				case 2:
					System.out.println("Monday");
					break;	
				case 3:
					System.out.println("Tuesday");
					break;
				case 4:
					System.out.println("Wednesday");
					break;
				case 5:
					System.out.println("Thursday");
					break;
				case 6:
					System.out.println("Friday");
					break;
					
				default:
					break;
				}
				System.out.println("Enter day");
				
				
			}
			
		}
				
		
		
	}
}
