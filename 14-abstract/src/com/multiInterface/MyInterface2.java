package com.multiInterface;

public interface MyInterface2 {
	void print();

	public default void show() {

	}
}

interface MyInterface3 {
	void print();

	public default void show() {

	}
}

interface MyInterface4 extends MyInterface2, MyInterface3 {

	@Override
	default void show() {
		MyInterface2.super.show();
		MyInterface3.super.show();
	}

}
