package com.dhakre.rohit.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Bomb");
		list.add("Horse");
		list.add("Plate");
		System.out.println(list.get(0));
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}