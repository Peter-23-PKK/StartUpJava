package com.shop.service;

import java.util.List;

import com.shop.dto.Item;

public interface ItemService {

	void create(Item item);

	void update(Item item);

	Item findById(int id);

	List<Item> findAll();

	void delete(int id);
	
}
