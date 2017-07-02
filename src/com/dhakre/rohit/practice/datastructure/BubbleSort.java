package com.dhakre.rohit.practice.datastructure;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 5, 7, -3, -2, 2 };
		BubbleSort b = new BubbleSort();
		b.sort(arr);
		b.printArray(arr);
	}
	
	private void sort(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	private void printArray(int[] arr) {
		for (int data : arr) {
			System.out.print(data + " ");
		}
	}

}
