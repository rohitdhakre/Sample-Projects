package com.dhakre.rohit.algorithm.pattern;

public class SpiralRectangularMatrixPattern {

	public static void main(String[] args) {
		int n = 10;
		int m = 5;
		if (n == 0 || m == 0) {
			System.out.println("Enter non-negative values of both n & m");
			return;
		}
		try {
			int[][] arr = new int[n][m];
			int num = 1;
			int i = 0;
			int j = 0;
			int a = 0;
			int x = n - 1;
			int y = m - 1;
			while (true) {
				if (a == x && a == y) {
					arr[i][j] = num;
					break;
				}
				for (j = a; j < y; j++) {
					arr[i][j] = num;
					num++;
				}
				if (num > m * n) {
					break;
				}
				for (i = a; i < x; i++) {
					arr[i][j] = num;
					num++;
				}
				if (num > m * n) {
					break;
				}
				for (j = y; j > a; j--) {
					arr[i][j] = num;
					if (num == m * n) {
						num++;
						break;
					}
					num++;
				}
				if (num > m * n) {
					break;
				}
				for (i = x; i > a; i--) {
					arr[i][j] = num;
					if (num == m * n) {
						num++;
						break;
					}
					num++;
				}
				if (num > m * n) {
					break;
				}
				i++;
				j++;
				a++;
				x--;
				y--;
			}
			for (int k = 0; k < n; k++) {
				for (int l = 0; l < m; l++) {
					System.out.format("%02d ", arr[k][l]);
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Enter non-negative values of both n & m");
		}
	}

}
