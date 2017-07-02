package com.dhakre.rohit.demo;

public class MoveSphereOutOfLine {

	public static void main(String[] args) {
		int len = 11;
		int n = 1;
		if (n == 0) {
			System.out.println(0 + " " + 0);
			return;
		}
		int[] arr = { 5 };
		int l = 0;
		int r = n - 1;
		int min = 0;
		int left = 0;
		int right = 0;
		int resMin = 0;
		while (l <= r) {
			left = (arr[l] < len - arr[l] ? arr[l] : len - arr[l]);
			right = (arr[r] < len - arr[r] ? arr[r] : len - arr[r]);
			resMin = (left > right ? left : right);
			if (min < resMin) {
				min = resMin;
			}
			l++;
			r--;
		}
		left = (arr[0] > len - arr[0] ? arr[0] : len - arr[0]);
		right = (arr[n - 1] > len - arr[n - 1] ? arr[n - 1] : len - arr[n - 1]);
		int max = left > right ? left : right;
		System.out.println(min);
		System.out.println(max);
	}

}
