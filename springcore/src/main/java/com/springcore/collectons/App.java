package com.springcore.collectons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Emp emp1 = (Emp) context.getBean("emp1");

		System.out.println(emp1.getName());
		System.out.println(emp1.getPhone());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getCourses());

		System.out.println("---------");
		Emp emp2 = (Emp) context.getBean("emp2");

		System.out.println(emp2.getName());
		System.out.println(emp2.getPhone());
		System.out.println(emp2.getAddress());
		System.out.println(emp2.getCourses());

	}

}
