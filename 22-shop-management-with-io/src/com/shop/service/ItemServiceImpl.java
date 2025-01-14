package com.shop.service;

import java.util.List;

import com.sci.repo.ItemRepo;
import com.sci.repo.ItemRepoImpl;
import com.shop.dto.Item;

public class ItemServiceImpl implements ItemService {

	private static ItemServiceImpl instance;
	private ItemRepo repo;

	private ItemServiceImpl() {
		repo = ItemRepoImpl.getInstance();
	}

	public static ItemServiceImpl getInstance() {
		return instance = instance != null ? instance : new ItemServiceImpl();
	}

	@Override
	public void create(Item item) {
		// TODO Auto-generated method stub
		repo.create(item);
	}

	@Override
	public void update(Item item) {
		// TODO Auto-generated method stub
		repo.update(item);
	}

	@Override
	public Item findById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.delete(id);

	}

}
