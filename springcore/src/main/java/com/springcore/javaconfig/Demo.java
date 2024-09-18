package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context =  new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Product p1 = context.getBean("getProduct", Product.class);
		System.out.println(p1);
		p1.productName();
		
		Mobile m1 = context.getBean("getMobile", Mobile.class);
		System.out.println(m1);
	}

}
