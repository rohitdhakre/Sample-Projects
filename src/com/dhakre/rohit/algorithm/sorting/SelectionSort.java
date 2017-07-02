package com.dhakre.rohit.algorithm.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 45, 3, 324, -34, -65, 8, 32, 3, -5, -45, 0 };
		SelectionSort s = new SelectionSort();
		s.display(arr);
		s.selectionSort(arr);
		s.display(arr);
	}

	public void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
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
