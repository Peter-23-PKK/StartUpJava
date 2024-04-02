package com.sci;

public class StarLooping {

	public static void main(String[] args) {
		loopOne();
		System.out.println();
		loopTwo();
		System.out.println();
		loopThree();
		System.out.println();
		loopFour();
		System.out.println();
		loopFIve();
	}

	private static void loopFIve() {
		for (int i = 1; i < 6; i++) {
			for (int j = 6; j > i; j--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	private static void loopFour() {
		for (int i = 0; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static void loopThree() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
	}

	private static void loopTwo() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void loopOne() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
