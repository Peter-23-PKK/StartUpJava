package com.sci.repo;

import java.util.List;

import com.shop.dto.Item;

public interface ItemRepo {

	void create(Item item);

	void update(Item item);

	Item findById(int id);

	List<Item> findAll();

	void delete(int id);
}
