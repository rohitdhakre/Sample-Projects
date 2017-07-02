package com.dhakre.rohit.practice.geeksforgeeks;

public class CaesarCipher {

	public static void main(String[] args) {
		String s = "BEZAPG";
		String t = "XAVWLC";
		if (s.length() != t.length()) {
			System.out.println(-1);
			return;
		}
		int diff = ((int)t.charAt(0) - 64) - ((int)s.charAt(0) - 64);
		if (diff < 0) {
			diff += 26;
		}
		for (int i = 0; i < s.length(); i++) {
			int c = ((int)s.charAt(i) - 64 + diff) % 26;
			char ch;
			if (c == 0) {
				ch = 'Z';
			} else {
				ch = (char)(c + 64);
			}
			if (ch != t.charAt(i)) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(diff);
	}
}
