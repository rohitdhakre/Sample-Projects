package com.dhakre.rohit.demo;

public class DemoRegex {

	public static void main(String[] args) {
		String s = "rohithakre@gmail.com";
		if (s.matches("[A-Za-z@.]")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
