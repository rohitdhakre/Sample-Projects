package com.dhakre.rohit.mathematics;

public class PrimeFactorization {

	public static void main(String[] args) {
		int n = 1022;
		if (n < 2) {
			System.out.println("No Prime Factorization");
			return;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				int count = 0;
				while (n % i == 0) {
					count++;
					n /= i;
				}
				System.out.print(i + "^" + count + ", ");
			}
		}
		if (n != 1) {
			System.out.print(n + "^" + 1);
		}
	}

}
