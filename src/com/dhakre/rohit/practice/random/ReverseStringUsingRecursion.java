package com.dhakre.rohit.practice.random;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		ReverseStringUsingRecursion obj = new ReverseStringUsingRecursion();
		String str = "123456789";
		System.out.println("Reverse of \'" + str + "\' is \'" + obj.reverse(str) + "\'");
	}
	
	public String reverse(String str) {
		if ((str == null) || (str.length() <= 1))
			return str;
		return reverse(str.substring(1)) + str.charAt(0);
	}

}