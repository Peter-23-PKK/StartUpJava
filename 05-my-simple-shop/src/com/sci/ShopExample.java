package com.sci;

import java.util.Scanner;

public class ShopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		showMessage("Please enter deposit");
		int deposit = scan.nextInt();
		showMessage("Please select products.");
		int productId = scan.nextInt();
		showMessage("Please choose quantity.");
		int count = scan.nextInt();

		int totalAmount = 0;

		if (productId == 1) {
			totalAmount = calculate("Apple", 1500, count);
		} else if (productId == 2) {
			totalAmount = calculate("Orange", 500, count);
		} else if (productId == 3) {
			totalAmount = calculate("Mango", 1000, count);
		}

		System.out.println("Ramain deposit amount => " + (deposit - totalAmount));
		
		scan.close();
	}
	
	public static void showMessage(String message) {
		System.out.println(message);
	}

	private static int calculate(String name, int price, int count) {
		int totalAmount;
		totalAmount = count * price;
		System.out.println("Quantity of the " + name + " => " + count);
		System.out.println("Total amount => " + totalAmount);
		return totalAmount;
	}

}
