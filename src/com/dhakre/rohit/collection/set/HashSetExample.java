package com.dhakre.rohit.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		set.add(new Integer(10));
		set.add(new Integer(12));
		set.add(new Integer(11));
		set.add(new Integer(14));
		set.add(new Integer(13));
		set.add(new Integer(15));
		set.add(new Integer(11));
		set.add(new Integer(18));
		set.add(new Integer(17));
		set.add(new Integer(15));
		set.add(new Integer(15));
		set.add(new Integer(11));
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
