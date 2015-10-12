package com.sapient.models;


import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Customer {
	@NotEmpty
	private String name;
	
	@Range(min=18, max=60)
	private int age;
	
	public Customer() {
		
	}
	
	public Customer(int age, String name){
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
