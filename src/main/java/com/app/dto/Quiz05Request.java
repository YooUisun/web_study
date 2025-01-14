package com.app.dto;

public class Quiz05Request {
	String category;
	int product;	//4000 //만약 문자가 섞여있다면 String product 로 하면 됨.
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getProduct() {
		return product;
	}
	public void setProduct(int product) {
		this.product = product;
	}
	
	
}
