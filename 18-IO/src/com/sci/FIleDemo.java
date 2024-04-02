package com.sci;

import java.io.File;
import java.io.IOException;

public class FIleDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\User\\Desktop\\java-io\\dataInput.txt");
		
		System.out.println("File Exists : " + file.exists());
		System.out.println("File Created : " + file.createNewFile());
		System.out.println("File Exists : " + file.exists());
		
	}
}
