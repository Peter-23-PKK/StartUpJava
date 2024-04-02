package com.sci;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		List<String> list= new ArrayList<>();
		
//		printData(null);
		
		printWithWildCard(list);
		printWithWildCard(set);
	}
	
	public static void printData(Collection<Object> list) {
		for(Object object : list) {
			System.out.println(object);
		}
	}
	
	public static void printWithWildCard(Collection<?> list) {
		for(Object object : list) {
			System.out.println(object);
		}
	}

}
