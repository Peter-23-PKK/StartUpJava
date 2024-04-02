package com.sci;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lists = List.of("Phyo", "Khant", "Kyaw");
		for (int i = lists.size(); i > 0; i--) {
			System.out.println(lists.get(i-1));
		}
	}

}
