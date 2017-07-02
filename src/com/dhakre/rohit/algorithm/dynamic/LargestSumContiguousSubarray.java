package com.dhakre.rohit.algorithm.dynamic;

public class LargestSumContiguousSubarray {

	public static void main(String[] args) {
		int[] arr = { -2, -3, -1, -3, -2, -2, -5, -3 };
		int max_if_positive = 0;
		int max_out = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max_if_positive += arr[i];
			if (max_out < max_if_positive) {
				max_out = max_if_positive;
			}
			if (max_if_positive < 0) {
				max_if_positive = 0;
			}
		}
		System.out.println(max_out);
	}

}
