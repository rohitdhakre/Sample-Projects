package com.dhakre.rohit.generics;

public class UsingMethod {

	public static void main(String[] args) {

		Integer i[] = { 12, 43, 1, 45, 13, 5 };
		Float f[] = { 2.2f, 12.7f, 24.543f, 8.4532f, 2343.454f };
		Character c[] = { 'a', 'f', 'd', 'r', 't', 'u' };
		String s[] = { "the", "Loyal", "king", "seven", "red", "den", "pot" };
		printArray(i);
		printArray(f);
		printArray(c);
		printArray(s);
	}

	static <T> void printArray(T element[]) {
		for (T data : element) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

}
