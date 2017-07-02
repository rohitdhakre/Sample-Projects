package com.dhakre.rohit.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		@SuppressWarnings("serial")
		ArrayList<Integer> list = new ArrayList<Integer>() {{ add(65); add(34); add(754); add(2); add(42); add(1); }};
		System.out.println("Before Sorting - ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");	
		}
		System.out.println();
		System.out.println("Sorting in Ascending Order - ");
		
		// Sorting in Ascending Order by "Collections.sort(list)".
		Collections.sort(list);
		for (int j : list) {
			System.out.print(j + " ");
		}
		System.out.println();
		System.out.println("Sorting in Descending Order - ");
		
		//After list is sorted in ascending order use "Collections.reverse(list)" for sort in descending order.
		Collections.reverse(list);
		for (Integer num : list) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		//Method 2 for sort in descending order.
		
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("Snake", "Hyena", "Zebra", "Anaconda", "Bear"));
		System.out.println();
		System.out.println("Method 2 for Sorting in descending order - ");
		
		System.out.println("Before Sorting - ");
		for (String data : list2) {
			System.out.print(data + " ");
		}
		
		System.out.println();
		System.out.println("After Sorting - ");
		//2nd Method for sorting arrayList.
		Collections.sort(list2, Collections.reverseOrder());
		for (String x : list2) {
			System.out.print(x + " ");
		}
		
	}

}
