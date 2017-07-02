package com.dhakre.rohit.practice.geeksforgeeks;

public class SwapElement {

	public static void main(String[] args) {
		int arr[] = { 4, 9, 5, 8, 2, 1, 0 };
		int element = 5;
		SwapElement s = new SwapElement();
		s.swap(arr, element);
	}
	
	private void swap(int arr[], int element) {
		int i = 0;
		int j = arr.length - 1;
		while(element > 1) {
			i++;
			j--;
			element--;
		}
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		for (j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}

}
