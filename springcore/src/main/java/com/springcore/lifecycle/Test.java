package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
public class Test {

	public static void main(String[] args) {
		 AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		 context.registerShutdownHook();
		 
//		 Car ferrari = (Car) context.getBean("c1");
//		 System.out.println(ferrari);
//		 System.out.println("----------------------------------------------------------------");
//		 Bike r15 = (Bike) context.getBean("b1");
//		 System.out.println(r15);
		
		Example e1 = (Example) context.getBean("e1");
		System.out.println(e1);
	}

}
