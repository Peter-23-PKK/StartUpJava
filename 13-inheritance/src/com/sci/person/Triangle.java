package com.sci.person;

public class Triangle extends Shape {

	@Override
	public void computeArea(int width, int height) {
		System.out.println("Triangle Area : " + ((width * height) * 0.5));
	}
	
	public void callComputeAreaMethod() {
		this.callComputeAreaMethod();
	}
}
