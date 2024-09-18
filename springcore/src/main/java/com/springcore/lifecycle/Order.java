package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Order {
	


	private String address;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public Order() {
		super();
	}

	
	@Override
	public String toString() {
		return "Order [address=" + address + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init method from @ ");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Init method from @ ");
	}
}
