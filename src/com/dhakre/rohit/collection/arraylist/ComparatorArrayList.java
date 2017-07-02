package com.dhakre.rohit.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorArrayList {

	public static void main(String[] args) {
		ArrayList<StudentComparator> list = new ArrayList<StudentComparator>();
		list.add(new StudentComparator("Rajesh", 90, 12312));
		list.add(new StudentComparator("Bob", 2, 35433));
		list.add(new StudentComparator("Joshi", 87, 86543));
		list.add(new StudentComparator("Riya", 34, 45523));
		list.add(new StudentComparator("Piya", 7, 57545));
		list.add(new StudentComparator("Parul", 15, 12532));
		list.add(new StudentComparator("Fateema", 5, 63233));
		list.add(new StudentComparator("Lakshya", 32, 43221));
		list.add(new StudentComparator("Erik", 54, 13242));

		Collections.sort(list, StudentComparator.compareName);

		for (StudentComparator data : list) {
			System.out.println(data);
		}
		
		System.out.println();

		Collections.sort(list, StudentComparator.compareRollNum);

		for (StudentComparator data : list) {
			System.out.println(data);
		}

	}

}
