package com.dhakre.rohit.mathematics;

public class LCM {

	public static void main(String[] args) {
		int[] n = {6, 8, 12, 26};
		int lcm = n[0];
		for (int i = 1; i < n.length; i++) {
			lcm = getLCM(lcm, n[i]);
		}
		System.out.println(lcm);
	}
	
	public static int getLCM(int a, int b) {
		int result = 1;
		int i = 2;
		while (a > 1 || b > 1) {
			if (a % i == 0 || b % i == 0) {
				if (a % i == 0) {
					a = a / i;
				}
				if (b % i == 0) {
					b = b / i;
				}
				result *= i;
			}
			else {
				i++;
			}
		}
		return result;
	}

}
