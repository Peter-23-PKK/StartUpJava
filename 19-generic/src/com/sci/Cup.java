package com.sci;

public class Cup<T> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public Cup(T t) {
		super();
		this.t = t;
	}

	public void makeDrink() {
		System.out.println(t.getClass().getSimpleName() + " Cup");
	}

	public <E> void showData(Cup<E> cup){
		
	}

}

class Tea {

}

class Coffee {

}

class OrangeJuice {

}
