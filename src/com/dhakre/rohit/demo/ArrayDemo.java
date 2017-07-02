package com.dhakre.rohit.demo;

public class ArrayDemo {

	public static void main(String[] args) {
		int res = 0;
		for (int i = 1; i < 9; i++) {
			res = 10 * res + i;
		}
		System.out.println(res);
		System.err.println(res);
	}

}
