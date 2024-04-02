package com.shop.controller;

import java.util.Scanner;

import com.shop.dto.Item;

public class ShopController {

	private static Item[] items = { new Item("Apple", 1500, 200), new Item("Orange", 500, 100),
			new Item("Mango", 1000, 300) };

	private Scanner scan = new Scanner(System.in);

	private int paidAmount = 0;

	private int amount = 0;

	public void open() {
		String ans;
		do {
			showMenu();
			int menu = Integer.parseInt(getInput("Select Menu : "));
			int qty = Integer.parseInt(getInput("Select Quantity : "));
			if (qty <= items[menu - 1].getQuantity()) {
				amount += sale(menu, qty);
			} else {
				if (items[menu - 1].getQuantity() <= 0) {
					System.out.println("We are out of Stock");
				} else {
					if (getInput(
							"Sorry,we have only " + items[menu - 1].getQuantity() + " left.\nDo you want all of it?Y/N")
							.equalsIgnoreCase("Y")) {
						amount += sale(menu, items[menu - 1].getQuantity());
					}
				}
			}
			ans = getInput("Do you want other fruits?Y/N");
		} while (ans.equalsIgnoreCase("Y"));
		System.out.println("Total Amount is " + amount + " MMK");
		int refund = payment();
		System.out.println("Refund" + refund + " MMK");
	}

	private int payment() {
		paidAmount += Integer.parseInt(getInput("Enter amount :"));
		if (paidAmount <= amount) {
			System.out.println("Need to Pay" + (amount - paidAmount) + " MMK");
			payment();
		}
		return paidAmount - amount;
	}

	private int sale(int menu, int qty) {
		int amount = qty * items[menu - 1].getPrice();
		items[menu - 1].setQuantity(items[menu - 1].getQuantity() - qty);
		return amount;
	}

	private void showMenu() {
		for (int i = 0; i < items.length; i++) {
			//System.out.println(i + 1 + ". " + items[i].getName() + " => " + items[i].getPrice() + " MMK [ "
				//	+ items[i].getQuantity() + " ]");
			System.out.printf("%-2d. %-12s => %-5d MMK [%2d] %n", i + 1, items[i].getName(), items[i].getPrice(),
					items[i].getQuantity());
		}
	}

	private String getInput(String message) {
		System.out.println(message);
		return scan.nextLine();
	}
}
