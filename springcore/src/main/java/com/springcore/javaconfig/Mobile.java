package com.springcore.javaconfig;

public class Mobile {
	
	public static final String mobileName = "Sumsang";
	
	private int pricae;
	
	public int getPricae() {
		return pricae;
	}
	
	public void setPricae(int pricae) {
		this.pricae = pricae;
	}

	
	public String version(String name) {
		return "Mobile version is " + name ;
	}
}
