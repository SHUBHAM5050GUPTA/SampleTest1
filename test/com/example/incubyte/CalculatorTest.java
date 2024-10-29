package com.example.incubyte;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {

	@Test
	public void emptyStringShouldReturn0() {
		Calculator calculator = new Calculator();
		int result = Calculator.add("");
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
	
	@Test
	public void multipleNumberShouldReturnSum() {
		Calculator calculator = new Calculator();
		int result = calculator.add("5,7");
		assertEquals("Single number should return number",12,result);
	}
	
	@Test
	public void multipleNumberWithComaAtEndShouldReturnSum() {
		Calculator calculator = new Calculator();
		int result = calculator.add("5,7,9,");
		assertEquals("Single number should return number",21,result);
	}
	
	@Test
	public void shouldHandleLineBreak() {
		Calculator calculator = new Calculator();
		int result = calculator.add("1\n2,3");
		assertEquals("Single number should return number",6,result);
	}
	@Test
	public void shouldHandleEmptyValueBetweenDelimiter() {
		Calculator calculator = new Calculator();
		int result = calculator.add("1,,2,3");
		assertEquals("Single number should return number",6,result);
	}
	
//	@Test
//	public void shouldHandleLineBreak1() {
//		Calculator calculator = new Calculator();
//		int result = calculator.add("/1,2,3");
//		assertEquals("Single number should return number",6,result);
//	}
	

}
