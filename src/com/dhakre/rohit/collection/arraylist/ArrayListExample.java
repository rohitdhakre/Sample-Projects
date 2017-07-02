package com.dhakre.rohit.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	int id;
	String name;

	ArrayListExample(int id, String name) {
		this.id = id;
		this.name = name;
	}

	ArrayListExample() {
		this.id = 0;
		this.name = "No name";
	}

	public static void main(String[] args) {

		ArrayListExample ale1 = new ArrayListExample(12, "Stuart");
		ArrayListExample ale2 = new ArrayListExample(10, "Rishi");
		ArrayListExample ale3 = new ArrayListExample(9, "Vikram");

		ArrayList<ArrayListExample> list = new ArrayList<ArrayListExample>();
		list.add(ale1);
		list.add(ale2);
		list.add(ale3);

		Iterator<ArrayListExample> itr = list.iterator();
		while (itr.hasNext()) {
			ArrayListExample res = itr.next();
			System.out.println(res.id + ", " + res.name);
		}
	}

}
