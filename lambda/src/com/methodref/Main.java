package com.methodref;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpInterface<Employee, String, Integer> empInterface = (e, s, i) -> {
			e.print(s, i);
		};

		EmpInterface<Employee, String, Integer> empInterface2 = Employee::print;

	}

}
