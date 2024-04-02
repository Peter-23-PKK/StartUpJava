package com.sci.hasa;

public class Main {

	public static void main(String[] args) {
		Student student = new Student("Phyo Phyo", 12,new Address("63","Insein Street","Hlaing"));

		Teacher teacher = new Teacher("Aung Aung", 30,new Address("144","Yaw Min Gyi Street","Dagon"));

		Manager manager = new Manager(new BMW());
		Manager managerOne = new Manager(new Toyota());
		
		
		System.out.println("Name : "+student.getName());
		System.out.println("Age : "+student.getAge());
		System.out.println("House Number : "+student.getAddress().getHouseNumber());
		System.out.println("Street : "+student.getAddress().getStreet());
		System.out.println("Township : "+student.getAddress().getTownship());
	}

}
