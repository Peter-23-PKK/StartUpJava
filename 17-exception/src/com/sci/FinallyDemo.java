package com.sci;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream io = null;
		FileOutputStream ou = null;
		try {
			System.out.println(10 / 0);
			io = new FileInputStream("input.txt");
			ou = new FileOutputStream("out.txt");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (io != null) {
				try {
					io.close();
				} catch (IOException e) {
					throw new RuntimeException("Something went wrong.");
				}
			}
			if (ou != null) {
				try {
					ou.close();
				} catch (IOException e) {
					throw new RuntimeException("Something went wrong.");
				}
			}
		}
	}

}
