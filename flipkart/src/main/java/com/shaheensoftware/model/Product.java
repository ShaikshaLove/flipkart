package com.shaheensoftware.model;

public class Product {

	private String productName;
	private Double productPrice;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public Product(String productName, Double productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productPrice=" + productPrice + "]";
	}
}
