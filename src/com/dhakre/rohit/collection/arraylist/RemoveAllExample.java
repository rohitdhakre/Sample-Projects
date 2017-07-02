package com.dhakre.rohit.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveAllExample {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("this");
		list.add("is");
		list.add("my");
		list.add("country");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("indian");
		list2.add("is");
		list2.add("my");
		list2.add("nationality");

		list.removeAll(list2);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}