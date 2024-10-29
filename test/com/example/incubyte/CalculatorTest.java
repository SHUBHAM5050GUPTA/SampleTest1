package com.example.incubyte;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {

	@Test
	public void shouldReturn0() {
		Calculator calculator = new Calculator();
		int result = calculator.add("");
		assertEquals("Empty string should return 0",0,result);
	}
	

}
