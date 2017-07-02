package com.dhakre.rohit.practice.geeksforgeeks;

public class LongestPrefix {

	public static void main(String[] args) {
		String word[] = { "Sheepard", "Shell", "Shepherd", "Sheena", "Shawn" };
		LongestPrefix p = new LongestPrefix();
		System.out.println(p.getLongPrefix(word));
	}
	
	private String getLongPrefix(String word[]) {
		int i = 1;
		while (i < word.length) {
			char ch[] = word[0].toCharArray();
			char ch1[] = word[i].toCharArray();
			char res[] = new char[word[0].length()];
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] == ch1[j]) {
					res[j] = ch[j];
				}
				else {
					word[0] = String.valueOf(res);
					break;
				}
			}
			i++;
		}
		return word[0];
	}
	
}
