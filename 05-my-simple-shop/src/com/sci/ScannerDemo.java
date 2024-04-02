package com.sci;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		System.out.println("Enter your name");
		int name = scann.nextInt();
		System.out.println("Hello" + name);
	}

}
