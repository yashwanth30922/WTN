package com.wipro.inheritence;

public class Person {
	String name;
	public Person(String n) {
		name=n;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	String getNameOfPerson() {
		return name;
	}
}
