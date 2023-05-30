package com.springcore.ci;

public class Person {
	private String name;
	private int id;
	private Certificate certi;
	

	Person(String name, int id ,Certificate certi) {
		this.name = name;
		this.id = id;
		this.certi = certi;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " : " + this.id+" { "+this.certi+" } ";
	}

}
