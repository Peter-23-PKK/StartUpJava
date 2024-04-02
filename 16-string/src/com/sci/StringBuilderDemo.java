package com.sci;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");

		System.out.println("Sb memory : " + System.identityHashCode(sb));

		sb.append(" World");

		System.out.println("Sb memory : " + System.identityHashCode(sb));

	}

}
