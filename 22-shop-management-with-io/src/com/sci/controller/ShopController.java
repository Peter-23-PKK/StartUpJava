package com.sci.controller;

import java.util.Arrays;
import java.util.List;

import com.shop.dto.ShopOperation;
import com.shop.service.ItemService;
import com.shop.service.ItemServiceImpl;
import com.shop.util.ShopUtil;

public class ShopController {

	private ItemService service;

	public ShopController() {
		service = ItemServiceImpl.getInstance();
	}

	public void open() {
		int menu = showMenu();
		doOperation(ShopOperation.values()[menu - 1]);
	}

	private void doOperation(ShopOperation opt) {
		switch (opt) {
		case ShowAll: {
			showAll();
			break;
		}
		case Create: {
			create();
			break;
		}
		case Update: {
			update();
			break;
		}
		case Delete: {
			delete();
			break;
		}
		case Search: {
			search();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opt);
		}
	}

	private void search() {
		System.out.println("search");
	}

	private void delete() {
		System.out.println("delete");
	}

	private void update() {
		System.out.println("update");
	}

	private void create() {
		System.out.println("create");
	}

	private void showAll() {
		System.out.println("show all");
	}

	private int showMenu() {
		Arrays.asList(ShopOperation.values()).forEach(System.out::println);
		return ShopUtil.getInt("Select Menu :");
	}
}
