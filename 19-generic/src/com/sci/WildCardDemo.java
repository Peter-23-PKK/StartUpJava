package com.sci;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<A> aList = new ArrayList<>();
		List<B> bList = new ArrayList<>();
		List<C> cList = new ArrayList<>();
		
		upperBounded(cList);
		upperBounded(bList);
		
		lowerBounded(bList);
		lowerBounded(aList);

		unBounded(cList);
		unBounded(aList);
		unBounded(bList);
	}

	public static void upperBounded(List<? extends B> list) {
		
	}

	public static void lowerBounded(List<? super B> list) {

	}

	public static void unBounded(List<?> list) {

	}

}

class A {

}

class B extends A {

}

class C extends B {

}