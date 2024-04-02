package com.sci;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileReader in = new FileReader(new File("C:\\Users\\User\\Desktop\\java-io\\image.jpg"));
				FileWriter out = new FileWriter("C:\\Users\\User\\Desktop\\java-io\\image02.jpg")) {
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
