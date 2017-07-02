package com.dhakre.rohit.practice.geeksforgeeks;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int n = 2;
		int[][] a = { { 2, 4 }, { 1, 3 } };
		int[][] b = { { 5, 6 }, { 2, 3 } };
		int[][] c = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = 0;
				for (int k = 0; k < n; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n; k++) {
				System.out.print(c[i][k] + " ");
			}
			System.out.println();
		}
	}

}
