package com.methodref;

public class Employee {

	public void print(String name, int age) {
		System.out.println(name + " " + age);
	}
}

interface EmpInterface<T, U, R> {

	void save(T t, U u, R r);
}