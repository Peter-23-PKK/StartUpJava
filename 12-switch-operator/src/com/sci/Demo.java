package com.sci;

public class Demo {

	public static void main(String[] args) {
		int index = 100;
		switch (index) {
		case 10: {
			System.out.println("Index Value : " + index);
			break;
		}
		case 20: {
			System.out.println("Index Value : " + index);
			break;
		}
		case 30: {
			System.out.println("Index Value : " + index);
			break;
		}
		case 40: {
			System.out.println("Index Value : " + index);
			break;
		}
		case 50: {
			System.out.println("Index Value : " + index);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + index);
		}

	}

}
