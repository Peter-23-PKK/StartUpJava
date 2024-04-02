package com.sci.singlaton;

public class Person {

	private String name;
	private static Person p;

	private Person() {
		super();
	}

	public static Person getInstance() {
		return p == null ? p = new Person() : p;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
