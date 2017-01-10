package com.ideyatech.ut.exercise;

public class Product {
	private String productID;
	private String name;
	private double price;
	
	public Product(String a, String b, double c){
		this.productID = a;
		this.name = b;
		this.price = c;
	}
	
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
