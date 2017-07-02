package com.dhakre.rohit.practice.random;

public class ReversePrint {

	public static void main(String[] args) {
		String num = "54125646278452854256238572";
		char[] ch = num.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}
}