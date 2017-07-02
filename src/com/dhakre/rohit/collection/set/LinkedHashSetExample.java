package com.dhakre.rohit.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		String s = "aabcsdbabcsd";
		char[] ch = s.toCharArray();
		for (Character c : ch) {
			set.add(c);
		}
		System.out.println(set);
		Character[] c = set.toArray(new Character[set.size()]);
		System.out.println(s);
		for (char data : c) {
			System.out.print(data);
		}
	}

}
