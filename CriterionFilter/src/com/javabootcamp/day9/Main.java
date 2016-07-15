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
				/*assert longStrings.get(0).equals("Susannah");
				assert longStrings.get(0).equals("Orinoco");*/
				
				StringCriterion sc1 = new Test1();
				StringCriterion sc2 = new Test2();
				StringCriterion sc3 = new Test3();
				
				List<String> longStrings1 = stringFilter(ls, sc1);
				System.out.println(longStrings1);
				List<String> longStrings2 = stringFilter(ls, sc2);
				System.out.println(longStrings2);
				List<String> longStrings3 = stringFilter(ls, sc3);
				System.out.println(longStrings3);
				
				
				
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
	
	public static List<String> stringFilter(List<String> ls, StringCriterion criterion){
		List<String> list = new ArrayList<String>();
		for(int i=0;i<ls.size();i++){
			String str = ls.get(i);
			if(criterion.test(str))
				list.add(str);
		}
		return list;
	}
}
