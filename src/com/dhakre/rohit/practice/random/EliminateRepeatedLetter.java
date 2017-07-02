package com.dhakre.rohit.practice.random;

public class EliminateRepeatedLetter {

	public static void main(String[] args) {
		String letter = "rohitdhakre";
		new EliminateRepeatedLetter().getLetter(letter);
	}

	public void getLetter(String letter) {
		char[] ch = letter.toCharArray();
		System.out.print(ch[0]);
		for (int i = 1; i < ch.length; i++) {
			int count = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (ch[i] == ch[j]) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.print(ch[i]);
			}
		}
	}

}
