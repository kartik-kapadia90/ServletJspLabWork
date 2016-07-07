package com.javabootcamp.day3;

public class Reading {

	private String day;
	private int hour;
	private int temperature;
	private int windSpeed;
	
	
	public Reading(String input){
		
		String[] elements = input.split(", ");
		this.day = elements[0];
		this.hour = Integer.valueOf(elements[1]);
		this.temperature = Integer.valueOf(elements[2]);
		this.windSpeed = Integer.valueOf(elements[3]);
		
	}
	
	
	
	public String rateTemperature(){
		
		if(this.temperature<55)
			return "cold";
		else if(this.temperature>=55 && this.temperature<65)
			return "mild";
		else if(this.temperature>=65 && this.temperature<80)
			return "warm";
		else if(this.temperature>=80)
			return "hot";
		return null;
	}
	
	public String getTime(){
		
		if(this.hour==9)
			return this.day+" morning was ";
		else if(this.hour==15)
			return this.day+" afternoon was ";
		else if(this.hour==21)
			return this.day+" evening was ";
		
		return null;
	}
}
