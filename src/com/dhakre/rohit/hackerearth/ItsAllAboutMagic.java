package com.dhakre.rohit.hackerearth;

import java.util.Scanner;

public class ItsAllAboutMagic {
	public static void main(String args[]) throws Exception {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		long[] arr = new long[91];
		long a = 0;
		long b = 1;
		for (int i = 0; i <= 90; i++) {
			arr[i] = a;
			long temp = a;
			a = b;
			b += temp;
		}
		while (t-- > 0) {
			int m = scan.nextInt();
			System.out.println(arr[m - 1] + " " + arr[m]);
		}
		scan.close();
	}
}
