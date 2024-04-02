package com.sci.repo;

import java.util.List;

import com.shop.dto.Item;

public class ItemRepoImpl implements ItemRepo {

	private static ItemRepoImpl instance;

	private ItemRepoImpl() {

	}

	public static ItemRepoImpl getInstance() {
		return instance = instance != null ? instance : new ItemRepoImpl();
	}

	@Override
	public void create(Item item) {
		// TODO Auto-generated method stub
		System.out.println("Item Repo Created");
	}

	@Override
	public void update(Item item) {
		// TODO Auto-generated method stub

	}

	@Override
	public Item findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
