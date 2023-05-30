package com.springcore.lifecycle;

public class Car {
	
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting price...");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + "]";
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		System.out.println("Inside init method ...");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method...");
	}
}
