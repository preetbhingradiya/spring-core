package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class TestExpression {
	
    @Value("#{ T(java.lang.Math).sqrt(25) }")     
    private double num; // Instance variable

    public void printNum() {
        System.out.println(num); // Accessing the instance variable
    }
    
    
    @Value(" #{ T(com.springcore.spel.Example).add(5,10) }")
    private int sum;
    
    @Value(" #{ T(com.springcore.spel.Example).APP_NAME } ")
    private String stringValue;
    
    @Value("#{ new com.springcore.spel.Person('Navin-Kumar') }")
    private Person person;
 
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("expressionLanguage.xml");
		
		TestExpression test = context.getBean(TestExpression.class); 
        test.printNum();
        
        System.out.println(test.sum);
        System.out.println(test.stringValue);
        System.out.println(test.person.getName());
		
	}
	
}
