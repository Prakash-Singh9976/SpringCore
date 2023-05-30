package com.springcore.autowire.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	@Autowired
	private Address address;

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor...");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setting values...");
	}
}
