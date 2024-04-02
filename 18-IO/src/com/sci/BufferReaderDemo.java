package com.sci;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class BufferReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\java-io\\invoice.txt"));
				BufferedWriter out = new BufferedWriter(
						new FileWriter("C:\\Users\\User\\Desktop\\java-io\\invoice03.txt"));
				PrintWriter pw = new PrintWriter(new File("pw-export.txt"))) {
			String str = null;
			while ((str = in.readLine()) != null) {
				out.write(str);
				out.newLine();
				pw.println(str);
			}
			System.out.println("Data Copied");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
