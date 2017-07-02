package com.dhakre.rohit.algorithm.sorting;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = { 45, 3, 324, -34, -65, 8, 32, 3, -5, -45, 0 };
		QuickSort q = new QuickSort();
		q.display(arr);
		q.quickSort(arr);
		q.display(arr);
	}
	
	public void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}
	
	public void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int pIndex = partition(arr, start, end);
			quickSort(arr, start, pIndex - 1);
			quickSort(arr, pIndex + 1, end);
		}
	}
	
	public int partition(int[] arr, int start, int end) {
		int pIndex = start;
		int pivot = arr[end];
		for (int i = start; i < end; i++) {
			if (arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
			}
		}
		int temp = pivot;
		arr[end] = arr[pIndex];
		arr[pIndex] = temp;
		return pIndex;
	}
	
	public void display(int[] arr) {
		for (int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
	
}
