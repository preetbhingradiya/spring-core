package com.springcore.auto.wire.annotaion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.springcore.auto.wire.annotaion.Address;

public class EmpQulifier {
	
	private Address address;
	private Address ad1;

	public EmpQulifier() {
		super();
	}
	
	@Autowired
	public EmpQulifier(@Qualifier("address") Address address, @Qualifier("ad1") Address ad1) {
		super();
		this.address = address;
		this.ad1 = ad1;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAd1() {
		return ad1;
	}

	public void setAd1(Address ad1) {
		this.ad1 = ad1;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + ", ad1=" + ad1 + "]";
	}
	
}
