package com.dhakre.rohit.mathematics;

public class ElementCountSortedArray {

	public static void main(String[] args) {
		ElementCountSortedArray e = new ElementCountSortedArray();
		int[] arr = { 1, 1, 2, 2, 3, 3, 3, 3, 4, 5, 6, 6, 6, 6, 7, 7, 8, 8, 9 };
		int num = 6;
		int firstIndex = e.binarySearch(arr, num, true);
		if (firstIndex == -1) {
			System.out.println("Doesn't contain element");
		} else {
			int lastIndex = e.binarySearch(arr, num, false);
			System.out.println(lastIndex - firstIndex + 1);
		}
	}

	public int binarySearch(int[] arr, int num, boolean findFirst) {
		int l = 0;
		int r = arr.length - 1;
		int result = -1;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (arr[mid] > num) {
				r = mid - 1;
			} else if (arr[mid] < num) {
				l = mid + 1;
			} else {
				result = mid;
				if (findFirst) {
					r = mid - 1;
				} else {
					l = mid + 1;
				}
			}
		}
		return result;
	}

}
