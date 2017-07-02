package com.dhakre.rohit.mathematics;

public class CheckPrime {

	public static void main(String[] args) {
		int n = 503;
		if (n < 2) {
			System.out.println("Not a prime number");
			return;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.println("Not a prime number");
				return;
			}
		}
		System.out.println("Prime number");
	}

}
