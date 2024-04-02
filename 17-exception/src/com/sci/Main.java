package com.sci;

public class Main {

	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);
			int i = 10;
			if (i > 0) {
				throw new CustomException.WrongPasswordException("Wrong Password.");
			}
		} catch (Exception e) {
			throw new CustomException.WrongDataInputException("Wrong logic Error.Please check again.");
		}
	}

}
