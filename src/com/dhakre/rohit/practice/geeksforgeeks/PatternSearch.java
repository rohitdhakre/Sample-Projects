package com.dhakre.rohit.practice.geeksforgeeks;

public class PatternSearch {

	public static void main(String[] args) {
		String s = ("abcxabcdabxabcdabcdabcy");
		String p = ("abcdabcy");
		PatternSearch a = new PatternSearch();
		System.out.println(a.getResult(s, p) ? "found" : "not found");
	}

	private Boolean getResult(String s, String p) {
		char[] ch_s = s.toCharArray();
		char[] ch_p = p.toCharArray();
		int i = ch_s.length - 1;
		int j = ch_p.length - 1;
		while (i >= 0) {
			if (ch_s[i] == ch_p[j]) {
				i--;
				j--;
				if (j < 0) {
					return true;
				}
			}
			else {
			    if (ch_s[i] == ch_p[ch_p.length - 1]) {
				    j = ch_p.length - 1;
			    }
    			else {
    			    i--;
    			    j = ch_p.length - 1;
    			}
			}
		}
		return false;
	}

}
