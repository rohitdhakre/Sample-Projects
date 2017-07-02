package com.dhakre.rohit.collection.set;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

	/*
	 * Input - 3 Eve 78 Bob 99 Alice 78
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		SortedSet<Student> set = new TreeSet<>();
		while (test-- > 0) {
			String name = scan.next();
			int marks = scan.nextInt();
			set.add(new Student(name, marks, test));
		}
		for (Student st : set) {
			System.out.println(st);
		}
		scan.close();
	}
}
