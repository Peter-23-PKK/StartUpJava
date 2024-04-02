package com.sci.controller;

import java.util.Scanner;

import com.sci.dto.Item;

public class ShopController {

	private static Item[] items = { new Item("Apple", 1500, 200), new Item("Orange", 500, 100),
			new Item("Mango", 1000, 300) };

	private Scanner scan = new Scanner(System.in);

	private static int totalAmount = 0;

	private static int deposit = 0;

	public void open() {
		String ans = null;
		int menu;
		int quantity;
		do {
			showMenu();
			menu = Integer.parseInt(getInput("Select Menu : "));
			quantity = Integer.parseInt(getInput("Select Quantity : "));
			Item item = getItemById(menu - 1);
			if (item.getQuantity() == 0) {
				System.out.println("Selected Item is out of stock.");
				ans = getInput("Do you want other fruits? Y/N ");
				if (!ans.equalsIgnoreCase("Y")) {
					break;
				}
			} else if (item.getQuantity() < quantity) {
				ans = getInput("Sorry we don't have enough stock. We have only " + item.getQuantity()
						+ " left. Do you want all of it? Y/N ");
				if (ans.equalsIgnoreCase("Y")) {
					updateItem(item, true, 0);
					totalAmount += (item.getPrice() * quantity);
				} else {
					ans = getInput("Do you want other fruits? Y/N ");
					if (!ans.equalsIgnoreCase("Y")) {
						break;
					}
				}
			} else {
				updateItem(item, false, quantity);
				totalAmount += (item.getPrice() * quantity);
				ans = getInput("Do you want other fruits? Y/N ");
				if (!ans.equalsIgnoreCase("Y")) {
					break;
				}
			}
		} while (true);
		System.out.println("Your Total Amount : " + totalAmount + " MMK");
		do {
			deposit += Integer.parseInt(getInput("Your Payment : "));
			if (deposit < totalAmount) {
				System.out.println("Sorry,need to pay more.");
			} else {
				System.out.println("Refund : " + (deposit - totalAmount) + " MMK");
				System.out.println("Thank you.");
				break;
			}
		} while (true);
	}

	private void updateItem(Item item, boolean b, int quantity) {
		if (b) {
			item.setQuantity(quantity);
		} else {
			item.setQuantity(item.getQuantity() - quantity);
		}
	}

	private void showMenu() {
		for (int i = 0; i < items.length; i++) {
			System.out.println(i + 1 + ". " + items[i].getName() + " => " + items[i].getPrice() + " MMK [ "
					+ items[i].getQuantity() + " ]");
		}
	}

	private String getInput(String message) {
		System.out.println(message);
		return scan.nextLine();
	}

	private Item getItemById(int itemId) {
		for (int i = 0; i < items.length; i++) {
			if (i == itemId) {
				return items[i];
			}
		}
		return null;
	}

}
