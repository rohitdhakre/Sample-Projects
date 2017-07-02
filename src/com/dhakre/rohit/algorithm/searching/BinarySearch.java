package com.dhakre.rohit.algorithm.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 8, 22, 34, 67, 89, 96, 221, 443, 665 };
		BinarySearch bs = new BinarySearch();
		bs.binarySearch(arr, 221);
	}

	public void binarySearch(int arr[], int num) {
		int index = getIndex(arr, num, 0, arr.length - 1);
		if (index != -1) {
			System.out.println("Element found at index - " + index);
		} else {
			System.out.println("Element not found");
		}
	}

	public int getIndex(int[] arr, int num, int start, int end) {
		int mid = (start + end) / 2;
		int index = 0;
		if (arr[mid] == num) {
			return mid;
		}
		if (start > end) {
			return -1;
		} else if (arr[mid] < num) {
			index = getIndex(arr, num, mid + 1, end);
		} else {
			index = getIndex(arr, num, start, mid - 1);
		}
		return index;
	}

}
