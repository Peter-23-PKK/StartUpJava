package com.zoo;

public class Dog extends Canine implements Pet{

	public Dog(String info) {
		super(info);
	}

	@Override
	public void bite() {
		System.out.println("Dog is biting.");
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating.");
		
	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping.");
		
	}

	@Override
	public void cuddle() {
		System.out.println("Dog is cuddling");
	}
}
