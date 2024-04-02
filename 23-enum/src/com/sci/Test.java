package com.sci;

public abstract class Test {
	abstract void print();
}

abstract class A extends Test {
	abstract void get();
}

class B extends A {

	@Override
	void print() {

	}

	@Override
	void get() {

	}

}

class C extends B {

}
