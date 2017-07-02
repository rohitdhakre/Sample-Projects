package com.dhakre.rohit.algorithm.sorting;

public class HeapSortDecreasing {

	public static void main(String[] args) {
		int arr[] = { 12, 3, 4, 1, 43, 13, 53, 11, 18, 6 };
		HeapSortDecreasing h = new HeapSortDecreasing();
		h.printArray(arr);
		h.heapify(arr);
		h.printArray(arr);
		h.heapSort(arr);
		h.printArray(arr);
	}

	public void heapify(int[] arr) {
		int p = (arr.length) / 2;
		heapify(arr, p);
	}

	public void heapify(int[] arr, int p) {
		if (p < 1) {
			return;
		}
		heapifyProcess(arr, arr.length, p);
		heapify(arr, p - 1);
	}

	public void heapSort(int[] arr) {
		heapSort(arr, arr.length);
	}

	public void heapSort(int[] arr, int size) {
		if (size < 1) {
			return;
		}
		int temp = arr[size - 1];
		arr[size - 1] = arr[0];
		arr[0] = temp;
		heapifyProcess(arr, size - 1, 1);
		heapSort(arr, size - 1);
	}

	public void heapifyProcess(int[] arr, int size, int i) {
		int l = 2 * i;
		if (l > size) {
			return;
		}
		if (l + 1 <= size) {
			int r = l + 1;
			if (arr[l - 1] < arr[i - 1] || arr[r - 1] < arr[i - 1]) {
				if (arr[l - 1] < arr[r - 1]) {
					int temp = arr[l - 1];
					arr[l - 1] = arr[i - 1];
					arr[i - 1] = temp;
					heapifyProcess(arr, size, l);
				} else {
					int temp = arr[r - 1];
					arr[r - 1] = arr[i - 1];
					arr[i - 1] = temp;
					heapifyProcess(arr, size, r);
				}
			}
		} else if (arr[l - 1] < arr[i - 1]) {
			int temp = arr[l - 1];
			arr[l - 1] = arr[i - 1];
			arr[i - 1] = temp;
			heapifyProcess(arr, size, l);
		}
	}

	public void printArray(int[] arr) {
		for (int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

}