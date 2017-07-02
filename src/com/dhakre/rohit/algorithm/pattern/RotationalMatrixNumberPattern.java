package com.dhakre.rohit.algorithm.pattern;

public class RotationalMatrixNumberPattern {

	public static void main(String[] args) {
		int n = 4;
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int r = 3;
		int i = 0;
		int j = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		int n_new = n;
		RotationalMatrixNumberPattern rotate = new RotationalMatrixNumberPattern();
		rotate.rotate(arr, r, n_new, i, j, x, y, z);
		for (int a = 0; a < n; a++) {
			for (int b = 0; b < n; b++) {
				System.out.format("%02d ", arr[a][b]);
			}
			System.out.println();
		}
	}

	public void rotate(int[][] arr, int r, int n, int i, int j, int x, int y, int z) {
		for (int k = 0; k < r; k++) {
			if (x < n - 1 && y == z) {
				x++;
			} else if (x == n - 1 && y < n - 1) {
				y++;
			} else if (x > z && y == n - 1) {
				x--;
			} else {
				y--;
			}
		}
		int i_stop = x;
		int j_stop = y;
		while (true) {
			int temp = arr[x][y];
			arr[x][y] = arr[i][j];
			arr[i][j] = temp;
			if (x == z && y < n - 1) {
				y++;
			} else if (x < n - 1 && y == n - 1) {
				x++;
			} else if (x == n - 1 && y > z) {
				y--;
			} else {
				x--;
			}

			if (i == z && j < n - 1) {
				j++;
			} else if (i < n - 1 && j == n - 1) {
				i++;
			} else if (i == n - 1 && j > z) {
				j--;
			} else {
				i--;
			}
			if (i == i_stop && j == j_stop) {
				break;
			}
		}
	}

}
