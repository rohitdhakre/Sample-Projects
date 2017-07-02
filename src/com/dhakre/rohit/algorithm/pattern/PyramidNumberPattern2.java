package com.dhakre.rohit.algorithm.pattern;

public class PyramidNumberPattern2 {

	public static void main(String[] args) {
		int n = 9;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
	}

}
