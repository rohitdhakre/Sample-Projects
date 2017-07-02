package com.dhakre.rohit.algorithm.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 45, 3, 324, -34, -65, 8, 32, 3, -5, -45, 0 };
		InsertionSort i = new InsertionSort();
		i.display(arr);
		i.insertionSort(arr);
		i.display(arr);
	}
	
	public void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
				else {
					break;
				}
			}
		}
	}
	
	public void display(int[] arr) {
		for (int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
	
}
