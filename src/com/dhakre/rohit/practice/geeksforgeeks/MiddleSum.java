package com.dhakre.rohit.practice.geeksforgeeks;

public class MiddleSum {

	public static void main(String[] args) {
		int arr1[] = { 1, 7, 9, 10 };
		int arr2[] = { 2, 3, 7, 9 };
		MiddleSum m = new MiddleSum();
		int temp[] = new int[arr1.length + 1];
		System.out.println(m.sum(arr1, arr2, temp));
	}
	
	private int sum(int arr1[], int arr2[], int temp[]) {
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < temp.length) {
			if (arr1[j] < arr2[k]) {
				temp[i] = arr1[j];
				j++;
			}
			else {
				temp[i] = arr2[k];
				k++;
			}
			i++;
		}
		return (temp[temp.length - 1] + temp[temp.length - 2]);
	}

}
