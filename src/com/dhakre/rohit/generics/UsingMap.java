package com.dhakre.rohit.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UsingMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Book");
		map.put(2, "Race");
		map.put(4, "Billboard");
		map.put(7, "cricket");
		
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		Iterator<Map.Entry<Integer, String>> itr = set.iterator(); 
		while (itr.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry e = itr.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
