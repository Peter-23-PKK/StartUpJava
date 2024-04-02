package com.sci.singlaton;

public class Demo {

	public static void main(String[] args) {
//		Person p = new Person("Kyaw Kyaw");
//		Person p2 = new Person("Zaw Zaw");
		Person p = Person.getInstance();
		Person p2 = Person.getInstance();
		p.setName("Kyaw Kyaw");
		p.setName("Aung Kyaw");

		System.out.println(p.getName());
		System.out.println(p2.getName());

	}

}
