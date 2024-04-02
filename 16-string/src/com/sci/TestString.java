package com.sci;

import java.util.GregorianCalendar;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testStringBuilder();
		testStringBuffer();
	}

	private static void testStringBuffer() {
		// TODO Auto-generated method stub
		System.gc();
		long start = new GregorianCalendar().getTimeInMillis();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 10000000; i++) {
			sb.append(":").append(i);
		}
		long end = new GregorianCalendar().getTimeInMillis();
		System.out.println("String Buffer Duration : " + (end - start));

	}

	private static void testStringBuilder() {
		// TODO Auto-generated method stub
		System.gc();
		long start = new GregorianCalendar().getTimeInMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000000; i++) {
			sb.append(":").append(i);
		}
		long end = new GregorianCalendar().getTimeInMillis();
		System.out.println("String Builder Duration : " + (end - start));

	}

}
