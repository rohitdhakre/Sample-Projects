package com.dhakre.rohit.practice.geeksforgeeks;

import java.util.Scanner;

class FindPath {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int x = 0; x < test; x++) {
			int n = scan.nextInt();
			int[][] arr = new int[n][n];
			// insert value in matrix
			int startX = 0;
			int startY = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = scan.nextInt();
					if (arr[i][j] == 1) {
						startX = i;
						startY = j;
					}
				}
			}
			boolean isPath = new FindPath().checkPath(arr, startX, startY, n);
			if (isPath) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
		scan.close();
	}

	public boolean checkPath(int[][] arr, int x, int y, int n) {
		boolean isPath = false;
		if (y > 0 && (arr[x][y - 1] == 3 || arr[x][y - 1] == 2)) {
			if (arr[x][y - 1] == 2) {
				return true;
			}
			arr[x][y - 1] = 5;
			isPath = checkPath(arr, x, y - 1, n);
			if (isPath) {
				return true;
			}
		}
		if (x > 0 && (arr[x - 1][y] == 3 || arr[x - 1][y] == 2)) {
			if (arr[x - 1][y] == 2) {
				return true;
			}
			arr[x - 1][y] = 5;
			isPath = checkPath(arr, x - 1, y, n);
			if (isPath) {
				return true;
			}
		}
		if (y < n - 1 && (arr[x][y + 1] == 3 || arr[x][y + 1] == 2)) {
			if (arr[x][y + 1] == 2) {
				return true;
			}
			arr[x][y + 1] = 5;
			isPath = checkPath(arr, x, y + 1, n);
			if (isPath) {
				return true;
			}
		}
		if (x < n - 1 && (arr[x + 1][y] == 3 || arr[x + 1][y] == 2)) {
			if (arr[x + 1][y] == 2) {
				return true;
			}
			arr[x + 1][y] = 5;
			isPath = checkPath(arr, x + 1, y, n);
			if (isPath) {
				return true;
			}
		}
		return isPath;
	}

}