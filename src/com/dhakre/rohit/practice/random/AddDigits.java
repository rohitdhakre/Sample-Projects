package com.dhakre.rohit.practice.random;

public class AddDigits {

	public static void main(String[] args) {

		String num = "123456234567892635723652853275629572836523875625782365285658543268754632845327856378457";
		char ch[] = num.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			count = count + Character.getNumericValue(ch[i]);
		}
		System.out.println(count);
	}
}
