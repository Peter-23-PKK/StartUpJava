package com.shop.util;

import java.util.Scanner;

public class ShopUtil {

	private static Scanner scan = new Scanner(System.in);

	public static String getString(String message) {
		System.out.println(message);
		return scan.nextLine();
	}

	public static int getInt(String message) {
		for (;;) {
			try {
				return Integer.parseInt(getString(message));
			} catch (Exception e) {
				System.out.println("Please Enter Digit Only !!");
			}
		}
	}
}
