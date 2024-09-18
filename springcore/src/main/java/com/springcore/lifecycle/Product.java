package com.springcore.lifecycle;

public class Product {
	


	private double price;
	
	public double getPrice() {
		return price;
	}

	
	public void setPrice(double price) {
		System.out.println("Setting Price");
		this.price = price;
	}


    public Product() {
        super();
    }


	@Override
	public String toString() {
		return "Product [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Call init life cycle method");
	}
	
	public void destroy() {
		System.out.println("Call destroy life cycle method");
	}
}
