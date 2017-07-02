package com.dhakre.rohit.demo;

import java.util.Scanner;

class TestMaths {
	public static void main(String args[]) throws Exception {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int size = 10000000;
		int[] arr = new int[size + 1];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i <= size; i++) {
			if (arr[i] == 0) {
				int j = 2;
				while (i * j <= size) {
					arr[i * j] = 1;
					j++;
				}
			}
		}
		while (t-- > 0) {
			int num = scan.nextInt();
			System.out.println(new TestMaths().specialSum(num, arr));
		}
		scan.close();
	}

	public long specialSum(int num, int[] arr) {
		long sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum += func(i, arr);
			}
		}
		return sum;
	}

	public long func(int num, int[] arr) {
		long sum = 1;
		if (arr[num] == 0) {
			for (int i = 2; i < num; i++) {
				sum++;
			}
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i != 0) {
					sum++;
				}
			}
		}
		return sum;
	}
}