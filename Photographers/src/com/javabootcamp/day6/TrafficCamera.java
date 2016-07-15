package com.javabootcamp.day6;

public class TrafficCamera implements Photographer{

	@Override
	public void prepareScene() {
		// TODO Auto-generated method stub
		System.out.println("Do not cross red light");
		
	}

	@Override
	public String takePhotograph() {
		// TODO Auto-generated method stub
		return "A BMW just crossed red light";
	}

}
