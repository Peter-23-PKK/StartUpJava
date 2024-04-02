package com.sci;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method_one();
	}

	private static void method_one() {
		// TODO Auto-generated method stub
		method_two();
	}

	private static void method_two() {
		// TODO Auto-generated method stub
		method_three();
	}

	private static void method_three() {
		// TODO Auto-generated method stub
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End");
	}

}
