package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleConfig.xml");

//		Product p1 = (Product) context.getBean("mobile");
//		System.err.println(p1);
		context.registerShutdownHook();
		
		
		//Write life cycle use of interface
		
//		System.out.println("-----Interface Life Cycle-----");
//		
//		Category c1 = (Category) context.getBean("s1");
//		
//		System.out.println(c1);
		
		
		//Write life cycle use of @ Anotation
		Order c1 = (Order) context.getBean("o1");
		
		System.out.println(c1);
	}

}
