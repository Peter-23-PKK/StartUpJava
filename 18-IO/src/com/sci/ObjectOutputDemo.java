package com.sci;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ObjectOutputDemo {

	public static void main(String[] args) {
		List<Person> plist = List.of(new Person("Kyaw Kyaw"), new Person("Zaw Zaw"), new Person("Thaw Thaw"));
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
			out.writeObject(plist);
			System.out.println("Data Exported.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
