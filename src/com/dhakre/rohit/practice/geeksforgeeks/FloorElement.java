package com.dhakre.rohit.practice.geeksforgeeks;

public class FloorElement {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 7};
		int x = 9;
		FloorElement f = new FloorElement();
		System.out.println(f.getElement(arr, x));
	}
	
	private int getElement(int arr[], int x) {
		int i = 0;
		while (i < arr.length) {
			if (arr[i] < x) {
				i++;
			}
			else if (arr[i] > x) {
				i = i - 1;
				break;
			}
			else {
				try {
					if (arr[i] == arr[i + 1]) {
						i++;
					}
					else {
						break;
					}
				} catch (Exception e) {
					break;
				}
			}
		}
		if (i == arr.length) {
			return i - 1;
		}
		return i;
	}

}
