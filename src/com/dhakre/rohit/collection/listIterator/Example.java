package com.dhakre.rohit.collection.listIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Example {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Bonkers");
		list.add("Boomer");
		list.add("Big Bubble");
		list.add("Center Fresh");
		list.add(0, "Chewing Gum");				//This method is found in List interface;

		ListIterator<String> itr = list.listIterator();
		System.out.println("Traverse in forward direction :");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\nTraverse in backward direction :");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
	}

}
