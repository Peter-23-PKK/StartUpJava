package com.shop.dto;

public enum ShopOperation {

	ShowAll, Create, Update, Delete, Search;

	@Override
	public String toString() {
		return (ordinal() + 1) + "." + name();
	}
}
