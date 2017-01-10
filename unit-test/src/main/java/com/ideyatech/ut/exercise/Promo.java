package com.ideyatech.ut.exercise;

public class Promo {
	private int promoID;
	private String prodName;
	private int buyQty;
	private String getProduct;
	
	public Promo(int a, String b, int c, String d){
		this.promoID = a;
		this.prodName = b;
		this.buyQty = c;
		this.getProduct = d;
	}
	
	public int getPromoID() {
		return promoID;
	}
	public void setPromoID(int promoID) {
		this.promoID = promoID;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getBuyQty() {
		return buyQty;
	}
	public void setBuyQty(int buyQty) {
		this.buyQty = buyQty;
	}

	public String getGetProductName() {
		return getProduct;
	}

	public void setGetProductName(String getProduct) {
		this.getProduct = getProduct;
	}
}
