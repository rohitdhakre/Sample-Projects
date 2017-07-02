package com.dhakre.rohit.mathematics;

public class RoundOff {

	public static void main(String[] args) {
		
		float num = 12.00000f;
		float dec = (num - (int)num);
		int a = (int)(dec * 10000);
		float x;
		if (a % 10 >= 5) {
			a = a / 10 + 1;
			x = (float)a / 1000;
			System.out.println((int)num + x);
		}
		else {
			a = a / 10;
			x = (float)a / 1000;
			System.out.println((int)num + x);
		}
	}
}