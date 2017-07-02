package com.dhakre.rohit.practice.random;

public class ReverseString {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("1234567890");
		int i = 0;
		for (int j = str.length() - 1; j > i; j--) {
			char c = str.charAt(i);
			char cnew = str.charAt(j);
			str.setCharAt(i, cnew);
			str.setCharAt(j, c);
			i++;
		}
		System.out.println(str);
	}

}
