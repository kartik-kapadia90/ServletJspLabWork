package com.javabootcamp.day9;

import java.awt.Color;

public class Sock implements Colored, Sized{

	int size;
	Color color;
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

	public Sock(){

	}
	public Sock(int size, Color c){

		this.size = size;
		this.color = c;
	}

	public String toString(){

		return this.color.toString();
	}
}
