package com.sci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList<String>();
		Collections.addAll(strList, "Hello", "Java", "Generic", "Collection", null);

		System.out.println(strList.get(0));
		System.out.println(strList);

		for (String str : strList) {
			System.out.println(str);
		}

		strList.add(2, "array list");
		System.out.println(strList);

		int[] index = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		Arrays.asList(index);
	}

}
