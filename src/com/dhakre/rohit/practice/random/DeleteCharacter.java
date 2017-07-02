package com.dhakre.rohit.practice.random;

public class DeleteCharacter {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Accomodation");
		System.out.println(sb.length());
		sb.deleteCharAt(3);
		System.out.println(sb);
		System.out.println(sb.length());
	}
}
