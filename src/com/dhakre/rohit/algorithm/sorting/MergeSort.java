package com.dhakre.rohit.algorithm.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 45, 3, 324, -34, -65, 8, 32, 3, -5, -45, 0 };
		MergeSort m = new MergeSort();
		m.display(arr);
		m.mergeSort(arr);
		m.display(arr);
	}

	public void mergeSort(int[] arr) {
		split(arr, 0, arr.length - 1);
	}

	public void split(int[] arr, int start, int end) {
		int mid = (start + end) / 2;
		if (start < end) {
			split(arr, start, mid);
			split(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	}

	public void merge(int[] arr, int start, int mid, int end) {
		int i = start;
		int m = mid + 1;
		int j = mid + 1;
		int n = end + 1;
		int k = 0;
		int[] temp = new int[n - i];
		while (i < m && j < n) {
			if (arr[i] < arr[j]) {
				temp[k] = arr[i];
				k++;
				i++;
			} else if (arr[i] > arr[j]) {
				temp[k] = arr[j];
				k++;
				j++;
			} else {
				temp[k] = arr[i];
				temp[k + 1] = arr[j];
				k += 2;
				i++;
				j++;
			}
		}
		while (i < m) {
			temp[k] = arr[i];
			k++;
			i++;
		}
		while (j < n) {
			temp[k] = arr[j];
			k++;
			j++;
		}
		k = 0;
		for (int x = start; x <= end; x++, k++) {
			arr[x] = temp[k];
		}
	}

	public void display(int[] arr) {
		for (int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

}
