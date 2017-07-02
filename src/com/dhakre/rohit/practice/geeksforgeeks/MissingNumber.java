package com.dhakre.rohit.practice.geeksforgeeks;

public class MissingNumber {

	public static void main(String[] args) {
		MissingNumber m = new MissingNumber();
		int arr[] = {1, 4, 2, 5, 8, 6, 9, 7};
		System.out.println(m.getMiss(arr));
	}

	private int getMiss(int arr[]) {
		int sum = 0;
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		for (int j = min; j <= max; j++) {
			if (min != 1) {
				return 1;
			}
			sum = sum + j;
		}
		for (int k = 0; k < arr.length; k++) {
			sum = sum - arr[k];
		}
		return sum;
	}

}
