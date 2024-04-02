package com.sci.person;

public class Main {

	public static void main(String[] args) {
		Shape s = new Shape();
		s.computeArea(10, 20);

		Shape s1 = new Triangle();
		s1.computeArea(10, 20);

		Shape s2 = new Rectangle();
		s2.computeArea(10, 20);

		Shape s3 = getShape(new Rectangle());
		s3.computeArea(10, 20);

		Rectangle r2 = (Rectangle) getShape(new Rectangle());
		Rectangle r3 = (Rectangle) r2;
		
		Shape s4 = r2;
	}

	public static Shape getShape(Shape s) {
		return s;
	}

}
