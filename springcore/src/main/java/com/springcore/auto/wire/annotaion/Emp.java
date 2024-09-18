package com.springcore.auto.wire.annotaion;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

    @Autowired   //autometic create object use of this annotaion in property
	private Address address;
	
	public Emp() {
		super();
	}
	
	
	//@Autowired   //parameterized construcotr for annotaion
	public Emp(Address address, Address ad1) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}
	
	
	//@Autowired  //use of setter metthod for annotaion
	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Emp [address=" + address +  "]";
	}
}
