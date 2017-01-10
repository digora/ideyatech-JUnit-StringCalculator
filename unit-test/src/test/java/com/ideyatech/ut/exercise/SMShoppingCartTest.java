package com.ideyatech.ut.exercise;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SMShoppingCartTest {
	SMShoppingCart SMC;
	
	@BeforeClass
	public static void initClass(){
		System.out.println("I will run once");
		
	}
	
	@Before
	public void init(){
		SMC = new SMShoppingCart();
		SMC.initProductList();
	}
	
	
	@Test
	public void testSmall(){
		SMC.addSmall();
		SMC.checkOut();
		assertEquals(1000f, SMC.getTotalPrice(), 0);
		assertEquals("SMALL", SMC.getOrderList().get(0).getName());
	}
	
	@Test
	public void testMedium(){
		SMC.addMedium();
		SMC.checkOut();
		assertEquals(1500f, SMC.getTotalPrice(),0);
		assertEquals("MEDIUM", SMC.getOrderList().get(0).getName());
	}
	
	@Test
	public void testLarge(){
		SMC.addLarge();
		SMC.checkOut();
		assertEquals(3000f, SMC.getTotalPrice(), 0);
		assertEquals("LARGE", SMC.getOrderList().get(0).getName());
	}
	
	@Test
	public void test1GB(){
		SMC.addAdditional();
		SMC.checkOut();
		assertEquals(500f, SMC.getTotalPrice(), 0);
		assertEquals("1GB", SMC.getOrderList().get(0).getName());
	}
	
	@Test
	public void testPromo1(){
		SMC.addSmall();
		SMC.addSmall();
		SMC.addSmall();
		SMC.checkOut();
		assertEquals(2000f, SMC.getTotalPrice(), 0);
		assertEquals("SMALL", SMC.getOrderList().get(0).getName());
		assertEquals("SMALL", SMC.getOrderList().get(1).getName());
		assertEquals("SMALL", SMC.getOrderList().get(2).getName());
	}
	
	@Test
	public void testPromo2(){
		SMC.addLarge();
		SMC.addLarge();
		SMC.addLarge();
		SMC.addLarge();
		SMC.addLarge();
		SMC.checkOut();
		assertEquals(15000f, SMC.getTotalPrice(), 0);
		assertEquals("LARGE", SMC.getOrderList().get(0).getName());
		assertEquals("LARGE", SMC.getOrderList().get(1).getName());
		assertEquals("LARGE", SMC.getOrderList().get(2).getName());
		assertEquals("LARGE", SMC.getOrderList().get(3).getName());
		assertEquals("LARGE", SMC.getOrderList().get(4).getName());
		assertEquals("SMALL", SMC.getOrderList().get(5).getName());
	}
	
	@Test
	public void testPromo3(){
		SMC.addMedium();
		SMC.checkOut();
		assertEquals(1500f, SMC.getTotalPrice(), 0);
		assertEquals("MEDIUM", SMC.getOrderList().get(0).getName());
		assertEquals("1GB", SMC.getOrderList().get(1).getName());
	}
		
	
	
	@Test
	public void testCheckout(){
		SMC.addSmall();
		SMC.addSmall();
		SMC.addSmall();
		SMC.addLarge();
		SMC.addLarge();
		SMC.addLarge();
		SMC.addLarge();
		SMC.addLarge();
		SMC.addMedium();
		SMC.addMedium();
		SMC.checkOut();
		assertEquals(20000f, SMC.getTotalPrice(), 0);
	}
	
	@After
	public void cleanUp(){
		System.out.println("I will run after any unit test method");
		SMC.setTotalPrice(0);
		SMC.getProductList().clear();
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("I will run once after");
	}

}
