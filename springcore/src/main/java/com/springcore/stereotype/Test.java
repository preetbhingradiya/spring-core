package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeCon.xml");
		
		//Student stud1 = context.getBean("student", Student.class); // @components convert class in to samller case to write hete
		
		Student stud1 = context.getBean("obj", Student.class);
//		System.out.println(stud1);
		
		System.out.println(stud1);
		
		Student stud2 = context.getBean("obj", Student.class);
		System.out.println("stud1 obj " + stud1.hashCode());
		System.out.println("stud2 obj " + stud2.hashCode());
		
		
		//Prototype object => every time create new object of same class
//		Student stud3 = new Student();	
//		System.out.println(stud3.hashCode());
//		
//		Student stud4 = new Student();	
//		System.out.println(stud4.hashCode());
	
		
	}

}


