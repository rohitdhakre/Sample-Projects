package com.dhakre.rohit.practice.geeksforgeeks;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 6, 8, 2 };
		ReverseArray r = new ReverseArray();
		r.reverse(arr);
	}
	
	private void reverse(int arr[]) {
		int i = 0;
		int j = arr.length - 1;
		int temp;
		while (i < j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		for (j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}

}
