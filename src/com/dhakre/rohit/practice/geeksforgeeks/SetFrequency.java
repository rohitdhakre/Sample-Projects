package com.dhakre.rohit.practice.geeksforgeeks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetFrequency {

	public static void main(String[] args) {
		Integer arr[] = { 5, 3, 5, 5, 2, 8, 1, 8, 5, 3, 1, 4 };
		SetFrequency f = new SetFrequency();
		f.getFrequency(arr);
		// for (int i = 0; i < arr.length; i++) {
		// System.out.println(arr[i]);
		// }
	}

	private void getFrequency(Integer[] arr) {
		List<Integer> list = Arrays.asList(arr);
		Set<Integer> set = new TreeSet<Integer>(list);
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print(Collections.frequency(list, itr.next()));
		}

	}

}
