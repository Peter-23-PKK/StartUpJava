package com.sci;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		map.put(null, null);
		map.put(1, "Apple");
		map.put(2, "Orange");
		map.put(2, "Apple");
		map.put(2, "Mango");
		
		System.out.println(map);

		System.out.println(map.get(null));
		System.out.println(map.get(1));

		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());

		System.out.println();

		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		treeMap.put(null, null);
		treeMap.put(1, "Apple");
		treeMap.put(2, "Orange");
		treeMap.put(2, "Apple");
		treeMap.put(2, "Mango");
		

		System.out.println(treeMap);

		System.out.println(treeMap.get(null));
		System.out.println(treeMap.get(1));

		System.out.println(treeMap.keySet());
		System.out.println(treeMap.values());
		System.out.println(treeMap.entrySet());

		System.out.println();

		for (Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
