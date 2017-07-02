package com.dhakre.rohit.practice.datastructure;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 9, 2, 5, 1, -5, 3, 7, -1 };
		InsertionSort i = new InsertionSort();
		i.sort(arr);
		i.printArray(arr);
	}
	
	private void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				} else {
					break;
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
