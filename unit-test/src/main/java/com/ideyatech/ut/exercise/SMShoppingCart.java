package com.ideyatech.ut.exercise;

import java.util.ArrayList;

public class SMShoppingCart implements ShoppingCart{

	private PromoEditor promo = new PromoEditor();
	
	private ArrayList<Product>	productList = new ArrayList<Product>();
	private ArrayList<Product> 	orderList = new ArrayList<Product>();
	private ArrayList<Promo> 	promoList = new ArrayList<Promo>();
	
	private int ctrSmall = 0;
	private int ctrMedium = 0;
	private int ctrLarge = 0;
	
	private double totalPrice = 0.0;

	
	public void initProductList(){
		productList.add(new Product("UNLI_1GB", "SMALL", 1000.0));
		productList.add(new Product("UNLI_2GB", "MEDIUM", 1500.0));
		productList.add(new Product("UNLI_5GB", "LARGE", 3000.0));
		productList.add(new Product("1GB_ADDTL", "1GB", 500.0));
	}
	
	public void initpromoTemp(){
		promo.initPromoList();
	}
	
	public void addSmall() {
		orderList.add(productList.get(0));
		totalPrice += productList.get(0).getPrice();
		ctrSmall++;
	}

	public void addMedium() {
		orderList.add(productList.get(1));
		totalPrice += productList.get(1).getPrice();
		ctrMedium++;
	}

	public void addLarge() {
		orderList.add(productList.get(2));
		totalPrice += productList.get(2).getPrice();
		ctrLarge++;
	}
	
	public void addAdditional() {
		orderList.add(productList.get(3));
		totalPrice += productList.get(3).getPrice();
	}

	public void displayOrderedProducts() {
		System.out.println("product_id" +"\t\t"+ "name" +"\t\t"+ "price");
		for( int i = 0; i < orderList.size(); i++){
			System.out.println(orderList.get(i).getProductID() +"\t\t"+ orderList.get(i).getName() +"\t\t"+ orderList.get(i).getPrice());
		}
	}
	
	public void addReward(Promo promo){
		if(promo.getProdName().equals("SMALL")){
			totalPrice -= productList.get(0).getPrice();
		}
		if(promo.getProdName().equals("MEDIUM")){
			// Add ADDITIONAL
			orderList.add(productList.get(3));
			System.out.println("ADDITIONAL ADDED");
		}
		if(promo.getProdName().equals("LARGE")){
			// Add SMALL
			orderList.add(productList.get(0));
			System.out.println("SMALL ADDED");
		}
	}

	public void checkPromo(){
		promoList = promo.getPromoList();
		System.out.println(promoList.size());
		for(int i = 0; i < promoList.size(); i++){
			int count = 0;
			if(promoList.get(i).getProdName().equals("SMALL")){
				count = ctrSmall/promoList.get(i).getBuyQty();
				System.out.println("SMALL" + count);
			}
			
			else if(promoList.get(i).getProdName().equals("MEDIUM")){
				count = ctrMedium/promoList.get(i).getBuyQty();
				System.out.println("MEDIUM" + count);
			}
			
			else if(promoList.get(i).getProdName().equals("LARGE")){
				count = ctrLarge/promoList.get(i).getBuyQty();
				System.out.println("LARGE" + count);
			}
			
			while(count > 0){
				System.out.println("Add Reward");
				addReward(promoList.get(i));
				count--;
			}
		}
	}

	public void checkOut() {
		System.out.println("display");
		checkPromo();
		System.out.println("promo");
		displayOrderedProducts();
		System.out.print("P "+ totalPrice);
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public ArrayList<Product> getOrderList() {
		return orderList;
	}

	public void setOrderList(ArrayList<Product> orderList) {
		this.orderList = orderList;
	}

}
