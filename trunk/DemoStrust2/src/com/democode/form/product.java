package com.democode.form;

public class product {
	private String proID;
	private String proName;
	private String proDesc;
	private int proPrice;
	private int quantity;
	
	public product(String id, String name, String desc, int price, int quantity)
	{
		this.proID = id;
		this.proName = name;
		this.proDesc = desc;
		this.proPrice = price;
		this.quantity = quantity;
	}
	
	
	
	public String getProID() {
		return proID;
	}
	public void setProID(String proID) {
		this.proID = proID;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProDesc() {
		return proDesc;
	}
	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}
	public int getProPrice() {
		return proPrice;
	}
	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
