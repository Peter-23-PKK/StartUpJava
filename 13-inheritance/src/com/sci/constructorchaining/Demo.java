package com.sci.constructorchaining;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager("Kyaw Kyaw", 16);
		System.out.println(m);

		//		Ref Type = new Real Obj
		Employee e = new Manager("Zaw Zaw", 22);
		System.out.println(e.getName());
		System.out.println(e.getAge());
	}

}
