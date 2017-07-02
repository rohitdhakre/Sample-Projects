package com.dhakre.rohit.mathematics;

public class Test {

	public static void main(String[] args) {

		Integer[] i = { 1, 2, 3, 4, 5, 6 };
		Float[] f = { 1.2f, 2.5f, 3.3f, 4.6f, 5.9f, 6.7f };
		Character[] c = { 'A', 'B', 'C', 'D', 'E' };

		Test.printArray(i);
		Test.printArray(f);
		Test.printArray(c);

	}

	public static <T> void printArray(T[] arr) {
		System.out.print("Printing Array : ");
		for (T data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

}
