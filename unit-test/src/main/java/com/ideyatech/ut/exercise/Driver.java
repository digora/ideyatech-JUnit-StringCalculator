package com.ideyatech.ut.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	public static void main(String args[]){
		SMShoppingCart SMC = new SMShoppingCart();
		SMC.initProductList();
		
		
		Scanner sc = new Scanner(System.in);
		String order;
		
		System.out.println("Hi welcome to our shop! Please choose one of the products");
		System.out.println("Input the indicated product code to add the product to the shopping cart");
		System.out.println("Product Code-------Product Description-----------Price");
		System.out.println("[SMALL]------------1GB Data----------------------P1000");
		System.out.println("[MEDIUM]-----------2GB Data----------------------P1500");
		System.out.println("[LARGE]------------5GB Data----------------------P3000");
		System.out.println("[1GB]--------------Additional 1GB Data-----------P500");
		System.out.println("");
		System.out.println("Our Promos: ");
		System.out.println("1. Buy 3 [SMALL] for the price of 2");
		System.out.println("2. Buy 5 [LARGE] get 1 [SMALL] free");
		System.out.println("3. Buy 1 [MEDIUM] get [1GB] free");
		System.out.println("Input [CO] to checkout");
		
		
		while(true){
			System.out.print("Your order: ");
			order = sc.next();
			
			if(order.equals("CO")){
				SMC.checkOut();
				break;
			}else if(order.equals("SMALL")){
				SMC.addSmall();
			}else if(order.equals("MEDIUM")){
				SMC.addMedium();
			}else if(order.equals("LARGE")){
				SMC.addLarge();
			}else if(order.equals("1GB")){
				SMC.addAdditional();
			}else{
				System.out.println("Invalid Input.");
			}
			
			
		}
	}
	
}
