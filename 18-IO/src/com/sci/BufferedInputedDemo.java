package com.sci;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedInputStream in = new BufferedInputStream(
				new FileInputStream("C:\\Users\\User\\Desktop\\java-io\\image.jpg"));
				BufferedOutputStream out = new BufferedOutputStream(
						new FileOutputStream("C:\\Users\\User\\Desktop\\java-io\\image04.jpg"))) {
			int i = 0;
			while ((i = in.read()) != -1) {
				out.write(i);
			}
			System.out.println("Data Copied");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
