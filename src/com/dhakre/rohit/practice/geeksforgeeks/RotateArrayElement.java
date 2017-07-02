package com.dhakre.rohit.practice.geeksforgeeks;

public class RotateArrayElement {

	public static void main(String[] args) {
		RotateArrayElement r = new RotateArrayElement();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = 3;
		r.rotate(arr, 0, n - 1);
		r.rotate(arr, n, arr.length - 1);
		r.rotate(arr, 0, arr.length - 1);
		for (int data : arr) {
			System.out.println(data);
		}
	}
	
	private void rotate(int arr[], int start, int end) {
		while (start < end) {
			int temp;
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
