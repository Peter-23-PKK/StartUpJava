package com.sci;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileInputStream in = new FileInputStream(new File("C:\\Users\\User\\Desktop\\java-io\\image.jpg"));
				FileOutputStream out = new FileOutputStream("C:\\Users\\User\\Desktop\\java-io\\image03.jpg")) {
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
