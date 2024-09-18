package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj")
@Scope("singleton") //=> by defualt use beans to create obj is singleton means only one time create object and use same obj refrence mnay time
public class Student {
	
	@Value("1")
	private int studentId;
	
	@Value("Navin")
	private String studentName;
	
	@Value("#{temp}")
	private List<String> address;
	
//    public Student(@Value("1") int studentId, @Value("Navin") String studentName) {
//        this.studentId = studentId;
//        this.studentName = studentName;
//    }
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address + "]";
	}
	
}
