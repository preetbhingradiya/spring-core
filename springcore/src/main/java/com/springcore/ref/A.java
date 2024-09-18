package com.springcore.ref;

public class A {

	private int aValue;
	private B obj;
	

	public A() {
		super();
	}
	
	
	public int getaValue() {
		return aValue;
	}
	public void setaValue(int aValue) {
		this.aValue = aValue;
	}
	public B getObj() {
		return obj;
	}
	public void setObj(B obj) {
		this.obj = obj;
	}


	@Override
	public String toString() {
		return "A [aValue=" + aValue + ", obj=" + obj + "]";
	}
	
	
	

}
