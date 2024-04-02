package com.sci.override;

public class A {
	public A getA() {
		return null;
	}
}

class B extends A {

	@Override
	public B getA() {
		return new B();
	}

}

class C extends B {

	@Override
	public C getA() {
		return new C();
	}
}
