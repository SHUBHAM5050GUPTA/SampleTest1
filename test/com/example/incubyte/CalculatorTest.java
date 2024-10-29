package com.example.incubyte;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {

	@Test
	public void emptyStringShouldReturn0() {
		Calculator calculator = new Calculator();
		int result = calculator.add("");
		assertEquals("Empty string should return 0",0,result);
	}
	
	@Test
	public void singleNumberStringShouldReturnNumber() {
		Calculator calculator = new Calculator();
		int result = calculator.add("5");
		assertEquals("Single number should return number",5,result);
	}
	
	@Test
	public void singleNumberWithComaShouldReturnNumber() {
		Calculator calculator = new Calculator();
		int result = calculator.add("5,");
		assertEquals("Single number should return number",5,result);
	}
	

}
