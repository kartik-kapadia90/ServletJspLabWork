package com.javabootcamp.day4;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public enum States{
		BAR, MEDAL, COIN, TRIPLEBAR, CHERRY;
	}
	public static void main(String[] args) {
		
		int wheel1RandomVal = ThreadLocalRandom.current().nextInt(0, 4 + 1);
		int wheel2RandomVal = ThreadLocalRandom.current().nextInt(0, 4 + 1);
		int wheel3RandomVal = ThreadLocalRandom.current().nextInt(0, 4 + 1);
		
		States state1 = States.values()[wheel1RandomVal];
		States state2 = States.values()[wheel2RandomVal];
		States state3 = States.values()[wheel3RandomVal];
		
		States[] stateArr = new States[3];
		stateArr[0]=state1;
		stateArr[1]=state2;
		stateArr[2]=state3;
		
		for(int i=0;i<stateArr.length;i++){
			System.out.println(stateArr[i]);
		}
		
	}
}
