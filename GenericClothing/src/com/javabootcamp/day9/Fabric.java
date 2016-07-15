package com.javabootcamp.day9;

import java.awt.Color;

public class Fabric implements Colored,Sized{

	Color color;
	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}
	
	public Fabric(){
		
	}
	
	public Fabric(Color c){
		this.color = c;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

}
