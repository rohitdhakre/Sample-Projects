package com.dhakre.rohit.practice.geeksforgeeks;

public class TwoNumberSumClosestToZero {

	public static void main(String[] args) {
		TwoNumberSumClosestToZero z = new TwoNumberSumClosestToZero();
		int arr[] = { -14, -4, 32, 45, -7, -4, 32, -74 };
		z.getNumber(arr);
	}
	
	private void getNumber(int[] arr) {
		int start = 0;
		sortArray(arr, start, arr.length - 1);
		getTwoNumbers(arr);
	}
	
	private void sortArray(int[] arr, int start, int end) {
		if (start >= end) {
			return;
		}
		int pivot = arr[end];
		int pIndex = start;
		int temp;
		for (int i = start; i < end; i++) {
			if (arr[i] < pivot) {
				temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
			}
		}
		temp = pivot;
		arr[end] = arr[pIndex];
		arr[pIndex] = temp;
		sortArray(arr, start, pIndex - 1);
		sortArray(arr, pIndex + 1, end);
	}
	
	private void getTwoNumbers(int arr[]) {
		int sum, min = Integer.MAX_VALUE, fNum = 0, sNum = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				sum = arr[i] + arr[j];
				if (sum < 0) {
					sum = sum * -1;
				}
				if (sum < min) {
					min = sum;
					fNum = arr[i];
					sNum = arr[j];
				}
			}
		}
		System.out.println(fNum + " " + sNum);
	}
}