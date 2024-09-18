package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/ref.xml");
		
		A num = (A) context.getBean("aref");
		
		System.out.println("Value from A class : " + num.getaValue());
		System.out.println("Value from B class : " + num.getObj().getbValue());
		
		System.out.println(num);
	}

}
