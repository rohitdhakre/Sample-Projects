package com.dhakre.rohit.collection.set;

import java.util.HashSet;

public class StringSet {

	public static void main(String[] args) {
		String s = "rohitdhakre";
		HashSet<Character> set = new HashSet<>();
		char[] ch = s.toCharArray();
		s = "";
		for (char c : ch) {
			if (set.add(c)) {
				s += c;
			}
		}
		System.out.println(s);
	}

}
