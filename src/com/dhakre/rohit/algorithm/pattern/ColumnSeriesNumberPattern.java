package com.dhakre.rohit.algorithm.pattern;

public class ColumnSeriesNumberPattern {

	public static void main(String[] args) {
		int n = 7;
		for (int i = 1; i <= n; i++) {
			int x = i;
			for (int j = n - 1; j >= n - i; j--) {
				System.out.print(x + " ");
				x = x + j;
			}
			System.out.println();
		}
	}

}
