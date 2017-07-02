package com.dhakre.rohit.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(11, "Ritik");
		hmap.put(2, "Hog");
		hmap.put(33, "Bobs");
		hmap.put(9, "Nizam");
		hmap.put(3, "Prince");
		hmap.put(5, "Pekka");
		hmap.put(6, "Erik");
		Set<Entry<Integer, String>> set = hmap.entrySet();
		Iterator<Entry<Integer, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> mapEntry = (Map.Entry<Integer, String>) itr.next();
			System.out.println("Key = " + mapEntry.getKey() + ", Value = " + mapEntry.getValue());
		}

		System.out.println("Get the Value at 3 Key - " + hmap.get(3));
		System.out.println("Remove Value at 5 Key");
		hmap.remove(5);
		Set<Entry<Integer, String>> set2 = hmap.entrySet();
		Iterator<Entry<Integer, String>> itr2 = set2.iterator();
		while (itr2.hasNext()) {
			Map.Entry<Integer, String> mapEntry2 = (Map.Entry<Integer, String>) itr2.next();
			System.out.println("Key = " + mapEntry2.getKey() + ", Value = " + mapEntry2.getValue());
		}
		
		System.out.println("For loop - ");
		for (Map.Entry<Integer, String> map : hmap.entrySet()) {
			System.out.println("Key - " + map.getKey() + ", Value - " + map.getValue());
		}
	}

}
