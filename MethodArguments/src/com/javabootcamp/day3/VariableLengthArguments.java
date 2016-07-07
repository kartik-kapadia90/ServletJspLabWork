package com.javabootcamp.day3;

import java.util.HashMap;

public class VariableLengthArguments {

	static HashMap<String,Integer> map = new HashMap<String,Integer>(); 
	static{
		map.put("zero", 0);
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("six", 6);
		map.put("seven", 7);
		map.put("eight", 8);
		map.put("nine", 9);
		map.put("ten", 10);
	}
	
	public static void main(String[] args) {
		
		addUp(3.2, 2.2, 1.1, 4.9, 7.7, 10.2, 11.9, 3.1);
		addUp(1, 4, 7);
		addUp("one", "three", "nine","eight");
		addUp(2,3.5,1,1.5,7.8,6.6);
		//addUp(1, "three"); This method fails to compile as it's signature does not match with any of the available methods in the class.
		
	}
	
	
	public static void addUp(int... a){
		int total=0;
		for(int i:a){
			total+=i;
		}
		System.out.println(total);
	}
	
	
	public static void addUp(double... a){
		double total=0;
		
		for(double d:a){
			total+=d;
		}
		
		System.out.println(total);
	}
	
	public static void addUp(String...a ){
		int total = 0;		
		for(String s:a){
			int intVal = toNumber(s);
			total+=intVal;
		}
		System.out.println(total);
	}
	
	public static int toNumber(String s){
		if(map.containsKey(s))
			return map.get(s);
		else
			return 0;
	}
	
}
