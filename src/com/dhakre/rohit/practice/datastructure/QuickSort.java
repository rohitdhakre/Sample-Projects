package com.dhakre.rohit.practice.datastructure;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 1, 6, 8, 3, -3, -5 };
		QuickSort q = new QuickSort();
		q.sort(arr);
		q.printArray(arr);
	}

	private void sort(int[] arr) {
		sort(arr, 0, arr.length);
	}

	private void sort(int[] arr, int start, int end) {
		if (start < end - 1) {
			int partitionIndex = pIndex(arr, start, end);
			sort(arr, start, partitionIndex);
			sort(arr, partitionIndex, end);
		}
	}

	private int pIndex(int[] arr, int start, int end) {
		int pivot = arr[end - 1];
		int pIndex = start;
		for (int i = start; i < end; i++) {
			if (arr[i] < pivot) {
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
			}
		}
		arr[end - 1] = arr[pIndex];
		arr[pIndex] = pivot;
		return pIndex;
	}

	private void printArray(int[] arr) {
		for (int data : arr) {
			System.out.print(data + " ");
		}
	}

}
