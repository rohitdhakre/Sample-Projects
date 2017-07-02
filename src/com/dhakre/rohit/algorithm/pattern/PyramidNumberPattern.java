package com.dhakre.rohit.algorithm.pattern;

public class PyramidNumberPattern {

	public static void main(String[] args) {
		int n = 7;
		for (int i = 1; i <= n; i++) {
			int num = 1;
			for (int j = n; j >= 1; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print(num + " ");
					num++;
				}
			}
			System.out.println();
		}
	}

}
