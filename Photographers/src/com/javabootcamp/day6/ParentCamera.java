package com.javabootcamp.day6;

public class ParentCamera  implements Photographer{

	@Override
	public void prepareScene() {
		// TODO Auto-generated method stub
		System.out.println("Hey kids, stand over there and smile");
		
	}

	@Override
	public String takePhotograph() {
		// TODO Auto-generated method stub
		return "Lots of cheesy grins";
	}

}
