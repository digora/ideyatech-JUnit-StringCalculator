package com.ideyatech.ut.exercise;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FordStringCalculatorTest {
	
	private FordStringCalculator FSC;
	
	@Before
	public void init(){
		FSC = new FordStringCalculator();
	}
	
	@Test
	public void emptyTest(){
		assertEquals(0l, FSC.calculate(""));
		assertEquals(0l, FSC.calculate("null"));
	}
	
	@Test
	public void singleTest(){
		assertEquals(5l, FSC.calculate("5"));
	}
	
	@Test
	public void commaTest(){
		assertEquals(10l, FSC.calculate("8,2"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void negativeTest(){
		FSC.calculate("-10");
	}
	
	@Test
	public void thousandTest(){
		assertEquals(0l, FSC.calculate("1001"));
	}
	
	@Test
	public void singleSpecifyTest(){
		assertEquals(15l, FSC.calculate("//#8#2#5"));
	}
	
	@Test
	public void multSpecifyTest(){
		assertEquals(20l, FSC.calculate("//[###]8###2###10"));
	}
	
	@Test
	public void multRulesTest(){
		assertEquals(15l, FSC.calculate("//#8#2#5#1001"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void multRulesNegativeTest(){
		FSC.calculate("//#8#2#-5");
	}
	
}
