package com.dhakre.rohit.mathematics;

public class EuclidGCD {

	public static void main(String[] args) {
		int a = 1000;
		int b = 256;
		int dividend = (a > b) ? a : b;
		int divisor = (a < b) ? a : b;
		int remainder;
		while (divisor != 0) {
			remainder = dividend % divisor;
			dividend = divisor;
			divisor = remainder;
		}
		System.out.println(dividend);
	}

}
