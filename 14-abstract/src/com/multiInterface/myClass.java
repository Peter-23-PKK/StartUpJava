package com.multiInterface;

public class myClass implements MyInterface {

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

}

class A implements MyInterface {

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void methodForAandB() {
		// TODO Auto-generated method stub
		MyInterface.super.methodForAandB();
	}

}

class B implements MyInterface {

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void methodForAandB() {
		// TODO Auto-generated method stub
		MyInterface.super.methodForAandB();
	}

}

interface MyInterface {
	void show();

	public default void methodForAandB() {

	}
}