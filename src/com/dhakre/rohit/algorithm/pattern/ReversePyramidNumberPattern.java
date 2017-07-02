package com.dhakre.rohit.algorithm.pattern;

public class ReversePyramidNumberPattern {

	public static void main(String[] args) {
		int n = 7;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i > j) {
					System.out.print(" ");
				} else {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}

}
