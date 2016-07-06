package com.javabootcamp.day2;

import java.util.Scanner;

public class DataAnalysis {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of data items");
		int itemSize = Integer.parseInt(scanner.nextLine());
		int[] arr = new int[itemSize];
		long sum=0;
		for(int i=0;i<itemSize;i++){
			System.out.println("Enter number: ");
			arr[i] = Integer.parseInt(scanner.nextLine());
			sum+=arr[i];			
		}
		System.out.println("Mean is: "+sum/arr.length);
				
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min)
				min = arr[i];
			if(arr[i]>max)
				max = arr[i];
		}

		System.out.println("Minimum value is: "+min+" and Maximum value is: "+max);
		
	}
}
