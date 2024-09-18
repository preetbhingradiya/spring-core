package com.springcore.auto.wire;

public class Emp {

	// this varible name and beans Address class name same for required
	private Address address;
	private Address ad1;

	public Emp() {
		super();
	}

	public Emp(Address address, Address ad1) {
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
