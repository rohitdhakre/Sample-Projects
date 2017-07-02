package com.dhakre.rohit.algorithm.pattern;

public class SpiralSquareMatrixPattern {

	public static void main(String[] args) {
		int n = 7;
		if (n == 0) {
			System.out.println("Enter non-negative value of n");
			return;
		}
		try {
			int[][] arr = new int[n][n];
			int num = 1;
			int i = 0;
			int j = 0;
			int x = 0;
			int y = n - 1;
			if (n == 1) {
				System.out.println("01");
				return;
			}
			while (true) {
				if (x == y) {
					arr[i][j] = num;
					break;
				}
				for (j = x; j < y; j++) {
					arr[i][j] = num;
					num++;
				}
				for (i = x; i < y; i++) {
					arr[i][j] = num;
					num++;
				}
				for (j = y; j > x; j--) {
					arr[i][j] = num;
					num++;
				}
				for (i = y; i > x; i--) {
					arr[i][j] = num;
					num++;
				}
				if (num > n * n) {
					break;
				}
				i++;
				j++;
				x++;
				y--;
			}
			for (int a = 0; a < n; a++) {
				for (int b = 0; b < n; b++) {
					System.out.format("%02d ", arr[a][b]);
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Enter non-negative value of n");
		}
	}
}