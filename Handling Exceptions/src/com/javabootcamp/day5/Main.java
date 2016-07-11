package com.javabootcamp.day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first file name: ");
		String file1 = scanner.nextLine();
		File infile = new File(file1);
		while(!infile.exists()){
			System.out.println("The file with this name does not exist. Please enter another file name: ");
			file1 = scanner.nextLine();
			infile = new File(file1);
		}
		System.out.println("Enter second file name: ");
		String file2 = scanner.nextLine();
		
		boolean copyStatus = copyFile(file1, file2);
		while(!copyStatus){
			System.out.println("There was a problem copying file");
			System.out.println("Enter second file name: ");
			file2 = scanner.nextLine();
			copyFile(file1, file2);
		}
		System.out.println("File copied successfully!!");
		
	}
	
	public static boolean copyFile(String file1, String file2){
		File infile = new File(file1);
		File outfile =new File(file2);
		FileInputStream instream = null;
		FileOutputStream outstream = null;

		try{
			instream = new FileInputStream(infile);
			outstream = new FileOutputStream(outfile);
			byte[] buffer = new byte[1024];
			int length;		
			while ((length = instream.read(buffer)) > 0){
				outstream.write(buffer, 0, length);
			}			
			instream.close();
			outstream.close();
			return true;
			
		}
		catch(IOException ioe){
			//ioe.printStackTrace();
			return false;
		}
	}
}
