package com.sci;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectInputStreamDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> plist = new ArrayList<>();
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.txt"))) {
			plist = (List<Person>) in.readObject();
			for (Person p : plist) {
				System.out.println(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
