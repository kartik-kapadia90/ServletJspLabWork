package com.javabootcamp.day3;

import java.util.HashMap;

public class Main {
	
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
		
		addUp(3.2, 2.2);
		addUp(1, 4);
		addUp("one", "three");
		addUp(2, 3.5);
		//addUp(1, "three"); This method fails to compile as it's signature does not match with any of the available methods in the class.
		
	}
	
	
	public static void addUp(int a, int b){
		System.out.println(a+b);
	}
	
	
	public static void addUp(double a, double b){
		System.out.println(a+b);
	}
	
	public static void addUp(String a, String b){
		int aVal = toNumber(a);
		int bVal = toNumber(b);
		System.out.println(aVal+bVal);
	}
	
	public static int toNumber(String s){
		if(map.containsKey(s))
			return map.get(s);
		else
			return 0;
	}
}
