package com.dhakre.rohit.practice.geeksforgeeks;

public class LeadersInArray {

	public static void main(String[] args) {
		int arr[] = { 44, 44, 16, 63, 41, 67, 81, 23, 88, 35, 45, 75 };
		LeadersInArray l = new LeadersInArray();
		l.getLeaders(arr);
	}
	
	private void getLeaders(int arr[]) {
		int j;
		for (int i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] <= arr[j]) {
					break;
				}
			}
			if (j == arr.length) {
				System.out.println(arr[i]);
			}
		}
		
	}
}
