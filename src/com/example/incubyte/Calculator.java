package com.example.incubyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		add("//\n123");
	}
	
	public static int add(String string){
		int result = 0;
		if(string.isEmpty()) {
			return result;
		}
		if(string.length()>2 && string.substring(0, 2).equals("//")) {
			char delimiter = string.charAt(2);
			char lineBreak = string.charAt(3);
			String numString = string.substring(4);
			result = getSum(numString,delimiter+"");
			return result;
			
		}else {
			String delimiter = ",\n";
			result = getSum(string,delimiter);
		}
		
		return result;
		
	}
	public static int getSum(String string,String delimiter){
		int result = 0;
		if(string.isEmpty()) {
			return result;
		}
		String[] stringArray = string.split("["+delimiter+"]");
		int[] intArray = new int[stringArray.length];
		boolean negativeValue = false;
		String errorMsg = "negative numbers not allowed: ";
		for(int i=0;i<stringArray.length;i++) {
			if(stringArray[i].isEmpty()) {
				intArray[i]=0;
				continue;
			}
			intArray[i]=Integer.parseInt(stringArray[i]);
			
			if(intArray[i]<0) {
				negativeValue = true;
				errorMsg = errorMsg+intArray[i]+",";
			}
		}
		if(negativeValue) {
			errorMsg = errorMsg.substring(0,errorMsg.length()-1);
			throw new IllegalArgumentException(errorMsg);
		}
		
		for(int i=0;i<intArray.length;i++) {
			result = result+intArray[i];
		}
		return result;
		
	}

}
