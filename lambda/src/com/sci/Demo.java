package com.sci;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface objInterface = new MyInterface() {

			@Override
			public int sum(int i, int j) {
				// TODO Auto-generated method stub
				return i + j;
			}
		};

		System.out.println("Total By Anno :: " + objInterface.sum(10, 20));

		MyInterface objInterface2 = (i, j) -> {
			return i + j;
		};

		System.out.println("Total By Anno :: " + objInterface2.sum(50, 20));

		MyInterface objInterface3 = (a, b) -> a + b;

		System.out.println("Total By Anno :: " + objInterface3.sum(59, 20));

		MyInter2 objInterface4 = (s) -> Integer.parseInt(s);

		System.out.println("Integer :: " + objInterface4.convert("4"));
	}

}

@FunctionalInterface
interface MyInterface {
	int sum(int i, int j);
}

interface MyInter2 {
	int convert(String str);
}
