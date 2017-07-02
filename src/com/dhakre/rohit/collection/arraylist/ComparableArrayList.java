package com.dhakre.rohit.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableArrayList {

	public static void main(String[] args) {

		ArrayList<StudentComparable> list = new ArrayList<StudentComparable>();
		list.add(new StudentComparable("Rohan", 12, 10021));
		list.add(new StudentComparable("Tihaan", 23, 20932));
		list.add(new StudentComparable("Piyu", 10, 847));
		list.add(new StudentComparable("Ayaan", 21, 8427));
		list.add(new StudentComparable("Zoya", 13, 12847));

		Collections.sort(list);
		for (StudentComparable data : list) {
			System.out.println(data);
		}
	}
}
