package com.example.incubyte;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int add(String string) {
		int result = 0;
		if(string.isEmpty()) {
			return result;
		}
		String[] stringArray = string.split("[,\n]");
		int[] intArray = new int[stringArray.length];
		for(int i=0;i<stringArray.length;i++) {
			intArray[i]=Integer.parseInt(stringArray[i]);
		}
		
		for(int i=0;i<intArray.length;i++) {
			result = result+intArray[i];
		}
		
		return result;
		
	}

}
