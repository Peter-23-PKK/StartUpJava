package com.sci;

public class LoopingDemo {

	public static void main(String[] args) {
		whileLoop();
		// doWhileLoop();
	}

	private static void whileLoop() {
		int i = 10;
		int loopCount = 0;
		while (isTrue(i)) {
			System.out.println(i);
			i++;
			loopCount++;
		}
		System.out.println("\nLoop Count " + loopCount);
	}

	public static boolean isTrue(int i) {
		return i < 20;
	}

	public static void doWhileLoop() {
		int i = 10;
		do {
			System.out.println(i);
			i++;
		} while (i < 10);
	}
}
