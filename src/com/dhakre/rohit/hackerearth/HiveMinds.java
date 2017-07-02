package com.dhakre.rohit.hackerearth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class HiveMinds {
	public static void main(String args[]) throws Exception {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t-- > 0) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			int[] array = new int[n];
			for (int i = 0; i < array.length; i++) {
				array[i] = scan.nextInt();
			}
			System.out.println(findingMinimumSumSubarray(array, k));
		}
		scan.close();
	}

	public static int findingMinimumSumSubarray(int[] arr, int k) {
		int n = arr.length;
		int res = arr[0];
		for (int l = 0; l < n; l++) {
			for (int r = l; r < n; r++) {
				List<Integer> a = new ArrayList<Integer>();
				List<Integer> b = new ArrayList<Integer>();
				int temp = 0;
				for (int i = 0; i < n; i++) {
					if (i >= l && i <= r) {
						a.add(arr[i]);
						temp += arr[i];
					} else {
						b.add(arr[i]);
					}
				}
				Collections.sort(a);
				Collections.sort(b);
				Collections.reverse(b);
				res = Math.min(res, temp);
				for (int t = 1; t <= k; t++) {
					if (t > a.size() || t > b.size()) {
						break;
					}
					temp -= a.get(a.size() - t);
					temp += b.get(b.size() - t);
					res = Math.min(res, temp);
				}
			}
		}
		return res;
	}
}