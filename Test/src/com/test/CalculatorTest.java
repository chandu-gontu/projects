package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testSum() {
		Calculator c=new Calculator();
		assertEquals(11,c.sum(5, 6));
	}
	@Test
	void testDiff() {
		Calculator c=new Calculator();
		assertEquals(-1,c.diff(5, 6));
	}

	@Test
	void testProduct() {
		Calculator c=new Calculator();
		assertEquals(30,c.product(5, 6));
	}
	@Test
	void testDiv() {
		Calculator c=new Calculator();
		assertEquals(5,c.div(15, 3));
	}



}
