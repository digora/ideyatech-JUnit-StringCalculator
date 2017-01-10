package com.ideyatech.ut.lecture;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CasioCalculatorTest {
	
	private CasioCalculator casio;
	private CasioCalculator casio2;
	
	@BeforeClass
	public static void initClass(){
		System.out.println("I will run once");
	}
	
	@Before
	public void init(){
		System.out.println("This will run before any unit test method!");
		casio = new CasioCalculator();
		casio2 = new CasioCalculator();
		casio.setModel("Model 1");
		casio2.setModel("Model 1");
		
		
	}
	
	@Test
	public void testAdd(){
		long a = 5;
		long b = 10;
		long result = casio.add(a, b);
		assertEquals("Sum should be 15",15l, result);
	}
	
	@Test
	public void testSubtract(){
		long a = 10;
		long b = 5;
		long result = casio.subtract(a, b);
		assertEquals("Difference should be 5",5l, result);
	}
	
	@Test
	public void testMultiply(){
		long a = 10;
		long b = 5;
		long result = casio.multiply(a, b);
		assertEquals("Product should be 50", 50l, result);
	}
	@Test
	public void testDivide(){
		assertEquals(2f, casio.divide(10, 5), 0);
	}
	
	@Test
	public void testSquare(){
		assertEquals(100f, casio.sqr(10), 0);
	}
	
	@Test
	public void testPow(){
		assertEquals(81f, casio.pow(9, 2), 0);
	}
	
	@Test
	public void testOthers(){
		assertEquals(casio, casio2);
	}
	
	@After
	public void cleanUp(){
		System.out.println("This will run after any unit test method");
	}

	@AfterClass
	public static void afterClass(){
		System.out.println("I will run once after");
	}
}
