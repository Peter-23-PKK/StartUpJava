package com.sci.hasa;

public class Manager {

	private Car car;

	public Manager(Car car) {
		super();
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
}
