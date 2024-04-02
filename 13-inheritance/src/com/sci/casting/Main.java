package com.sci.casting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Student();
		Person p2 = new Teacher();
		
		if(p instanceof Student) {
			Student s1 = (Student) p;
			System.out.println("p instance of student");
		}
		if(p2 instanceof Student) {
			Student s2 = (Student) p2;
			System.out.println("p instance of student");
		}
		if(p2 instanceof Teacher) {
			Teacher t1 = (Teacher) p2;
			System.out.println("p instance of student");
		}
		if(p instanceof Teacher) {
			Teacher t2 = (Teacher) p;
			System.out.println("p instance of student");
		}
	}

}
