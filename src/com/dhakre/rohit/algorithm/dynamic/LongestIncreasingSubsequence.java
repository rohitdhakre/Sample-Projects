package com.dhakre.rohit.algorithm.dynamic;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60 };
		int[] lis = new int[arr.length];
		for (int i = 0; i < lis.length; i++) {
			lis[i] = 1;
		}
		int max = 1;
		for (int j = 1; j < arr.length; j++) {
			for (int i = 0; i < j; i++) {
				if (arr[i] < arr[j] && lis[i] == lis[j]) {
					lis[j]++;
					if (max < lis[j]) {
						max = lis[j];
					}
				}
			}
		}
		System.out.println(max);

		// lis values = {1, 2, 1, 3, 2, 4, 4, 5};
		// to print elements, print arr[i] where lis[i] = 1, 2, 3.... till max;
		// Uncomment the below code to print the increasing sequence array
		/*
		 * int j = 1; for (int i = 0; i < arr.length; i++) { if (j > max) {
		 * break; } if (lis[i] == j) { System.out.print(arr[i] + " "); j++; } }
		 */
	}

}
