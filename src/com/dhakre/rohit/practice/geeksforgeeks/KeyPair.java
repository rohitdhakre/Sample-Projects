package com.dhakre.rohit.practice.geeksforgeeks;

public class KeyPair {
	
	public static void main(String[] args) {
		int arr[] = {1, 4, 5, 23, 11, 6};
		KeyPair k = new KeyPair();
		System.out.println(k.check(arr, 34) ? "Yes" : "No");
	}
	
	private Boolean check (int arr[], int num) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] + arr[j] == num) {
					return true;
				}
			}
		}
		return false;
	}

}
