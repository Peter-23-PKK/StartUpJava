package com.sci;

import java.util.Objects;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		String str1 = "hello";
		String str2 = new String("hello");
		String str3 = new String("hello");

		str = "Hello World";
		str.concat(" PKK");

		Person p = new Person("Kyaw Kyaw");
		Person p2 = new Person("Kyaw Kyaw");

		System.out.println("str == str1 : " + (str == str1));
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str2 == str3 : " + (str2 == str3) + "\n");

		System.out.println("str.equals(str2) : " + str.equals(str1));
		System.out.println("str2.equals(str3) : " + str1.equals(str2));
		System.out.println("str3.equals(str4) : " + str2.equals(str3) + "\n");

		System.out.println("Str memory : " + System.identityHashCode(str));
		System.out.println("Str1 memory : " + System.identityHashCode(str1));
		System.out.println("Str2 memory : " + System.identityHashCode(str2));
		System.out.println("Str3 memory : " + System.identityHashCode(str3) + "\n");

		System.out.println("P Memory : " + System.identityHashCode(p));
		System.out.println("P2 Memory : " + System.identityHashCode(p2) + "\n");

		System.out.println("p == p2 " + (p == p2));
		System.out.println("p.equals(p2) " + p.equals(p2));

	}

}

class Person implements Comparable<Person> {

	private String name;

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		return 0;
	}

}
