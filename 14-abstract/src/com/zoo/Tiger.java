package com.zoo;

public class Tiger extends Feline {
	
	@Override
	public void scratch() {
		System.out.println("Tiger is scratching.");
		
	}

	@Override
	public void eat() {
		System.out.println("Tiger is eating.");
		
	}

	@Override
	public void sleep() {
		System.out.println("Tiger is sleeping.");
		
	}
}
