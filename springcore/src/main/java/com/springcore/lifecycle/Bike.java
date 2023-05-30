package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bike implements InitializingBean , DisposableBean {
	private int price;

	@Override
	public String toString() {
		return "Bike [price=" + price + "]";
	}

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Driving Bike : init ....");
	}

	public void destroy() throws Exception {
	  System.out.println("Shut down the  bike : destroy method....");
		
	}

}
