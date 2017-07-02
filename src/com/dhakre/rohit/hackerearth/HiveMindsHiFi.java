package com.dhakre.rohit.hackerearth;

import java.util.Scanner;

public class HiveMindsHiFi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result = new HiveMindsHiFi().factorsOfNumber(n);
		if (result == 0) {
			System.out.println("NIL");
		} else {
			System.out.println(result);
		}
		scan.close();
	}

	// Store the factors of a number in increasing order
	private int factorsOfNumber(int n) {
		int factors = countFactors(n);
		int sqrt = (int) Math.sqrt(n);
		int[] fact = new int[factors];
		int f = 0;
		int b = factors - 1;
		for (int i = 1; i <= sqrt; i++) {
			if (n % i == 0) {
				fact[f++] = i;
				if (i != Math.sqrt(n)) {
					fact[b--] = n / i;
				}
			}
		}
		for (int i = 0; i < fact.length; i++) {
			System.out.print(fact[i] + " ");
		}
		System.out.println();
		return longestConsecutiveFactors(n, fact);
	}

	// Count the number of factors of a number
	private int countFactors(int n) {
		int sum = 1;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				int count = 0;
				while (n % i == 0) {
					n /= i;
					count++;
				}
				sum *= (count + 1);
			}
		}
		// If number is a prime number
		if (n != 1) {
			sum *= 2;
		}
		return sum;
	}

	// Find the multiple of longest consecutive factors is equal to given number or not
	private int longestConsecutiveFactors(int n, int[] fact) {
		int count = 1;
		for (int i = 0; i < fact.length - 1; i++) {
			count = 1;
			if (fact[i + 1] - fact[i] == 1) {
				int num = fact[i];
				for (int j = i; j < fact.length - 1; j++) {
					if (fact[j + 1] - fact[j] == 1) {
						num *= fact[j + 1];
						count++;
						if (num == n) {
							return count;
						}
					}
					else {
						break;
					}
				}
			}
		}
		return 0;
	}

}
