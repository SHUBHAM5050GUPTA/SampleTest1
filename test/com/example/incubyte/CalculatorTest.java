package com.example.incubyte;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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
		assertEquals("Single number with coma should return number",5,result);
	}
	
	@Test
	public void multipleNumberShouldReturnSum() {
		Calculator calculator = new Calculator();
		int result = calculator.add("5,7");
		assertEquals("Multiple number should return sum",12,result);
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
		assertEquals("Multiple number should handle Line break",6,result);
	}
	@Test
	public void shouldHandleEmptyValueBetweenDelimiter() {
		Calculator calculator = new Calculator();
		int result = calculator.add("1,,2,3");
		assertEquals("should handle empty value between delimiter",6,result);
	}
	
	@Test
	public void shouldSupportDifferentDelimiter() {
		Calculator calculator = new Calculator();
		int result = calculator.add("//;\n1;2");
		assertEquals("should support different delimiter",3,result);
	}
	@Test
	public void shouldSupportDifferentDelimiterComa() {
		Calculator calculator = new Calculator();
		int result = calculator.add("//,\n1,2");
		assertEquals("should support differnt delimiter type coma",3,result);
	}
	
	@Test
	public void shouldthrowExceptionForNegativeNumbers() {
		Calculator calculator = new Calculator();
		IllegalArgumentException e = assertThrows(IllegalArgumentException.class, ()->{
			calculator.add("//,\n-1,2");
		});
		assertEquals("negative numbers not allowed: -1",e.getMessage());
	}
	
	@Test
	public void shouldthrowExceptionForMultipleNegativeNumbers() {
		Calculator calculator = new Calculator();
		IllegalArgumentException e = assertThrows(IllegalArgumentException.class, ()->{
			calculator.add("//,\n-1,-2,-3,");
		});
		assertEquals("negative numbers not allowed: -1,-2,-3",e.getMessage());
	}
	
	
}
