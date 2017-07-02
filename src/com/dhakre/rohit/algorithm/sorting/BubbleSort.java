package com.dhakre.rohit.algorithm.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 45, 3, 324, -34, -65, 8, 32, 3, -5, -45, 0 };
		BubbleSort b = new BubbleSort();
		b.display(arr);
		b.bubbleSort(arr);
		b.display(arr);
	}

	public void bubbleSort(int arr[]) {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
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
