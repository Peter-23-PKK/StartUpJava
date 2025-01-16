package com.sci;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Apple> appleList = new ArrayList<Apple>();
		Collections.addAll(appleList, new Apple("Red", 13), new Apple("Blue", 12), new Apple("Green", 11),
				new Apple("Yellow", 9), new Apple("Purple", 8), new Apple("White", 20));
		List<Apple> greeApples = findGreenApple(appleList);
		List<Apple> largeApples = findLargeApple(appleList);
//		System.out.println(greeApples);
//		System.out.println(largeApples);
		List<Apple> redApples = findApples(appleList, a -> a.getWeight() > 10);
		redApples.forEach(System.out::println);

		System.out.println();

		List<Apple> green = findObject(appleList, a -> a.getColor().equalsIgnoreCase("Purple"));
		green.forEach(System.out::println);

		System.out.println();

		List<Apple> smallApples = appleList.stream().filter(a -> a.getWeight() <= 10).toList();
		smallApples.forEach(System.out::println);
	}

	private static List<Apple> findLargeApple(List<Apple> appleList) {
		List<Apple> list = new ArrayList<Apple>();
		for (Apple apple : appleList) {
			if (apple.getWeight() > 10) {
				list.add(apple);
			}
		}
		return list;
	}

	private static List<Apple> findGreenApple(List<Apple> appleList) {
		List<Apple> list = new ArrayList<Apple>();
		for (Apple apple : appleList) {
			if (apple.getColor() == "Green") {
				list.add(apple);
			}
		}
		return list;
	}

	private static List<Apple> findApples(List<Apple> apples, Predicate<Apple> pre) {
		List<Apple> tempApples = new ArrayList<Apple>();
		for (Apple apple : apples) {
			if (pre.test(apple)) {
				tempApples.add(apple);
			}
		}
		return tempApples;
	}

	private static <T> List<T> findObject(List<T> apples, Predicate<T> pre) {
		List<T> data = new ArrayList<>();
		for (T t : apples) {
			if (pre.test(t)) {
				data.add(t);
			}
		}
		return data;
	}

}
