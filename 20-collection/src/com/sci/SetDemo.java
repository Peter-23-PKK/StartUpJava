package com.sci;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		LinkedHashSet<Integer> link = new LinkedHashSet<Integer>();

		hashSet.add(100);
		treeSet.add(100);
		link.add(100);
		
		for (int i = 10; i >= 0; i--) {
			hashSet.add(i);
			treeSet.add(i);
			link.add(i);
		}
		
		hashSet.add(30);
		treeSet.add(30);
		link.add(30);
		
		hashSet.add(100);
		treeSet.add(100);
		link.add(100);
		
		hashSet.add(null);
//		treeSet.add(null);
		link.add(null);

		System.out.println("HashSet : " + hashSet);
		System.out.println("TreeSet : " + treeSet);
		System.out.println("LinkedHashSet : " + link);
	}

}
