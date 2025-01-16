package com.ticket.utils;

import java.time.LocalDate;
import java.util.Scanner;

public class InputUtils {

	private static Scanner scanner = new Scanner(System.in);

	public static String getString(String messages) {
		System.out.println(messages);
		return scanner.nextLine();
	}

	public static int getNumber(String messages) {
		for (;;) {
			try {
				return Integer.parseInt(getString(messages));
			} catch (Exception e) {
				System.out.println("Enter Valid Number!");
			}
		}
	}

	public static LocalDate getDate(String messages) {
		for (;;) {
			try {
				return LocalDate.parse(getString(messages));
			} catch (Exception e) {
				System.out.println("Enter Valid Date Format!");
			}
		}
	}

}
