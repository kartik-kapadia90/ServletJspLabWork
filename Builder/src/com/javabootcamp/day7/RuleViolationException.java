package com.javabootcamp.day7;

public class RuleViolationException extends Exception{

	public RuleViolationException(String message){
		super(message);
	}

	public RuleViolationException(String message, Throwable cause){
		super(message, cause);
	}
}
