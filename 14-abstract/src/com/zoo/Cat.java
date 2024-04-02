package com.zoo;

public class Cat extends Feline implements Pet{


	@Override
	public void scratch() {
		System.out.println("Cat is scratching.");
		
	}

	@Override
	public void eat() {
		System.out.println("Cat is eating.");
		
	}

	@Override
	public void sleep() {
		System.out.println("Cat is sleeping.");
		
	}

	@Override
	public void cuddle() {
		System.out.println("Cat is cuddling.");
	}
}
