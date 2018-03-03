package com.dperic.StringFormat;

import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		String fileTextString = new String();
		int count = 0;
		
		java.io.File file = new java.io.File("tags.txt");
		
		try {
			Scanner input = new Scanner(file);
			while (input.hasNext()) {
				fileTextString = input.next();
				String whole = hexToBinary(fileTextString);
				String substring = decToBinary("1253252");
				int fromIndex = 0;				
				while ((fromIndex = whole.indexOf(substring, fromIndex)) != -1) {
					count++;
					fromIndex++;
					
				}
				System.out.println(count);
				
			}
			
		}
		
		catch (FileNotFoundException e) {
			System.err.format("File does not exist");
		}
		
		
	}
	
	public static String hexToBinary(String hex) {
		return new BigInteger(hex, 16).toString(2);
	}
	
	public static String decToBinary(String dec) {
		return new BigInteger(dec, 10).toString(2);
	}
	
	
	
}
