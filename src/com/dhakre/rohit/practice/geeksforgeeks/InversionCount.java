package com.dhakre.rohit.practice.geeksforgeeks;

public class InversionCount {

	public static void main(String[] args) {
		int arr[] = { 5, 3, 1, 6, 7, 2, 4, 9 };
		InversionCount c = new InversionCount();
		System.out.println(c.getCount(arr));
	}
	
	private int getCount(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					count++;
				}
			}
		}
		return count;
	}
}
