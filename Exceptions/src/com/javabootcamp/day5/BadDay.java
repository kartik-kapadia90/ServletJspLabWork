package com.javabootcamp.day5;

public class BadDay extends Exception{

	public BadDay(String message){
		super(message);
	}

	public BadDay(String message, Throwable cause){
		super(message, cause);
	}
	
}
