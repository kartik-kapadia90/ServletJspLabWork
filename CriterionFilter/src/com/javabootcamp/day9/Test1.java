package com.javabootcamp.day9;

public class Test1 implements StringCriterion{

	//Longer than threshold test
	int threshold=5;
	@Override
	public boolean test(String s) {
		// TODO Auto-generated method stub
		if(s.length()>threshold)
			return true;
		return false;
	}

}
