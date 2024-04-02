package com.sci;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BeforeGeneric {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("Hello");
		list.add("Java");
		
		list.add(50);
		
		list.add(new Date());
		
		for (Object obj : list) {
			String str = (String) obj;
			System.out.println(str);
		}
	}

}
