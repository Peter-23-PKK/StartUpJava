package com.sci;

public class Test {

	public static void main(String[] args) {
		int myanmar = 60;
		int english = 60;
		int math = 40;
		if (myanmar >= 60 && english >= 60) {
			System.out.println("Pass the exam");
		} else if (english >= 60 && math >= 60) {
			System.out.println("Pass the exam");
		} else if (math >= 60 && myanmar >= 60) {
			System.out.println("Pass the exam");
		} else {
			System.out.println("Fail the exam");
		}

	}

}
