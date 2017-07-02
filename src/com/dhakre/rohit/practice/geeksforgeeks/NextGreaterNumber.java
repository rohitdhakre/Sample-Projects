package com.dhakre.rohit.practice.geeksforgeeks;

public class NextGreaterNumber {

	public static void main(String[] args) {
		int number = 862376;
		int temp = number;
		int count = 0;
		NextGreaterNumber n = new NextGreaterNumber();
		while (temp > 0) {
			temp = temp / 10;
			count++;
		}
		int arr[] = new int[count];
		while (count > 0) {
			count--;
			arr[count] = number % 10;
			number = number / 10;
		}
		n.getNumber(arr);
	}

	private void getNumber(int arr[]) {
		int temp;
		int i;
		int n = 0;
		if (arr.length == 1) {
			System.out.println("not possible");
			return;
		}
		for (i = arr.length - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				n = arr[i];
				for (int j = i; j < arr.length - 1; j++) {
					for (int k = j + 1; k < arr.length; k++) {
						if (arr[k] < arr[j]) {
							temp = arr[j];
							arr[j] = arr[k];
							arr[k] = temp;
						}
					}
				}
				break;
			}
			if (i == 0) {
				System.out.println("not possible");
				return;
			}
		}
		if (i < arr.length - 1) {
			int j = i;
			while (j < arr.length) {
				if (arr[j] > n) {
					while (j > i) {
						temp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = temp;
						j--;
					}
					break;
				}
				j++;
			}
		}
		for (int y = 0; y < arr.length; y++) {
			System.out.print(arr[y]);
		}
	}
}