package com.sci;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataOutputStreamData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		try (DataInputStream in = new DataInputStream(new FileInputStream("dataa.txt"));) {
			int age = 0;
			String name;
			double salary = 0;
			for (int i = 0; i < 3; i++) {
				name = in.readUTF();
				age = in.readInt();
				salary = in.readDouble();

				System.out.println(name);
				System.out.println(age);
				System.out.println(salary + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data Copied");
	}

}
