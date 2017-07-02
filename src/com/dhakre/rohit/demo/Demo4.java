package com.dhakre.rohit.demo;

public class Demo4 {

	public static void main(String[] args) {
		int[][] arr = new int[5][6];
		arr[1][2] = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(arr.length);
	}

}
