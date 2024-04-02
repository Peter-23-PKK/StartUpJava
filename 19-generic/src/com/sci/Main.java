package com.sci;

public class Main {

	public static void main(String[] args) {
		
		Cup<Tea> teaCup = new Cup<Tea>(new Tea());
		teaCup.makeDrink();
		
		Cup<Coffee> coffee = new Cup<Coffee>(new Coffee());
		coffee.makeDrink();
		
		Cup<OrangeJuice> juice = new Cup<OrangeJuice>(new OrangeJuice());
		juice.makeDrink();
		
		Cup<Integer> iCup = new Cup<>(10);
		iCup.makeDrink();
		
	}

}
