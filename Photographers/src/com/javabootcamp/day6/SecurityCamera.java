package com.javabootcamp.day6;

public class SecurityCamera implements Photographer{

	@Override
	public void prepareScene() {
		// TODO Auto-generated method stub
		System.out.println("Enter the correct pin to unlock the door");
		
	}

	@Override
	public String takePhotograph() {
		// TODO Auto-generated method stub
		return "Mr. X entered incorrect pin";
	}

}
