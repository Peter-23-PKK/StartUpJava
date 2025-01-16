package com.test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {

		MyAPI myAPI = (a, b) -> {
			System.out.println(a);
			System.out.println(b);
		};
		myAPI.showInfo("Phyo Khant Kyaw", 22);

		Supplier<String> supplier = () -> {
			return "Hello World";
		};

		Function<String, Integer> fun = (a) -> {
			return 1;
		};

		Consumer<Integer> consumer = (a) -> {
			System.out.println("This is cosumer");
		};

		Predicate<String> predicate = (a) -> {
			return true;
		};

		UnaryOperator<Integer> unaryOperator = (a) -> {
			return a;
		};

	}

}
