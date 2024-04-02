package com.sci;

public class AfterEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Days day = Days.Monday;
		switch (day) {
		case Monday:
			System.out.println(Days.Monday);
			break;
		case TuesDay:
			System.out.println(Days.TuesDay);
			break;
		case Wednesday:
			System.out.println(Days.Wednesday);
			break;
		}

		System.out.println(Days.Monday.ordinal());
		System.out.println(Days.Monday.name());
	}
}

enum Days {
	
	Monday, TuesDay, Wednesday;

	@Override
	public String toString() {
		return (ordinal() + 1) + ". " + name();
	}
}
