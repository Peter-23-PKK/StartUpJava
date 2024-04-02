package com.sci.override;

public class Mutiply extends Calculator {

	@Override
	public void calculate(int i, int j) {
		System.out.println("Total " + i * j);
	}
}
