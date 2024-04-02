package com.sci.person;

public class Person {
	protected Person getP(Person p) {
		return p;
	}
}

class Student extends Person {
	
	@Override
	public Student getP(Person p) {
		return (Student) p;
	}
}

class UniStudent extends Student {
	
	@Override
	public UniStudent getP(Person p) {
		return (UniStudent) p;
	}
}
