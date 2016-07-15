package com.javabootcamp.day6;

public class Main {

	public static void main(String[] args) {
		
		Photographer[] photographers  = {new ParentCamera(), new TrafficCamera(), new SecurityCamera()};
		
		for(int i=0;i<photographers.length;i++){
			photographers[i].prepareScene();
			System.out.println(photographers[i].takePhotograph());
		}
	}
}
