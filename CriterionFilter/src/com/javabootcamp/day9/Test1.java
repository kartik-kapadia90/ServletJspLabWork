package com.javabootcamp.day9;

public class Test1<E extends String> implements Criterion{

	//Longer than threshold test
	int threshold=5;

	@Override
	public boolean test(Object e) {
		// TODO Auto-generated method stub
		E elem = (E)e;
		if(elem.length()>threshold)
			return true;
		return false;
	}


}
