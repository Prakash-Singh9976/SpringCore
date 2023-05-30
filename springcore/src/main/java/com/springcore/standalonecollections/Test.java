package com.springcore.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	
	   ApplicationContext context	= new ClassPathXmlApplicationContext("com/springcore/standalonecollections/aloneconfig.xml");
	   
	   Person person1 = context.getBean("person1",Person.class);
	   System.out.println(person1);
	   
	   System.out.println(person1.getFriends());
	   System.out.println(person1.getFeestructure());
	   System.out.println(person1.getProperties());
	  
	}
}
 