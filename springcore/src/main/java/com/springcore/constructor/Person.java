package com.springcore.constructor;

import java.util.List;

public class Person {
		
	private int personId;
	private String name;
	private Age age;
	private List<String> hobbies;
	
	public Person(int personId, String name, Age age, List<String> hobbies) {
	    this.personId = personId;
	    this.name = name;
	    this.age = age;
	    this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", age=" + age + ", hobbies=" + hobbies + "]";
	}



	
}
