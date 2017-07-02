package com.dhakre.rohit.practice.geeksforgeeks;

public class SearchElement {

	public static void main(String[] args) {
		int arr[] = { 5, 6, 7, 8, 9, 1, 2, 3, 4 };
		int size = arr.length;
		int n = 4;
		SearchElement s = new SearchElement();
		System.out.println(s.searchArray(arr, size, n));
	}
	
	private int searchArray(int arr[], int size, int n) {
	    for (int i = 0; i < size; i++) {
	        if (arr[i] == n) {
	            return i;
	        }
	    }
	    return -1;
	}

}
