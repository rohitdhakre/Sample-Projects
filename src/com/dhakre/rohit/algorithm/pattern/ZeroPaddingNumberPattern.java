package com.dhakre.rohit.algorithm.pattern;

public class ZeroPaddingNumberPattern {

	public static void main(String[] args) {
		int n = 7;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print(i + " ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
