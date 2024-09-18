package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  // configuration is use of like xml file to configure which file use

//if use bean annotaion no need componentScan
//@ComponentScan(basePackages = "com.springcore.javaconfig")  //componentscan work like context:component-scan tag to create object of component class
public class JavaConfig {
	
	@Bean
	public Mobile getMobile() {
		Mobile s1 = new Mobile();
		s1.setPricae(22000);
		return s1;
	}
	
	@Bean   //use method name as bean id
	public Product getProduct() {
		//create a new product object to said ioc conatiner store this obj in cintainer
		Product product = new Product(getMobile());
		
		return product;
		
	}

}
