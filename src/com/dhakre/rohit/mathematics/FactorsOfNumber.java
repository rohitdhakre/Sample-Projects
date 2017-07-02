package com.dhakre.rohit.mathematics;

public class FactorsOfNumber {

	public static void main(String[] args) {
		int n = 1440;
		int sqrt = (int) Math.sqrt(n);
		int q = n;
		int sum = 1;
		for (int i = 2; i <= Math.sqrt(q); i++) {
			if (q % i == 0) {
				int count = 0;
				while (q % i == 0) {
					q /= i;
					count++;
				}
				sum *= (count + 1);
			}
		}
		
		if (q != 1) {
			sum *= 2;
		}
		System.out.println(sum);

		int[] arr = new int[sum];
		int f = 0;
		int b = arr.length - 1;
		for (int i = 1; i <= sqrt; i++) {
			if (n % i == 0) {
				arr[f++] = i;
				if (i != Math.sqrt(n)) {
					arr[b--] = n / i;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
