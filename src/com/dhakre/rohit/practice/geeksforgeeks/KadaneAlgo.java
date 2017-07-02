package com.dhakre.rohit.practice.geeksforgeeks;

public class KadaneAlgo {

	public static void main(String[] args) {
		int arr[] = { -2, -3, -1, 3, -2, 2, 5, -3 };
		KadaneAlgo a = new KadaneAlgo();
		System.out.println(a.getAlgo(arr));
	}
	
	private int getAlgo(int arr[]) {
		int sum = 0;
		int result = 0;
		int negative = arr[0];
		int j = 0;
		for (j = 0; j < arr.length; j++) {
			if (arr[j] < 0) {
				if (negative < arr[j]) {
					negative = arr[j];
				}
				if (j == arr.length - 1) {
					return negative;
				}
			} else {
				break;
			}
		}
		for (int i = j; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum < 0) {
				sum = 0;
			}
			if (result < sum) {
				result = sum;
			}
		}
		return result;
	}

}
