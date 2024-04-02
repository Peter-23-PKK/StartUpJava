package com.sci;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Aung Aung", 22);
		Person p2 = new Person("Phyo Phyo", 33);

		p1.setName("Kyaw Kyaw");

		String p1Name = p1.getName();
		String p2Name = p2.getName();

		System.out.println(p1Name);
		System.out.println(p2Name);
	}

}
