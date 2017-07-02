package com.dhakre.rohit.practice.datastructure;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 5, 3, 8, -2, -1, 9};
		SelectionSort s = new SelectionSort();
		s.sort(arr);
		s.printArray(arr);
	}
	
	private void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++)  {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
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
