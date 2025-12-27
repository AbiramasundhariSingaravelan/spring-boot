package com.example.demo;

public class Customer {

	private String username;
	private String pdtName;
	private String quantity;
	private String price;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPdtName() {
		return pdtName;
	}
	public void setPdtName(String pdtName) {
		this.pdtName = pdtName;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String username, String pdtName, String quantity, String price) {
		super();
		this.username = username;
		this.pdtName = pdtName;
		this.quantity = quantity;
		this.price = price;
	}
	
}
