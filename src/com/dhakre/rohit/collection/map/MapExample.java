package com.dhakre.rohit.collection.map;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int i = 20;
		int j = 21;
		map.put(1, i);
		map.put(2, j);
		map.put(3, new Integer(12));
		map.put(4, new Integer(13));
		map.put(5, new Integer(14));
		map.put(6, new Integer(15));
		map.put(7, new Integer(16));
		map.put(8, new Integer(17));
		map.put(1, --i);
		map.put(2, --j);
		System.out.println(map);
	}

}
