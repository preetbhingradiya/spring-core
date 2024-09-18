package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Category  implements InitializingBean, DisposableBean{
	
	private String model;
	private String version;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	

	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Category [model=" + model + ", version=" + version + "]";
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Taking category : init interface");
	}
	@Override
	public void destroy() throws Exception {
	
		System.out.println("print category : destroy interface");
	}
	
	
}
