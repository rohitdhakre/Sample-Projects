package com.dhakre.rohit.mathematics;

public class SearchElementInSortedCircular {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 7, 1, 2 };
		int num = 6;
		SearchElementInSortedCircular c = new SearchElementInSortedCircular();
		int index = c.searchElement(arr, num);
		if (index == -1) {
			System.out.println("No element found");
		} else {
			System.out.println("Found at index - " + index);
		}
	}

	public int searchElement(int[] arr, int num) {
		int l = 0;
		int r = arr.length - 1;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (arr[mid] == num) {
				return mid;
			}
			if (arr[mid] <= arr[r]) {
				if (num > arr[mid] && num <= arr[r]) {
					l = mid + 1;
				} else {
					r = mid - 1;
				}
			} else {
				if (num >= arr[l] && num < arr[mid]) {
					r = mid - 1;
				} else {
					l = mid + 1;
				}
			}
		}
		return -1;
	}

}
