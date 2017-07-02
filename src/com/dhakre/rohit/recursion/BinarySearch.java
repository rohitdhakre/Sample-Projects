package com.dhakre.rohit.recursion;

public class BinarySearch {

	public static void main(String[] args) {
		// Array must me sorted for binary search
		int[] arr = { 2, 3, 5, 6, 8, 9, 12, 14, 15, 17, 18, 24, 26, 27, 28 };
		BinarySearch b = new BinarySearch();
		b.searchIndex(arr, 0, arr.length - 1, 18);
	}

	public void searchIndex(int[] arr, int start, int end, int num) {
		int mid = (start + end) / 2;
		if (start > end) {
			System.out.println("Array doesn't contain provided number");
			return;
		}
		if (arr[mid] == num) {
			System.out.println(mid);
			return;
		} else if (arr[mid] > num) {
			searchIndex(arr, start, mid - 1, num);
		} else {
			searchIndex(arr, mid + 1, end, num);
		}
	}

}
