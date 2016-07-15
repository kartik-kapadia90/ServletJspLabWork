package com.javabootcamp.day7;

public class Main {

	public static void main(String[] args) {
		
		Target t = Target.Builder.builder().
				setA("Hello").
				setB(4).
				setC(2).
				setD("Hii").
				setE("Commplete").
				build();
		System.out.println(t.getA());
	}
}
