package com.sci.constructorchaining;

public class Person {
	
	public Person() {
		System.out.println("Person : No Args");
	}

	public Person(String name) {
		this();
		System.out.println("Person : Const");
	}
}
