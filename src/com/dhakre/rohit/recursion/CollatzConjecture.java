package com.dhakre.rohit.recursion;

public class CollatzConjecture {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(new CollatzConjecture().isTrue(n) == 1 ? true : false);
	}

	public int isTrue(int n) {
		if (n == 1) {
			return n;
		}
		if (n % 2 == 0) {
			n = n / 2;
		} else {
			n = 3*n + 1;
		}
		return isTrue(n);
	}

}
