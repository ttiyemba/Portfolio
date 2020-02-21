package com.qa.fib;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class fibonacciTest {
	
	@Test
	public void reccurssionTest() {
		Runner run = new Runner();
		assertEquals(102334155, run.fibanacci2(40));
	}
	
	@Test
	public void iterationTest() {
		Runner run = new Runner();
		assertEquals(102334155, run.fibonacci(40));
	}

}
