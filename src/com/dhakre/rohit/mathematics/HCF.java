package com.dhakre.rohit.mathematics;

public class HCF {

	public static void main(String[] args) {
		int[] n = {4, 8, 16, 28};	// from 1 to Max
		int gcd = n[0];
		for (int i = 1; i < n.length; i++) {
			gcd = getHCF(gcd, n[i]);
		}
		System.out.println(gcd);

	}
	
	public static int getHCF(int a, int b) {
		int min = Math.min(a, b);
		int result = 1;
		for (int i = 2; i <= min; i++) {
			if (a <= 1 || b <= 1) {
				return result;
			}
			if (a % i == 0 && b % i == 0) {
				result = result * i;
				a = a / i;
				b = b / i;
				i--;
			}
		}
		return result;
	}

}
