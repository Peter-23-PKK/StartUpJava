package com.zoo;

public class Wolf extends Canine {
	
	public Wolf(String info) {
		super(info);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bite() {
		System.out.println("Tiger is biting.");
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
