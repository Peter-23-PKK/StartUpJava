package com.sci;

public class JUnitTestExample {

	static void beforeAll() {
		System.out.println("Before All :: execute Once.");
	}

	static void beforeEach() {
		System.out.println("Before Each :: execute each after test method.");
	}

	void test_one() {
		System.out.println("Test One !!");
	}

	void test_two() {
		System.out.println("Test two !!");
	}

	static void afterAll() {
		System.out.println("After All :: execute Once.");
	}

	static void afterEach() {
		System.out.println("After Each :: execute each after test method.");
	}

}
