package com.sci;

import java.io.DataOutputStream;
import java.io.FileOutputStream;


public class DataInputStreamDemo {

	private static String[] names = { "Kyaw Kyaw", "Zaw Zaw", "Thaw Thaw" };
	private static int[] ages = { 20, 30, 40 };
	private static double[] salary = { 9000.23, 23432.23, 2342.23 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("data.obj"));) {
			for (int i = 0; i < names.length; i++) {
				dataOut.writeUTF(names[i]);
				dataOut.writeInt(ages[i]);
				dataOut.writeDouble(salary[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data Copied");
	}

}
