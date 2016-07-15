package com.javabootcamp.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> ls = Arrays.asList(
				  "Fred", "Jim", "William", "Susannah", "Lucy", "Orinoco", "Toby"
				);
				List<String> longStrings = getLongStrings(ls,6);
				assert longStrings.size() == 3;
				assert longStrings.get(0).equals("William");
				assert longStrings.get(0).equals("Susannah");
				assert longStrings.get(0).equals("Orinoco");
	}
	
	public static List<String> getLongStrings(List<String> ls, int threshold){
		List<String> list = new ArrayList<String>();
		for(int i=0;i<ls.size();i++){
			String str = ls.get(i);
			if(str.length()>threshold)
				list.add(str);
		}
		return list;
		
	}
}
