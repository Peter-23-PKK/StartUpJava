package com.sci;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		int deposit = 100000;
		int item = 3;
		int count = 10;
		int totalAmount = 0;

		if (item == 1) {
			totalAmount = calculate("Apple", 1500, count);
		} else if (item == 2) {
			totalAmount = calculate("Orange", 500, count);
		} else if (item == 3) {
			totalAmount = calculate("Mango", 1000, count);
		}
		System.out.println("Remain Amount : " + (deposit - totalAmount));
	}

	private static int calculate(String name, int price, int count) {
		int totalAmount;
		totalAmount = count * price;
		System.out.println(name + " => " + count);
		System.out.println("Amount => " + totalAmount);
		return totalAmount;
	}

	
	
	
	
	
	
	private static void showMenuByMe(int deposit, int item, int count) {

		System.out.println("1. Apple  -> 1500 MMK");
		System.out.println("2. Orange  -> 500 MMK");
		System.out.println("3. Mango  -> 1000 MMK");

		int price = 0;
		if (item == 1) {
			price = 1500;
		} else if (item == 2) {
			price = 500;
		} else if (item == 3) {
			price = 1000;
		}
		int finalDeposit = deposit - price * count;

		System.out.println("Remaining deposit is " + finalDeposit + " MMK");
	}
}
