package com.dhakre.rohit.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class LoopArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("This", "World", "is", "full", "Of", "Happiness"));
		
		//4 methods for loop elements of arrayList.
		
		System.out.println("For Loop - ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Advanced For Loop - ");
		for (String num : list) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("While Loop - ");
		int count = 0;
		while (count < list.size()) {
			System.out.print(list.get(count) + " ");
			count++;
		}
		System.out.println();
		System.out.println();
		System.out.println("Using Iterator - ");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Using Enumeration - ");
		Enumeration<String> e = Collections.enumeration(list);
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement() + " ");
		}

	}

}
