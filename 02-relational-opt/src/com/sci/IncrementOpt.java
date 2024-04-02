package com.sci;

public class IncrementOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		postIncrement();
		preIncrement();
	}

	public static void preIncrement() {
		int i = 10;
		int j = 12;
		int k = ++i + j;
		System.out.println("PreIncrement :" + k);
	}

	public static void postIncrement() {
		int i = 10;
		int j = 12;
		int k = i++ + j;
		System.out.println("PostIncrement :" + k);
		System.out.println(i);
	}

}
