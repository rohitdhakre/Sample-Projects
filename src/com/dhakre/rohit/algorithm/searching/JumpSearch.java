package com.dhakre.rohit.algorithm.searching;

public class JumpSearch {

	public static void main(String[] args) {
		// Array elements must be in increasing order
		int[] arr = { 1, 2, 11, 15, 17, 32, 43, 64, 65, 78, 88, 93, 99, 100 };
		JumpSearch j = new JumpSearch();
		j.jumpSearch(arr, 100);
	}

	public void jumpSearch(int arr[], int num) {
		int index = getIndex(arr, num);
		if (index != -1) {
			System.out.println("Element found at index - " + index);
		} else {
			System.out.println("Element not found");
		}
	}

	public int getIndex(int[] arr, int num) {
		int step = (int) Math.floor(Math.sqrt(arr.length));
		int prev = 0;
		int next = 0;
		try {
			while (next < arr.length && arr[next] < num) {
				prev = next;
				next += step;
			}
			while (arr[prev] <= num && prev <= next) {
				if (arr[prev] == num) {
					return prev;
				}
				prev++;
			}
			return -1;
		} catch (Exception e) {
			return -1;
		}
	}

}
