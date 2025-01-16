package com.sci;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Person> pList = new ArrayList<Person>();
		Collections.addAll(pList, new Person("Kyaw Kyaw", 12), new Person("Kyaw Aung", 12), new Person("Ko Ko", 12),
				new Person("Kyaw Kyaw", 12));
		int total = list.stream().mapToInt(a -> {
			System.out.println("Numbers : " + a);
			return a;
		}).sum();
		System.out.println("Total : " + total);
		boolean b = pList.stream().map(p -> p.getName()).allMatch(p -> p.contains("Kyaw"));
		System.out.println(b);
	}

}

class Person {

	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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