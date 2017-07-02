package com.dhakre.rohit.algorithm.pattern;

public class SquareNumberPattern {

	public static void main(String[] args) {
		int n = 7;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (j - i > 0) {
					System.out.print("1 ");
				} else {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
	}

}
