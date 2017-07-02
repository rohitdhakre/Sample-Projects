package com.dhakre.rohit.practice.geeksforgeeks;

public class MiniMaxSum {
	
	public static void main(String args[]) {
		int arr[] = {4, 5, 6, 7, 2};
		MiniMaxSum s = new MiniMaxSum();
		s.check(arr);
	}
	
	private void check (int arr[]) {
		int sum = 0;
		int n = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		for(int j = 0; j < arr.length; j++) {
			if(n < sum - arr[j]) {
				n = sum - arr[j];
			}
		}
		int m = sum;
		System.out.println("Max - " + n);
		for(int k = 0; k < arr.length; k++) {
			if(m > sum - arr[k]) {
				m = sum - arr[k];
			}
		}
		System.out.println("Min - " + m);
	}
}

