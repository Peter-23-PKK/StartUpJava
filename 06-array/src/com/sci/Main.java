package com.sci;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] item = new int[5];
		System.out.println(item[4]);
		int[] nums = { 20, 40, 60, 80, 100 };
		System.out.println("number length " + nums.length);
		System.out.println("item length " + item.length);
		System.out.println("last index of nums array " + nums[4]);

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		for(int i : nums) {
			System.out.println(i);
		}
		
	}

}
