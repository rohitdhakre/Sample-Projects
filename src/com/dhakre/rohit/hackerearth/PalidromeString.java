package com.dhakre.rohit.hackerearth;

import java.util.Scanner;

public class PalidromeString {
	public static void main(String args[]) throws Exception {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t-- > 0) {
			int sum = 0;
			String s = scan.next();
			for (int i = s.length() - 1; i >= 0; i--) {
				String str = "";
				for (int j = i; j < s.length(); j++) {
					str += s.charAt(j);
					String revstring = "";
					for (int k = str.length() - 1; k >= 0; k--) {
						revstring += str.charAt(k);
					}
					if (revstring.equals(str)) {
						int n = str.length();
						sum += n * n;
					}
				}
			}
			System.out.println(sum);
		}
		scan.close();
	}
}
