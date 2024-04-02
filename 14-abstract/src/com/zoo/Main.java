package com.zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elephant a1 = new Elephant();
		Cat a2 = new Cat();
		Tiger a3 = new Tiger();
		Dog a4 = new Dog("");
		Wolf a5 = new Wolf("");

		Feline f1 = new Cat();
		Feline f2 = new Tiger();

		Canine c1 =new Dog("");
		Canine c2 =new Wolf("");
		
		Feline f3 = new Feline() {

			@Override
			public void scratch() {
				System.out.println("Anno Scratch.");
				
			}

			@Override
			public void eat() {
				System.out.println("Anno Eat.");
				
			}

			@Override
			public void sleep() {
				System.out.println("Anno Sleep.");
				
			}
			
		};
		
		showFeline(a2);
		showFeline(a3);
		showFeline(f3);
		
		showCanine(a4);
		showCanine(a5);
		
		showPet(a2);
		showPet(a4);
	}

	

	private static void showPet(Pet a2) {
		a2.cuddle();
		System.out.println(a2.getClass().getName());
	}

	private static void showFeline(Feline f1) {
		f1.eat();
		f1.scratch();
		f1.sleep();
		System.out.println(f1.getClass().getName());
		
	}
	
	private static void showCanine(Canine c1) {
		c1.eat();
		c1.bite();
		c1.sleep();
		System.out.println(c1.getClass().getName());
		
	}

}
