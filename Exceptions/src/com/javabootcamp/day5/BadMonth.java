package com.javabootcamp.day5;

public class BadMonth extends Exception{
	
	public BadMonth(String message, Throwable cause){
		super(message, cause);
	}
	public BadMonth(String message){
		super(message);
	}

}
