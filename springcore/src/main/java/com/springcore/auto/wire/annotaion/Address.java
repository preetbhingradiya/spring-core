package com.springcore.auto.wire.annotaion;

public class Address {

	private String street;
	private String city;
	
    // Constructor for XML configuration
    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    // Default constructor (optional but useful for other injection methods)
    public Address() {}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}

}
