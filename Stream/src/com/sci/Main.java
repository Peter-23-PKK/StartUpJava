package com.sci;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int sum = findTotal(list);
		System.out.println(sum);

		System.out.println(list.stream().mapToInt(num -> num).sum());

	}

	private static int findTotal(List<Integer> list) {
		int data = 0;
		for (int i : list) {
			data += i;
		}
		return data;
	}

}
