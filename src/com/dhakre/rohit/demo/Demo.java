package com.dhakre.rohit.demo;

public class Demo {

	public static void main(String[] args) {
		char[] ch = new char[8];
		for (int i = 0; i < 8; i++) {
			ch[i] = (char) (i + 65);
		}
		ch[2] = '\u0000';
		String s = String.valueOf(ch) + "+";
		System.out.println(s.length());
		s = s.replace("\u0000", "");
		s = s.replace("+", "");
		System.out.println(s.length());
		System.out.println(s);
		if (s.contains("+")) {
			System.out.println("yes");
		}
		StringBuilder word = new StringBuilder("");
		word.append(s);
		int i  = word.length() - 3;
		System.out.println(i);
		System.out.println(word);
		word.delete(0, 1);
		System.out.println(word);
	}

}
