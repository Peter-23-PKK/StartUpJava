package com.sci;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourcesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * try { in = new FileInputStream("Data.txt"); out = new
		 * FileInputStream("Out.txt"); } catch (FileNotFoundException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } try { if (in != null) {
		 * in.close(); } } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } try { if (out != null) { out.close(); } } catch
		 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */
		try (FileInputStream in = new FileInputStream("Data.txt");
				FileInputStream out = new FileInputStream("Data.txt");
				Person p = new Person();) {

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}

class Person implements Closeable, AutoCloseable {

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub

	}

}
