package com.javabootcamp.day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		try {
			String sCurrentLine;
			BufferedReader reader = new BufferedReader(new FileReader("pride-and-prejudice.txt"));
			while ((sCurrentLine = reader.readLine()) != null) {
				String arr[] = sCurrentLine.split("\\W+");
				for(int i=0;i<arr.length;i++){
					String word = arr[i].toLowerCase();
					
					if(map.containsKey(word)){
						map.put(word, map.get(word)+1);
					}
					else{
						map.put(word,1);
					}
				}
			}
			
			for(Map.Entry<String,Integer> entry: map.entrySet()){
				System.out.println("Word " + entry.getKey()+" occurs "+entry.getValue()+" times");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
