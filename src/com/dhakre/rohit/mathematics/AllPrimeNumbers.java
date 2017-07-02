package com.dhakre.rohit.mathematics;

//Sieve of Eratosthenes
public class AllPrimeNumbers {

	public static void main(String[] args) {
		int n = 1000;
		int[] arr = new int[n + 1];
		for (int i = 2; i <= n; i++) {
			arr[i] = 1;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (arr[i] == 1) {
				for (int j = 2; j * i <= n; j++) {
					arr[i * j] = 0;
				}
			}
		}
		for (int i = 2; i <= n; i++) {
			if (arr[i] == 1) {
				System.out.print(i + " ");
			}
		}
	}

}
