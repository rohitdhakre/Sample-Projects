package com.dhakre.rohit.demo;

class Test {
	int s;

	public Test(int s) {
		super();
		this.s = s;
	}

}

public class MethodDemo {

	public static void main(String[] args) {
		int a = 10;
		Test b = new Test(11);
		for (String string : args) {
			System.out.println(string);
		}
		int[] x = { 1, 2, 3 };
		methodCall(a, b, x);
		System.out.println(a + " " + b.s + " " + x[0]);
	}

	static void methodCall(int a, Test b, int[] x) {
		a = 11;
		b.s = 12;
		x[0] = 10;
		x[1] = 56;
	}

}
