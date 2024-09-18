package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student s1 = (Student) context.getBean("student1");
        
        
       
        Student s2 = (Student) context.getBean("student2");
        
        System.out.println("Studnet 1 city name : " + s1.getStudentAddress());
        System.out.println("Studnet 2 city name : " + s2.getStudentAddress());
    }
}
