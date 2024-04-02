package com.sci;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
		sum(new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90 });
	}

	public static void sum(int... nums) {
		int total = 0;
		for (int num : nums) {
			total += num;
		}
		System.out.println(total);
	}

}
