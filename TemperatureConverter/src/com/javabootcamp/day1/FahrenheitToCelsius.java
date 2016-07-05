package com.javabootcamp.day1;

import java.util.Scanner;

public class FahrenheitToCelsius {

	
	public static void main(String[] args) {
		
		System.out.println("Enter temperature value in Fahrenheit: ");
		Scanner scanner = new Scanner(System.in);
		
		String line = scanner.nextLine();
		
		double fahrenheitValue = Double.valueOf(line);
		
		double celsiusValue = 5*((fahrenheitValue-32)/9);
		
		System.out.println("Celsius temperature is: "+celsiusValue);
		
		
	}
}
