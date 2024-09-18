package com.springcore.auto.wire.annotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RunClass {

	public static void main(String[] args) {
		ApplicationContext context	= new ClassPathXmlApplicationContext("autoAnnotationConfig.xml");
//		Emp emp = context.getBean("emp1", Emp.class);
//		
//		System.out.println(emp);
//		
		
		System.out.println("-----Qulifier-----");
		EmpQulifier emp1 = context.getBean("emp2", EmpQulifier.class);
		
		System.out.println(emp1);
		
	}
}

//If @Autowired annotation will be added on :
//1) property , only default constructor will be called.
//2) setter method , both default constructor and setter method will be called.
//3) parameterised constructor , only parameterised constructor will be called.