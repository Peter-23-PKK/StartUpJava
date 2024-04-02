package com.sci;

public class Demo {

	public static void main(String[] args) {
		sum();
		sum(10);
		sum(10,20);
		sum(10,20,30);

	}

	public static void sum(int ...data) {
		for(int j : data) {
			System.out.print(j + " ");
		}
		System.out.println();
	}
}
