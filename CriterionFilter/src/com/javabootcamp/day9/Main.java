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
				
				Criterion<String> sc1 = new Test1();
				Criterion<Integer> sc2 = new Test2();
				
				List<Integer> integerList = Arrays.asList(1,3,4,9,10,12);
				//Criterion sc3 = new Test3();
				
				List<String> longStrings1 = stringFilter(ls, sc1);
				System.out.println(longStrings1);
				List<Integer> longStrings2 = stringFilter(integerList, sc2);
				System.out.println(longStrings2);
				/*List<String> longStrings3 = stringFilter(ls, sc3);
				System.out.println(longStrings3);*/
				
				
				
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
	
	public static <E> List<E> stringFilter(List<E> ls, Criterion<E> criterion){
		List<E> list = new ArrayList<E>();
		for(int i=0;i<ls.size();i++){
			//String str = (String) ls.get(i);
			if(criterion.test(ls.get(i)))
				list.add(ls.get(i));
		}
		return list;
	}
}
