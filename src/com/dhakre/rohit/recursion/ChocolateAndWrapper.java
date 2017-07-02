package com.dhakre.rohit.recursion;

public class ChocolateAndWrapper {

	public static void main(String[] args) {
		int m = 21;
		int p = 3;
		int w = 2;
		if (w <= 1) {
			System.out.println("wrapper must be greater than 1");
			return;
		}
		m /= p;
		System.out.println(m + new ChocolateAndWrapper().totalChocolate(m, w));
	}

	public int totalChocolate(int m, int w) {
		if (m <= 1) {
			return 0;
		}
		return m / w + totalChocolate(m / w + ((m > w) ? m % w : 0), w);
	}

}
