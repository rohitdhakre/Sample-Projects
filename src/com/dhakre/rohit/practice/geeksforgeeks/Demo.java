package com.dhakre.rohit.practice.geeksforgeeks;

class Demo {
	public static void main(String args[]) {
		try {
			try {
				System.out.println("going to divide");
				@SuppressWarnings("unused")
				int b = 39 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}

			try {
				int a[] = new int[5];
				a[5] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			@SuppressWarnings("unused")
			int c = 50 / 0;
			System.out.println("other statement");
		} catch (Exception e) {
			System.out.println("handeled");
		} finally {
			System.out.println("Must execute either exception handled or not");
		}

		System.out.println("normal flow..");
	}
}