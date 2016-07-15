package com.javabootcamp.day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		try {
			String sCurrentLine;
			BufferedReader reader = new BufferedReader(new FileReader("pride-and-prejudice.txt"));
			while ((sCurrentLine = reader.readLine()) != null) {				
				String arr[] = sCurrentLine.split("\\W+");
				for(int i=0;i<arr.length;i++){
					set.add(arr[i].toLowerCase());
				}
			}
			
			for(String s:set){
				System.out.println(s);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
