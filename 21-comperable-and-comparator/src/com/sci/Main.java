package com.sci;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> pList = new ArrayList<Person>();
		Collections.addAll(pList, new Person(1, "Aung Aung", 3500, 23), new Person(2, "Zaw Aung", 2500, 21),
				new Person(3, "Mg Mg", 8500, 32), new Person(4, "Ko Ko", 300, 56),
				new Person(5, "Phyo Aung", 3590, 12));

		Collections.sort(pList);

		System.out.println(pList);

		System.out.println("Sort Person By Name");

		Comparator<Person> sort1 = new SortPerson.SortByName();
		pList.sort(sort1);
		pList.forEach(System.out::println);
		System.out.println();

		System.out.println("Sort Person By Salary");

		Comparator<Person> sort2 = new SortPerson.SortBySalary();
		pList.sort(sort2);
		pList.forEach(System.out::println);
		System.out.println();

		System.out.println("Sort Person By Id");

//		SortPerson sp1 = new SortPerson();
//		SortById s1 = sp1.new SortById();

		Comparator<Person> sort3 = new SortPerson().new SortById();
		pList.sort(sort3);
		pList.forEach(a -> System.out.println(a + "\n"));

		System.out.println();

	}

	public static void show() {
		class DataInfo {

		}
	}

}
