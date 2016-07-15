package com.javabootcamp.day9;

import java.awt.Color;

public class GlassVase implements Sized,Colored{

	int size;
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}
	
	public GlassVase(){
		
	}
	
	public GlassVase(int size){
		this.size = size;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}

}
