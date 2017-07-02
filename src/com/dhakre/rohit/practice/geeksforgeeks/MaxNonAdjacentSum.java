package com.dhakre.rohit.practice.geeksforgeeks;

public class MaxNonAdjacentSum {

	public static void main(String[] args) {
		int arr[] = { 10, 13, 13, 12, 5, 2, 15, 2, 1 };
		MaxNonAdjacentSum s = new MaxNonAdjacentSum();
		System.out.println(s.getMaxNonAlternatingSum(arr));
	}
	
	private int getMaxNonAlternatingSum(int arr[]) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int sumIncl = arr[0], sumExcl = 0, newExcl;
		for (int i=1; i<arr.length; i++) {
			newExcl = Integer.max(sumIncl, sumExcl);
			sumIncl = sumExcl + arr[i];
			sumExcl = newExcl;
		}
		return Integer.max(sumIncl, sumExcl);
	}

}