package com.variable;

public class Main {

	public static void main(String[] args) {
		Person.salary = 100000;
		Person.print();
		
		Person p = new Person();
		p.name = "Aung Aung";
		p.age = 22;
		p.show();
		
	}
}
