package com.dhakre.rohit.practice.datastructure;

public class MergeSort {

	public static void main(String []args) {
		int arr[] = { 2,24,2,5,96,3,5,9,53,-3454,8,5,3,43,34754,7338 };
		MergeSort m = new MergeSort();
		m.sort(arr);
		m.printArray(arr);
	}

	private void sort(int[] arr) {
		split(arr, 0, arr.length);
	}
	
	private void split(int[] arr, int start, int end) {
		if (end - start <= 1) {
			return;
		}
		int mid = (start + end) / 2;
		split(arr, start, mid);
		split(arr, mid, end);
		merge(arr, start, mid, end);
	}
	
	private void merge(int[] arr, int start, int mid, int end) {
		int i = start;
		int j = mid;
		int[] temp = new int[end - start];
		int k = 0;
		while (i < mid && j < end) {
			if (arr[i] < arr[j]) {
				temp[k] = arr[i];
				k++;
				i++;
			} else if (arr[j] < arr[i]) {
				temp[k] = arr[j];
				k++;
				j++;
			} else {
				temp[k] = temp[k+1] = arr[i];
				k+=2;
				i++;
				j++;
			}
		}
		while (i < mid) {
			temp[k] = arr[i];
			k++;
			i++;
		}
		while (j < end) {
			temp[k] = arr[j];
			k++;
			j++;
		}
		int z = 0;
		for (int x = start; x < end; x++,z++) {
			arr[x] = temp[z];
		}
	}

	private void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}	

}
