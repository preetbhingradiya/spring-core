package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//@Component("product")
public class Product {
	
	private Mobile samsung;
	
	public void productName() {
		System.out.println(samsung.version("S13"));
		System.out.println(samsung.getPricae());
		System.out.println("Product is " + samsung.mobileName);
	}
	
	public Product(Mobile samsung) {
		super();
		this.samsung = samsung;
	}

	public Mobile getSamsung() {
		return samsung;
	}

	public void setSamsung(Mobile samsung) {
		this.samsung = samsung;
	}
}
