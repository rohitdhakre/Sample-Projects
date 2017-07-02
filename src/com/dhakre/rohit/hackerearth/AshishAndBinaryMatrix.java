package com.dhakre.rohit.hackerearth;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class AshishAndBinaryMatrix {
	public static void main(String args[]) throws Exception {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t-- > 0) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			String[] s = new String[n];
			for (int i = 0; i < n; i++) {
				s[i] = scan.next();
			}
			boolean check = true;
			for (int i = 0; i < m; i++) {
				check = true;
				Set<String> set = new HashSet<>();
				for (int j = 0; j < n; j++) {
					String st = s[j].substring(0, i) + s[j].substring(i + 1, s[j].length());
					if (!set.add(st)) {
						check = false;
						break;
					}
				}
				if (check) {
					System.out.println("Yes");
					break;
				}
			}
			if (!check) {
				System.out.println("No");
			}
		}
		scan.close();
	}
}