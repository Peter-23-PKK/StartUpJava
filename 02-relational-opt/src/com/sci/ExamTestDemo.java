package com.sci;

/**
 * mark = 40;
 */
public class ExamTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		markOver40();
		boolean b1 = getFalse() && getTrue() && getTrue();
		boolean b2 = getFalse() || getTrue();
	}

	public static void markOver40() {
		int mark = 39;
		System.out.println("Is she Pass? " + !(mark >= 40));
		System.out.println("Is she Fail " + !(mark < 40));
	}

	public static boolean getFalse() {
		return false;
	}

	public static boolean getTrue() {
		return true;
	}

}
