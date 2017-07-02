package com.dhakre.rohit.demo;

public class NonDivisibleSubset {

	public static void main(String[] args) {
		int n = 4;
		int k = 3;
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] cnts = new int[k];
		for (int i = 0; i < k; i++) {
			cnts[i] = 0;
		}
		for (int i = 0; i < n; i++) {
			cnts[arr[i] % k]++;
		}
		int cnt = cnts[0] < 1 ? cnts[0] : 1;
		for (int i = 1; i < k / 2 + 1; i++) {
			if (i != k - i) {
				cnt += cnts[i] > cnts[k - i] ? cnts[i] : cnts[k - i];
			}
		}
		if (k % 2 == 0) {
			cnt++;
		}
		System.out.println(cnt);
	}

}
