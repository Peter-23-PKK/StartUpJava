package com.sci;

import java.util.ArrayList;
import java.util.List;

public class AfterGeneric {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Hello");
		list.add("Generic");
		
		for(String str : list) {
			System.out.println(str);
		}
		
	}

}
