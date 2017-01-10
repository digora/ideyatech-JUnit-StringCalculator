package com.ideyatech.ut.exercise;

import java.util.ArrayList;

public class PromoEditor {
	private ArrayList<Promo> promoList = new ArrayList<Promo>();
	
	public void initPromoList(){
		promoList.add(new Promo(0, "SMALL", 3, "UNLI_1GB"));
		promoList.add(new Promo(1, "LARGE", 5, "UNLI_1GB"));
		promoList.add(new Promo(2, "MEDIUM", 1, "1GB_ADDTL"));
	}
	
	public void addPromo(String b, int c, String e){
		promoList.add(new Promo(promoList.size()+1, b, c, e));
	}
	
	public void editPromo(int promoID, String newName, int newBuyQty, String newProduct){
		Promo promo = promoList.get(promoID-1);
		promo.setProdName(newName);
		promo.setBuyQty(newBuyQty);
		promo.setGetProductName(newProduct);
	}
	
	public ArrayList<Promo> getPromoList() {
		this.initPromoList();
		return promoList;
	}
}
