package com.methodref;

import java.util.List;

public class MethodRefDemo {

	public static void main(String[] args) {

		PersonInterface personInterface = a -> System.out.println(a);

		PersonInterface personInterface2 = Person::print;

		personInterface2.showName("Kyaw Gyi");

		Person person = new Person();

		PersonInterface2 personInterface22 = person::getName;

		PersonInterface3 personInterface3 = Person::new;

		PersonInterface4 personInterface4 = Person::new;

	}

}

class Person {

	public Person() {
		System.out.println("Person :: Con");
	}

	public static void print(String data) {
		System.out.println("Printing " + data);
	}

	public String getName() {
		return "Zaw Zaw ";
	}
}

interface PersonInterface {

	void showName(String name);
}

interface PersonInterface2 {

	String get();
}

interface PersonInterface3 {
	void get();
}

interface PersonInterface4 {
	Person get();
}