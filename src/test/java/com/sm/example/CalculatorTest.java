package com.sm.test.example;

import org.junit.*;

import com.sm.example.Calculator;

import static org.junit.Assert.*;

public class CalculatorTest{

	@Test
	public void testSum(){
		Calculator calculator=new Calculator();
		int rs=calculator.add(4,2);
		assertEquals(6,rs);
	}

	@Test
	public void testZeroSum(){
		Calculator calculator=new Calculator();
		int rs=calculator.add(0,0);
		assertEquals(0,rs);
	}
	
	@Test
	public void testNegativeSum(){
		Calculator calculator=new Calculator();
		int rs=calculator.add(9,-4);
		assertEquals(5,rs);
	}

	@Test
	public void testDiff(){
		Calculator calculator=new Calculator();
		int rs=calculator.substract(4,2);
		assertEquals(2,rs);
	}

	@Test
	public void testNegativeDiff(){
		Calculator calculator=new Calculator();
		int rs=calculator.substract(4,-2);
		assertEquals(6,rs);
	}
	
}