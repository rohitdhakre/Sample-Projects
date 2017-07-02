package com.dhakre.rohit.demo;

public class Demo2 {

	public static void main(String[] args) {
		String s = "abcDE";
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (a >= 65 && a <= 90) {
				sb.append(Character.toLowerCase(a));
			} else {
				sb.append(Character.toUpperCase(a));
			}
		}
		sb.reverse();
		if (sb.charAt(0) < sb.charAt(1)) {
			System.out.println("yes");
		}
		int j = 5;
		sb.append(j);
		sb.append(j);
		String q = "";
		q += sb;
		System.out.println(sb);
		System.out.println(q);
		char w = q.charAt(0);
		char o = q.charAt(3);
		sb.setCharAt(0, o);
		sb.setCharAt(3, w);
		System.out.println(sb);
		sb.delete(0, 2);
		System.out.println(sb);
		System.out.println(s);
	}
}
