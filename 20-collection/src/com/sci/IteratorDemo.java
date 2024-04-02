package com.sci;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> nums = List.of(1, 2, 3, 4, 5);
		Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			if (itr.next() == 5) {
				itr.remove();
			}
		}
		System.out.println(list);
//		nums.add(20);
//		System.out.println(nums);
//		conCuurentException(nums);
	}

	private static void conCuurentException(List<Integer> list) {
		for (int num : list) {
			if (num == 5) {
				list.remove(num);
			}
		}
	}

}
