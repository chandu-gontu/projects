package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest2 {
	Calculator r;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Testing starts here . .");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Testing ends here . .");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Hello");
		r=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		r=null;
	}

	@Test
	void testSum() {
		
		assertEquals(11,r.sum(5, 6));
	}
	@Test
	void testDiff() {
		
		assertEquals(-1,r.diff(5, 6));
	}

	@Test
	void testProduct() {
		
		assertEquals(30,r.product(5, 6));
	}
	@Test
	void testDiv() {
		
		assertEquals(5,r.div(15, 3));
	}

}
