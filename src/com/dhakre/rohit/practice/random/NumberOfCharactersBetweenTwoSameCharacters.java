package com.dhakre.rohit.practice.random;

import java.util.Scanner;

public class NumberOfCharactersBetweenTwoSameCharacters {

	public static void main(String args[]) throws Exception {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int x = 0; x < t; x++) {
			String s = scan.next();
			int[] arr = new int[26];
			for (int i = 0; i < s.length(); i++) {
				arr[(int) s.charAt(i) - 97]++;
			}
			int max = -1;
			for (int i = 0; i < 26; i++) {
				if (arr[i] > 1) {
					char ch = (char) (i + 97);
					int l = 0;
					int r = s.length() - 1;
					while (l < r) {
						if (s.charAt(l) == ch && s.charAt(r) == ch) {
							int temp = r - l - 1;
							if (temp > max) {
								max = temp;
							}
							break;
						}
						if (s.charAt(l) != ch) {
							l++;
						}
						if (s.charAt(r) != ch) {
							r--;
						}
					}
				}
			}
			System.out.println(max);
		}
		scan.close();
	}
}
