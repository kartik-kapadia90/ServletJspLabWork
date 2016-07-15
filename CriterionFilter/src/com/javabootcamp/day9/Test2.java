package com.javabootcamp.day9;

public class Test2 implements StringCriterion{

	//First letter between a & m or A & M
	@Override
	public boolean test(String s) {
		// TODO Auto-generated method stub
		char c = s.charAt(0);
		int val = (int)c;
		if((val>=65 && val<=77) || (val>=97 && val<=109))
			return true;
		return false;
	}

}
