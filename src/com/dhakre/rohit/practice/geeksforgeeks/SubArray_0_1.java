package com.dhakre.rohit.practice.geeksforgeeks;

public class SubArray_0_1 {

	public static void main(String[] args) {
		SubArray_0_1 s = new SubArray_0_1();
		int arr[] = { 1, 0, 1, 1, 1, 0, 0, 1, 1 };
		System.out.println(s.getArray(arr));
	}
	
	private int getArray(int arr[]) {
		int count_0, count_1, maxCount = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			count_0 = 0;
			count_1 = 0;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] == 0) {
					count_0++;
				}
				else {
					count_1++;
				}
				if (count_0 == count_1) {
					if (maxCount < count_0) {
						maxCount = count_0;
					}
				}
			}
		}
		return maxCount * 2;
	}

}