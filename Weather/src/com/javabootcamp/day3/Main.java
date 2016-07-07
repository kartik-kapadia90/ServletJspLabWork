package com.javabootcamp.day3;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {


	public static void main(String[] args) throws Throwable {


		BufferedReader br = Files.newBufferedReader(
				Paths.get("weather.csvx"));
		Reading[] readings = new Reading[12];
		String line;
		for (int i = 0; i < readings.length; i++) {
			readings[i] = new Reading(br.readLine());
		}
		
		
		for (int i = 0; i < readings.length; i++) {
			System.out.println(readings[i].getTime()+readings[i].rateTemperature());
		}

	}
}
