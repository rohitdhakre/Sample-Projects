package com.dhakre.rohit.mathematics;

public class SortedArrayRotation {

	public static void main(String[] args) {
		int[] arr = { 2, 12, 13, 14, 15, 17, 18, 19, 20, 0, 1 };
		SortedArrayRotation s = new SortedArrayRotation();
		System.out.println("Sorted array is rotated - " + s.numberOfRotation(arr) + " times");
	}

	public int numberOfRotation(int[] arr) {
		int l = 0;
		int r = arr.length - 1;
		while (l <= r) {
			if (arr[l] < arr[r]) {
				return l;
			}
			int mid = (l + r) / 2;
			int next = (mid + 1) % arr.length;
			int prev = (mid + arr.length - 1) % arr.length;
			if (arr[mid] < arr[next] && arr[mid] < arr[prev]) {
				return mid;
			} else if (arr[mid] < arr[r]) {
				r = mid - 1;
			} else if (arr[mid] > arr[l]) {
				l = mid + 1;
			}
		}
		return -1;
	}

}
