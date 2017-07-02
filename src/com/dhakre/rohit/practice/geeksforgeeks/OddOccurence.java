package com.dhakre.rohit.practice.geeksforgeeks;

public class OddOccurence {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 3, 1, 3, 5, 2, 7, 7, 3 };
		OddOccurence o = new OddOccurence();
		System.out.println(o.getOdd(arr));
	}

	private int getOdd(int arr[]) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result = result ^ arr[i];
		}
		return result;
	}

}
